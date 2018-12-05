package com.asiainfo;

import com.asiainfo.domain.People;
import com.asiainfo.service.PeopleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisMazhenApplicationTests {

    @Autowired
    private PeopleService peopleService;

    @Test
    @Transactional
    public void test() throws Exception {
        List<People> allPeople = peopleService.findAllPeople();
        for (People p : allPeople) {
            System.out.println("people :"+p.toString());
        }
    }

}
