package com.chenc.demo.model;

/**
 * @author chenc
 * @date 2019-03-22
 */
public class UserDO {

    private String name;

    private String address;

    private Integer sex;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
