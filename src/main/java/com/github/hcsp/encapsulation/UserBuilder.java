package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public UserBuilder FirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder LastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder Address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }

}
