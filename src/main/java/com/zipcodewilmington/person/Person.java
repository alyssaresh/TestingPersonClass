package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private String city;
    private String job;
    private String birthday;
    private String pet;


    public Person(String name, int age, String city, String job, String birthday, String pet) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.job = job;
        this.birthday = birthday;
        this.pet = pet;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPet() {
        return pet;
    }
}
