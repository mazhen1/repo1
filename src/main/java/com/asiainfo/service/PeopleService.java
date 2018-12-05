package com.asiainfo.service;

import com.asiainfo.domain.People;

import java.util.List;

/**
 *功能描述
 * @author mazhen
 * @date 2018/12/5
 * @param
 * @return
 */
public interface PeopleService {
    List<People> findAllPeople() throws Exception;
}
