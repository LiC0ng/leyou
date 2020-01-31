package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<Brand> {
    /**
     * 添加分类和品牌的接口
     * @param cid
     * @param bid
     */
    @Insert("INSERT INTO tb_category_brand (category_id, brand_id) values (#{cid}, #{bid})")
    void insertCategoryAndBrand(@Param("cid") Long cid, @Param("bid") Long bid);

    /**
     * 根据cid查询品牌信息的接口
     * @param cid
     * @return
     */
    @Select("SELECT * FROM tb_brand a INNER JOIN tb_category_brand b on a.id = b.brand_id WHERE b.category_id = #{cid}")
    List<Brand> selectBrandsByCid(Long cid);
}
