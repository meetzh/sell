package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/** 类目
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/28 10:44
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
