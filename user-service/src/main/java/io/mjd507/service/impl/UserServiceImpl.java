package io.mjd507.service.impl;

import io.mjd507.dao.UserServiceMapper;
import io.mjd507.entity.UserVo;
import io.mjd507.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mjd on 2018/4/15 17:08
 */
@Service
public class UserServiceImpl implements IUserService<UserVo> {

  @Autowired
  UserServiceMapper userServiceMapper;

  @Override
  public UserVo findUserById(String userId) {
    return userServiceMapper.findUserByUserId(userId);
  }

  @Override
  public UserVo findUserByPhone(String phone) {
    return userServiceMapper.findUserByPhone(phone);
  }

  @Override
  public boolean updateUserById(UserVo userVo) {
    return userServiceMapper.updateUserByUserId(userVo) == 1;
  }

  @Override
  public boolean addUser(UserVo userVo) {
    return userServiceMapper.addUser(userVo) == 1;
  }

  @Override
  public boolean deleteUserById(String userId) {
    return userServiceMapper.deleteUserByUserId(userId) == 1;
  }

  public boolean setUserType(String userId, String userType) {
    return userServiceMapper.setUserType(userId, userType) == 1;
  }

}
