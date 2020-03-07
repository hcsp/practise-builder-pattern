package com.github.hcsp.encapsulation;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public UserBuilder() {
    }

    public UserBuilder firstName() {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName() {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder phoneNumber() {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address() {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
// 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
}
