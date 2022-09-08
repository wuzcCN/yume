package com.fsyume.yume;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fsyume.yume.entity.User;
import com.fsyume.yume.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class YumeApplicationTests {

    @Resource
    UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        // 条件构造器
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        QueryWrapper<User> eq = wrapper.eq("name", "Jone");

        User user = userMapper.selectOne(eq);
        System.out.println("查询结果：" + user);
    }

    @Test
    public void testGet(){

    }

}
