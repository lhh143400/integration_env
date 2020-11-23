package com.lhh.springboot.oauth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhh.springboot.config.mybatis.PageRequestParams;
import com.lhh.springboot.config.mybatis.PageResult;
import com.lhh.springboot.oauth.dao.SysUserMapper;
import com.lhh.springboot.oauth.pojo.SysUser;
import com.lhh.springboot.oauth.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lhh
 * @Date 2019/10/26 15:31
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    /**
     * 分页查询
     *
     * @param vo 分页入参
     * @return
     */
    @Override
    public PageResult<SysUser> findByPage(PageRequestParams vo) {

        PageHelper.startPage(vo.getPage(), vo.getSize());
        List<SysUser> list = sysUserMapper.findPage();
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);

        return new PageResult<>(list, pageInfo);
    }
}
