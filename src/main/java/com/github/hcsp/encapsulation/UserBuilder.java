package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return  this;
    }
    public  UserBuilder lastName(String value){
        this.lastName = value;
        return this;
    }
    public UserBuilder address(String value){
        this.address = value;
        return this;
    }
    public UserBuilder phoneNumber(String value){
        this.phoneNumber = value;
        return this;
    }

    public User build(){
        User use = new User(firstName, lastName,phoneNumber, address);
        return use;
    }
}
