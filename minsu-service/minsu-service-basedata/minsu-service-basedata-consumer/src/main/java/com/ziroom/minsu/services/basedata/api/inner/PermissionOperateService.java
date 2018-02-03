/**
 * @FileName: PermissionOperateService.java
 * @Package com.ziroom.minsu.services.basedata.api.inner
 * 
 * @author bushujie
 * @created 2016年3月15日 上午11:39:33
 * 
 * Copyright 2011-2015 asura
 */
package com.ziroom.minsu.services.basedata.api.inner;


/**
 * <p>权限相关操作接口</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
public interface PermissionOperateService {
	/**
	 * 
	 * 条件查询后台用户列表
	 *
	 * @author bushujie
	 * @created 2016年3月9日 上午11:26:09
	 *
	 * @param paramJson
	 * @return
	 */
	public String searchCurrentuserList(String paramJson);

	/**
	 * 
	 * 条件查询后台角色列表
	 *
	 * @author liujun
	 * @created 2016-3-10 下午7:26:36
	 *
	 * @param paramJson
	 * @return
	 */
	public String searchRoles(String paramJson);

	/**
	 * 修改用户信息
	 * @param userInfo
	 * @return
	 */
	String saveUserInfo(String paramJson);


	/**
	 * 初始化当前的用户的 修改信息
	 * @param userFid
	 * @return
	 */
	String initSaveUserInfo(String userFid);

	/**
	 * 
	 * 员工分页列表
	 *
	 * @author bushujie
	 * @created 2016年3月12日 下午4:15:43
	 *
	 * @param paramJson
	 * @return
	 */
	public String employeePageList(String paramJson);
	
	/**
	 * 根据角色逻辑fid查询角色
	 *
	 * @author liujun
	 * @created 2016-3-12 下午4:35:48
	 *
	 * @param roleFid
	 * @return
	 */
	public String searchRoleByFid(String roleFid);

	/**
	 * 启用|禁用角色
	 *
	 * @author liujun
	 * @created 2016-3-12 下午5:01:16
	 *
	 * @param paramJson
	 * @return
	 */
	public String editRoleStatus(String paramJson);
	/**
	 * 
	 * 城市列表
	 *
	 * @author bushujie
	 * @created 2016年3月15日 下午5:42:33
	 *
	 */
	public String cityList();
	
	/**
	 * 
	 * 插入后台用户
	 *
	 * @author bushujie
	 * @created 2016年3月15日 下午10:18:54
	 *
	 * @param paramJson
	 */
	public String insertCurrentuser(String paramJson);
	
	/**
	 * 查询角色资源关系
	 *
	 * @author liujun
	 * @created 2016-3-16 上午10:30:20
	 *
	 * @param roleFid
	 * @return
	 */
	String searchRoleResources(String roleFid);
	
	/**
	 * 重新定义当前角色下的资源
	 * 
	 * @param paramJson {"code":0,"msg":"","data":{"roleFid":"","resFids":""}}
	 * @return
	 */
	String updateRoleResources(String paramJson);

	/**
	 * 
	 * 新增角色保存角色资源关系
	 *
	 * @author liujun
	 * @created 2016-3-16 上午10:30:53
	 *
	 * @param paramJson {"code":0,"msg":"","data":{"userFid":"","roleFid":"","resFids":""}}
	 */
	String addRoleResources(String paramJson);

	/**
	 * 根据账户uid查询账户信息
	 *
	 * @author liujun
	 * @created 2016年5月16日
	 *
	 * @param uid
	 * @return
	 */
	public String searchCurrentuserByUid(String uid);

	/**
	 * 启用|禁用角色
	 *
	 * @author liujun
	 * @created 2016年5月16日
	 *
	 * @param paramJson
	 * @return
	 */
	public String editUserStatus(String paramJson);
	
	/**
	 * 
	 * 根据功能和登录用户查询权限类型
	 *
	 * @author bushujie
	 * @created 2016年10月26日 上午9:56:35
	 *
	 * @param paramJson
	 * @return
	 */
	public String findRoleTypeByMenu(String paramJson);


	/**
	 * 保存城市与用户之间的关系
	 * @author jixd
	 * @created 2016年12月08日 16:39:55
	 * @param
	 * @return
	 */
	public String insertCurrentuserCity(String paramJson);

	/**
	 * 删除关联城市
	 * @author jixd
	 * @created 2016年12月08日 18:00:43
	 * @param
	 * @return
	 */
	public String delCurrentuserCity(String paramJson);

	/**
	 * 获取用户城市列表
	 * @author jixd
	 * @created 2016年12月08日 20:31:39
	 * @param
	 * @return
	 */
	public String getCurrentuserCity(String fid);
}
