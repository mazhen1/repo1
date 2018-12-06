package com.asiainfo.controller;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.domain.People;
import com.asiainfo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/getAllPeople" , method = RequestMethod.GET , produces = "application/json")
    public Object getAllPeople() throws Exception {
        List<People> allPeople = peopleService.findAllPeople();
        Map<String,Object> map = new HashMap(16);
        map.put("data",allPeople);
        return new JSONObject(map);
    }

    @RequestMapping(value = "/addPeople" , method = RequestMethod.GET)
    public Object addPeople(String id, String name, String age, String weight, String height) throws Exception {
        People people = new People.Builder().id(id).name(name).age(age).weight(weight).height(height).build();
        int i = peopleService.addPeople(people);
        return i;
    }

    @RequestMapping(value = "/deletePeople" , method = RequestMethod.GET)
    public Object deletePeople(String id) throws Exception {
        int i = peopleService.deletePeople(id);
        return i;
    }

    @RequestMapping(value = "/updatePeople" , method = RequestMethod.GET)
    public Object updatePeople(String id,String name) throws Exception {
        People people = new People.Builder().id(id).name(name).build();
        int i = peopleService.updatePeople(people);
        return i;
    }
}
