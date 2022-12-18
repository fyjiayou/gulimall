package com.atguigu.gulimall.product.controller;

import com.atguigu.gulimall.common.utils.R;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/**
 * 商品三级分类
 *
 * @author fy
 * @email fystart@163.com
 * @date 2022-11-05 11:51:11
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 树形封装三级分类信息
     * @return
     */
    @GetMapping("/list/tree")
    public R tree(){
        List<CategoryEntity> list = categoryService.listWithTree();

        return R.ok().put("tree",list);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 批量修改
     */
    @PostMapping("/update/sort")
    public R updateBatch(@RequestBody List<CategoryEntity> categoryList){
        categoryService.updateBatchById(categoryList);

        return R.ok();
    }

    /**
     * 根据catIds批量删除分类信息
     *
     *   多个id值[1,2,3]
     *   json数组格式 <---> java的list集合
     *
     * @param catIds
     * @return
     */
    @PostMapping("/delete")
    public R delete(@RequestBody List<Long> catIds){
        categoryService.removeMenuByIds(catIds);

        return R.ok();
    }
}
