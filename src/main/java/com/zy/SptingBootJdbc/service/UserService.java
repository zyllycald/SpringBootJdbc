package com.zy.SptingBootJdbc.service;


public interface UserService {
		/**
	     * 新增一个用户
	     * @param name
	     * @param age
	     */
		public void creat(String name, int age);
		
		
		/**
	     * 根据name删除一个用户高
	     * @param name
	     */
		public void deleteByUser(String name);
		
		
		/**
	     * 删除所有用户
	     */
		public void deleteAllUser();
		
		
		 /**
	     * 获取用户总量
	     */
	    public Integer getAllUsers();
		
}
