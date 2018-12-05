package com.asiainfo.dao;

import com.asiainfo.domain.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * PeopleDao
 * @author mazhen
 * @date 2018/12/5
 * @param
 * @return
 */
@Mapper
public interface PeopleDao {
    /**
     * select all people
     * @author mazhen
     * @date 2018/12/5
     * @param
     * @return com.asiainfo.domain.People
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "height", column = "height")
    })
    @Select("select a.id, a.name, a.age, a.weight, a.height from t_people a")
    List<People> selectAllPeople();
}
