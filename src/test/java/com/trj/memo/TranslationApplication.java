package com.trj.memo;

import com.trj.memo.domain.People;
import com.trj.memo.repository.PeopleRepository;
import com.trj.memo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranslationApplication {

    @Autowired
    private PeopleRepository peopleRepository;


    @Test
    @Transactional
    public void test() throws Exception {

        // 创建10条记录
        peopleRepository.save(new People("AAA", 10));
        peopleRepository.save(new People("BBB", 20));
        peopleRepository.save(new People("CCC", 30));
        peopleRepository.save(new People("DDD", 40));
        peopleRepository.save(new People("EEE", 50));
        peopleRepository.save(new People("FFF", 60));
        peopleRepository.save(new People("GGG", 70));
        peopleRepository.save(new People("HHHHHHHHHH", 80));
        peopleRepository.save(new People("III", 90));
        peopleRepository.save(new People("JJJ", 100));

        // 省略后续的一些验证操作
    }

}
