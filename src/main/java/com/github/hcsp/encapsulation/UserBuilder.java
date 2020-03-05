package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String address;

    public UserBuilder() {
    }

//    public static UserBuilder aUser(){
//        return new UserBuilder();
//    }

    public UserBuilder firstName(String firstName) {
        this.firstname = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastname = lastName;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstname, lastname, phoneNumber, address);
    }
}
