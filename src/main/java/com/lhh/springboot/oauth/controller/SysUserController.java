package com.lhh.springboot.oauth.controller;

import com.alibaba.fastjson.JSON;
import com.lhh.springboot.config.mybatis.PageRequestParams;
import com.lhh.springboot.oauth.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhh
 * @Date 2019/10/26 15:29
 */
@RestController
@RequestMapping("/sys_user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "测试mybatis分页插件")
    @RequestMapping(value = "/findByPage",method = RequestMethod.POST)
    public String findByPage(PageRequestParams vo) {

        return JSON.toJSONString(sysUserService.findByPage(vo));
    }
}
