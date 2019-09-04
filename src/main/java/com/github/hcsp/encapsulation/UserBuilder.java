package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public UserBuilder firstName(String val) {
        firstName = val;
        return this;
    }

    public UserBuilder lastName(String val) {
        lastName = val;
        return this;
    }

    public UserBuilder phoneNumber(String val) {
        phoneNumber = val;
        return this;
    }

    public UserBuilder address(String val) {
        address = val;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
