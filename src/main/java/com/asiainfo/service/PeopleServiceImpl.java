package com.asiainfo.service;

import com.asiainfo.dao.PeopleDao;
import com.asiainfo.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PeopleServiceImpl
 * @Description TODO
 * @Author mazhen
 * @Date 2018/12/5 14:05
 * @Version 1.0
 **/
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    @Override
    public List<People> findAllPeople() throws Exception {
        List<People> peopleList = peopleDao.selectAllPeople();
        return peopleList;
    }
}
