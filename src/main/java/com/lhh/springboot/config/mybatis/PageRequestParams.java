package com.lhh.springboot.config.mybatis;

import lombok.Data;

/**
 * 分页请求参数
 *
 * @author lhh
 * @Date 2019/10/26 20:58
 */
@Data
public class PageRequestParams{

    /**
     * 页码，从1开始
     */
    private int page = 1;
    /**
     * 页面大小
     */
    private int size = 10;
    /**
     * 排序
     */
    private String orderBy;
}
