package com.github.hcsp.encapsulation;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    public UserBuilder(){}

    public UserBuilder firstName(String name){
        this.firstName = name;
        return this;
    }

    public UserBuilder lastName(String name){
        this.lastName = name;
        return this;
    }
    public UserBuilder phoneNumber(String name){
        this.phoneNumber = name;
        return this;
    }
    public UserBuilder address(String name){
        this.address = name;
        return this;
    }
    public User build(){
        return new User(firstName, lastName, phoneNumber, address);
    }

}
