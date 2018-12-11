package com.trj.memo;

import com.trj.memo.domain.User;
import com.trj.memo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheApplicationTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void test() throws Exception {

        userRepository.save(new User("AAA",22));

        User u1 = userRepository.findByName("AAA");
        System.out.println("第一次查询：" + u1.getAge());

        User u2 = userRepository.findByName("AAA");
        System.out.println("第二次查询：" + u2.getAge());

        u1.setAge(100);
        userRepository.save(u1);

        User u3 = userRepository.findByName("AAA");
        System.out.println("第三次查询：" + u3.getAge());



    }
}
