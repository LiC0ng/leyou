package com.leyou.user.service;

import com.leyou.user.mapper.UserMapper;
import com.leyou.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 验证用户方法
     *
     * @param data
     * @param type
     * @return
     */
    public Boolean checkUser(String data, Integer type) {
        User record = new User();
        if (type == 1) {
            // 校验用户名
            record.setUsername(data);
        } else if (type == 2) {
            // 校验手机
            record.setPhone(data);
        } else {
            return null;
        }
        return this.userMapper.selectCount(record) == 0;
    }
}
