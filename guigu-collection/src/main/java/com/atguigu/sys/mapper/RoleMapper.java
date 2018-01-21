package com.atguigu.sys.mapper;

import java.util.List;
import java.util.Map;

import com.atguigu.commons.mapper.BaseMapper;
import com.atguigu.sys.dto.RoleResourceRelationDto;
import com.atguigu.sys.model.OrganizationModel;
import com.atguigu.sys.model.RoleModel;

/**
 * 角色Mapper
 * @author lisuo
 *
 */
public interface RoleMapper extends BaseMapper<RoleModel,String>{
	
	/**
	 * 保存角色-资源-关系
	 * @param roleResource
	 * @return
	 */
	int saveRoleResourceRelation(RoleResourceRelationDto roleResource);
	
	/**
	 * 删除角色-资源-关系
	 * @param roleResource
	 * @return
	 */
	int deleteRoleResourceRelation(String roleId);
	
	/**
	 * 通过角色ID,查询资源Id
	 * @param roleId
	 * @return
	 */
	List<String> findResourceIdsByRoleId(String roleId);

	/**
	 * 通过角色ID,查询资源Id
	 * @param roleId
	 * @return
	 */
	List<RoleModel> findRolesByUserId(String userId);
	
	
	/**
	 * 获取组织机构编码
	 * @param 过滤条件
	 */
	List<RoleModel> getRolCode(List<RoleModel> roleId);
}
