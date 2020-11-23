package com.lhh.springboot.oauth.dao;

import com.lhh.springboot.oauth.pojo.SysUser;

import java.util.List;


/**
 * ---------------------------
 * 用户管理 (SysUserMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-10-26 13:31:51
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface SysUserMapper {

	/**
	 * 添加用户管理
	 * @param record
	 * @return
	 */
    int add(SysUser record);

    /**
     * 删除用户管理
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改用户管理
     * @param record
     * @return
     */
    int update(SysUser record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    SysUser findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<SysUser> findPage();
    
}