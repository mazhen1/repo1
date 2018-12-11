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
    private String peopleId;
    private String peopleName;
    private String peopleAge;
    private String peopleWeight;
    private String peopleHeight;

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
        peopleId = builder.peopleId;
        peopleName = builder.peopleName;
        peopleAge = builder.peopleAge;
        peopleWeight = builder.peopleWeight;
        peopleHeight = builder.peopleHeight;
    }

    public static class Builder {
        private String peopleId;
        private String peopleName;
        private String peopleAge;
        private String peopleWeight;
        private String peopleHeight;
        public Builder peopleId(String val) {
            peopleId = val;
            return this;
        }
        public Builder peopleName(String val) {
            peopleName = val;
            return this;
        }
        public Builder peopleAge(String val) {
            peopleAge = val;
            return this;
        }
        public Builder peopleWeight(String val) {
            peopleWeight = val;
            return this;
        }
        public Builder peopleHeight(String val) {
            peopleHeight = val;
            return this;
        }
        public People build() {
            return new People(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(String peopleAge) {
        this.peopleAge = peopleAge;
    }

    public String getPeopleWeight() {
        return peopleWeight;
    }

    public void setPeopleWeight(String peopleWeight) {
        this.peopleWeight = peopleWeight;
    }

    public String getPeopleHeight() {
        return peopleHeight;
    }

    public void setPeopleHeight(String peopleHeight) {
        this.peopleHeight = peopleHeight;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleId='" + peopleId + '\'' +
                ", peopleName='" + peopleName + '\'' +
                ", peopleAge='" + peopleAge + '\'' +
                ", peopleWeight='" + peopleWeight + '\'' +
                ", peopleHeight='" + peopleHeight + '\'' +
                '}';
    }
}
