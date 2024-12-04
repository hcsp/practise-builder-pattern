package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder firstName (String s) {
        this.firstName = s;
        return this;
    }
    public UserBuilder lastName (String s) {
        this.lastName = s;
        return this;
    }
    public UserBuilder phoneNumber (String s) {
        this.phoneNumber = s;
        return this;
    }
    public UserBuilder address (String s) {
        this.address = s;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
