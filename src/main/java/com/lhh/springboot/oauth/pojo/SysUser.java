package com.lhh.springboot.oauth.pojo;

import lombok.Data;

/**
 * ---------------------------
 * 用户管理 (SysUser)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-10-26 13:31:51
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Data
public class SysUser {

	/** 编号 */
	private Long id;
	/** 用户名 */
	private String name;
	/** 昵称 */
	private String nickName;
	/** 头像 */
	private String avatar;
	/** 密码 */
	private String password;
	/** 加密盐 */
	private String salt;
	/** 邮箱 */
	private String email;
	/** 手机号 */
	private String mobile;
	/** 状态  0：禁用   1：正常 */
	private Integer status;
	/** 机构ID */
	private Long deptId;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private java.util.Date createTime;
	/** 更新人 */
	private String lastUpdateBy;
	/** 更新时间 */
	private java.util.Date lastUpdateTime;
	/** 是否删除  -1：已删除  0：正常 */
	private Integer delFlag;


}