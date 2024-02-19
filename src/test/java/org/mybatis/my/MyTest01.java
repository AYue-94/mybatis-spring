package org.mybatis.my;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.mybatis.my.mapper.MyUserMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = MybatisConfig.class)
class MyTest01 {

    @Resource MyUserMapper userMapperWithFactory;
    @Resource MyUserMapper userMapper;

    @Test
    void test() {
//        System.out.println(userMapperWithFactory.getUser("u1"));
//        System.out.println(userMapper.getUser("u1"));
        System.out.println(userMapper.getUser2("u1"));
    }
}
