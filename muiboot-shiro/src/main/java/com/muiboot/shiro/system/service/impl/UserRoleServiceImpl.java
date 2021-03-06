package com.muiboot.shiro.system.service.impl;

import java.util.Arrays;
import java.util.List;

import com.muiboot.core.service.impl.BaseService;
import com.muiboot.shiro.system.dao.UserRoleMapper;
import com.muiboot.shiro.system.entity.UserRole;
import com.muiboot.shiro.system.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userRoleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserRoleServiceImpl extends BaseService<UserRole> implements UserRoleService {

	@Autowired
	private UserRoleMapper userRoleMapper;
	@Override
	@Transactional
	public void deleteUserRolesByRoleId(String roleIds) {
		List<String> list = Arrays.asList(roleIds.split(","));
		this.batchDelete(list, "roleId", UserRole.class);
	}

	@Override
	@Transactional
	public void deleteUserRolesByUserId(String userIds) {
		List<String> list = Arrays.asList(userIds.split(","));
		this.batchDelete(list, "userId", UserRole.class);
	}

	@Override
	public List<UserRole> findByEntity(UserRole userRole) {
		return mapper.select(userRole);
	}

	@Override
	public void insertList(List<UserRole> userRoles) {
		userRoleMapper.insertByBatch(userRoles);
	}

}
