package com.trj.memo;

import com.trj.memo.domain.User;
import com.trj.memo.domain.UserMapperBean;
import com.trj.memo.mapper.UserMapper;
import com.trj.memo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        UserMapperBean u = userMapper.findByName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
    }



}
