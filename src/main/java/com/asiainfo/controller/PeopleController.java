package com.asiainfo.controller;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.domain.People;
import com.asiainfo.service.PeopleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PeopleController
 * @Description TODO
 * @Author mazhen
 * @Date 2018/12/5 14:14
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test/people")
@Api("peopleController相关api")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @ApiOperation(value = "查询所有人", notes = "查询所有人", produces = "application/json")
    @RequestMapping(value = "/peoples" , method = RequestMethod.GET , produces = "application/json")
    public @ResponseBody Object getAllPeople() throws Exception {
        List<People> allPeople = peopleService.findAllPeople();
        Map<String,Object> map = new HashMap(16);
        map.put("data",allPeople);
        return new JSONObject(map);
    }

    @ApiOperation(value = "添加人口信息", notes = "添加人口信息", produces = "application/json")
    @RequestMapping(value = "/peoples" , method = RequestMethod.POST , produces = "application/json")
    public @ResponseBody Object addPeople(People people) throws Exception {
        int i = peopleService.addPeople(people);
        Map<String,Object> map = new HashMap(16);
        map.put("data","success insert number : "+i);
        return new JSONObject(map);
    }

    @ApiOperation(value = "删除人口信息", notes = "删除人口信息", produces = "application/json")
    @RequestMapping(value = "/peoples" , method = RequestMethod.DELETE , produces = "application/json")
    public @ResponseBody Object deletePeople(String id) throws Exception {
        int i = peopleService.deletePeople(id);
        Map<String,Object> map = new HashMap(16);
        map.put("data","success delete number : "+i);
        return new JSONObject(map);
    }

    @ApiOperation(value = "修改人口信息", notes = "修改人口信息", produces = "application/json")
    @RequestMapping(value = "/peoples" , method = RequestMethod.PUT , produces = "application/json")
    public @ResponseBody Object updatePeople(People people) throws Exception {
        int i = peopleService.updatePeople(people);
        Map<String,Object> map = new HashMap(16);
        map.put("data","success update number : "+i);
        return new JSONObject(map);
    }
}
