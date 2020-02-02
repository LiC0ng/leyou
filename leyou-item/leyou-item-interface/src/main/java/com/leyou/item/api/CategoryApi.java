package com.leyou.item.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("category")
public interface CategoryApi {

    /**
     * 根据多个id查询对应的种类名称
     *
     * @param ids
     * @return
     */
    @GetMapping
    public List<String> queryNamesByIdS(@RequestParam("ids") List<Long> ids);
}
