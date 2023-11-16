package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    UserBuilder() {
    }


    public UserBuilder firstName(String n) {
        firstName = n;
        return this;
    }

    public UserBuilder lastName(String name) {
        lastName = name;
        return this;
    }

    public UserBuilder phoneNumber(String number) {
        phoneNumber = number;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
