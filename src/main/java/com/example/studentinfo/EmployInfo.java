package com.example.studentinfo;

public class EmployInfo {
    private String name;
    private int id;
    private String mobile, gender,country;
    public EmployInfo(){

    }

    public EmployInfo(String name, int id, String mobile, String gender, String country) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
        this.gender = gender;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EmployInfo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
