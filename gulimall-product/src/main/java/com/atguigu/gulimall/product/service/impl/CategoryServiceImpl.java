package com.atguigu.gulimall.product.service.impl;

import com.atguigu.gulimall.common.utils.PageUtils;
import com.atguigu.gulimall.common.utils.Query;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //数据库中的全部分类
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);

        List<CategoryEntity> collect = categoryEntityList.stream()
                .filter(item -> item.getParentCid().equals(0L))
                .map(category -> {
                    category.setChildren(getChildren(categoryEntityList, category));
                    return category;
                }).sorted((c1, c2) -> {
                    return (c1.getSort() == null ? 0 : c1.getSort()) - (c2.getSort() == null ? 0 : c2.getSort());
                })
                .collect(Collectors.toList());
        return collect;
    }

    private List<CategoryEntity> getChildren(List<CategoryEntity> total, CategoryEntity categoryEntity) {
        return total.stream().filter(item -> item.getParentCid().equals(categoryEntity.getCatId()))
                .map(category -> {
                    category.setChildren(getChildren(total, category));
                    return category;
                })
                .sorted((c1, c2) -> {
                    return (c1.getSort() == null ? 0 : c1.getSort()) - (c2.getSort() == null ? 0 : c2.getSort());
                })
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> catIds) {
        //TODO 1.检查当前删除的菜单是否被别的地方引用
        baseMapper.deleteBatchIds(catIds);
    }
}
