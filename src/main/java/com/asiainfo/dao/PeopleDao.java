package com.asiainfo.dao;

import com.asiainfo.domain.People;
import org.apache.ibatis.annotations.*;

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
    @Results(id="peopleMap", value={
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "height", column = "height")
    })
    @Select("select a.id, a.name, a.age, a.weight, a.height from t_people a")
    List<People> selectAllPeople();

    @Insert("insert into t_people (id, name, age, weight, height) values (#{id}, #{name}, #{age}, #{weight}, #{height})")
    int insertPeole(People People);

    @Delete("delete from t_people where id = #{id}")
    int deletePeople(String id);

    @Update("update t_people set name = #{name} where id = #{id}")
    int updatePeople(People people);
}
