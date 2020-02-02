package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.*;

@RequestMapping("brand")
public interface BrandApi {

    /**
     * 根据id查询品牌信息
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id") Long id);
}
