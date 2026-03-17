package org.example;

import org.example.mapper.UserMapper;
import org.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest  //单元测试注解 - 当前测试类中的测试方法运行时，会启动整个SpringBoot项目 -IOC容器启动
class SpringbootMybatisDemo1ApplicationTests {

    @Autowired
private UserMapper userMapper; // 注入Mapper接口对象

    @Test
    public void testFindAll() {
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
