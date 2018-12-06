package com.asiainfo.service;

import com.asiainfo.dao.PeopleDao;
import com.asiainfo.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
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
    @Transactional
    public List<People> findAllPeople() throws Exception {
        List<People> peopleList = peopleDao.selectAllPeople();
        return peopleList;
    }

    @Override
    @Transactional
    public int addPeople(People people) throws Exception {
        int i = peopleDao.insertPeole(people);
        return i;
    }

    @Override
    @Transactional
    public int deletePeople(String id) throws Exception {
        int i = peopleDao.deletePeople(id);
        return i;
    }

    @Override
    @Transactional
    public int updatePeople(People people) throws Exception {
        int i = peopleDao.updatePeople(people);
        return i;
    }
}
