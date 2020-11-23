package com.lhh.springboot.config.mybatis;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页返回结果
 *
 * @author lhh
 * @Date 2019/10/26 20:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable{

    /**
     * 当页数据
     */
    private List<T> list;
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数--数据总条数
     */
    private Long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;



    public PageResult(List<T> list, PageInfo pageInfo){
        this.list=list;
        this.totalSize=pageInfo.getTotal();
        this.pageNum=pageInfo.getPageNum();
        this.pageSize=pageInfo.getPageSize();
        this.totalPages=pageInfo.getPages();
    }
}
