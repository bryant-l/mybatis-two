package com.works.bryant.mapper;

import com.works.bryant.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IProductMapper {
    /**
     * 添加商品
     */
    int addProduct(@Param("product") Product product);

    /**
     * 查询所有商品
     */
    List<Product> selectAll(@Param("status")int status);
}
