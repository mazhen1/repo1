package com.asiainfo.domain;

import java.io.Serializable;

/**
 * @ClassName People
 * @Description TODO
 * @Author mazhen
 * @Date 2018/12/5 9:32
 * @Version 1.0
 **/
public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String age;
    private String weight;
    private String height;

    private People() {
    }

    /**
     * static factory method
     * @author mazhen
     * @date 2018/12/5
     * @param
     * @return com.asiainfo.domain.People
     */
    public static People newInstance() {
        return new People();
    }

    private People(Builder builder) {
        id = builder.id;
        name = builder.name;
        age = builder.age;
        weight = builder.weight;
        height = builder.height;
    }

    public static class Builder {
        private String id;
        private String name;
        private String age;
        private String weight;
        private String height;
        public Builder id(String val) {
            id = val;
            return this;
        }
        public Builder name(String val) {
            name = val;
            return this;
        }
        public Builder age(String val) {
            age = val;
            return this;
        }
        public Builder weight(String val) {
            weight = val;
            return this;
        }
        public Builder height(String val) {
            height = val;
            return this;
        }
        public People build() {
            return new People(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
