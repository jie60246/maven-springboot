package com.bbk.dao;

import com.bbk.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper 在接口类上添加了@Mapper，在编译之后会生成相应的接口实现类
public interface UserDaoMapper {
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
