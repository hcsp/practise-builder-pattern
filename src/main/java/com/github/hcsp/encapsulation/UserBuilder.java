package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public UserBuilder(){}

    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address){
        this.address = address;
        return this;
    }

    public User build(){
        // 将builder的属性传入User构造器中， 创建user对象
        return new User(firstName, lastName, phoneNumber, address);
    }

}
