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
            @Result(property = "peopleId", column = "people_id"),
            @Result(property = "peopleName", column = "people_name"),
            @Result(property = "peopleAge", column = "people_age"),
            @Result(property = "peopleWeight", column = "people_weight"),
            @Result(property = "peopleHeight", column = "people_height"),
    })
    @Select("select a.people_id, a.people_name, a.people_age, a.people_weight, a.people_height from t_people a")
    List<People> selectAllPeople();

    @Insert("insert into t_people (people_id, people_name, people_age, people_weight, people_height) " +
            "values (#{peopleId}, #{peopleName}, #{peopleAge}, #{peopleWeight}, #{peopleHeight})")
    int insertPeole(People People);

    @Delete("delete from t_people where people_id = #{peopleId}")
    int deletePeople(String id);

    @Update("<script>" +
                "UPDATE t_people " +
                "<set>" +
                    "<if test=\"peopleName != null and peopleName != ''\">" +
                        "people_name = #{peopleName}, " +
                    "</if>" +
                    "<if test=\"peopleAge != null and peopleAge != ''\">" +
                        "people_age = #{peopleAge}, " +
                    "</if>" +
                    "<if test=\"peopleWeight != null and peopleWeight != ''\">" +
                        "people_weight = #{peopleWeight}, " +
                    "</if>" +
                    "<if test=\"peopleHeight != null and peopleHeight != ''\">" +
                        "people_height = #{peopleHeight}, " +
                    "</if>" +
                "</set>" +
                "WHERE people_id = #{peopleId}" +
            "</script>")
    int updatePeople(People people);
}
