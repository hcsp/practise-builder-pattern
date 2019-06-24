package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    UserBuilder(){
    }

    UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    UserBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    UserBuilder address(String address){
        this.address = address;
        return this;
    }
    User build (){
        return new User(firstName,lastName,phoneNumber,address);
    }
}
