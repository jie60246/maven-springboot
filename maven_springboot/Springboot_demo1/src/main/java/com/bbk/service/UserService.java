package com.bbk.service;

import com.bbk.entity.User;

import java.util.List;

/**
 * 对用户操作的相关接口
 */
public interface UserService {
    /**
     * 查询用户
     * @return
     */
    public List<User> queryUser();

    /**
     * 添加用户
     * @return
     */
    public int addUser();

    /**
     * 删除用户
     * @param user
     * @return
     */
    public int deleteUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public int updateUser(User user);
}

