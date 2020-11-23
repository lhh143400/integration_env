package com.lhh.springboot.oauth.service;

import com.lhh.springboot.config.mybatis.PageRequestParams;
import com.lhh.springboot.config.mybatis.PageResult;
import com.lhh.springboot.oauth.pojo.SysUser;

/**
 * @author lhh
 * @Date 2019/10/26 15:30
 */
public interface SysUserService {

    /**
     * 分页查询
     *
     * @param vo 分页入参
     * @return
     */
    PageResult<SysUser> findByPage(PageRequestParams vo);
}
