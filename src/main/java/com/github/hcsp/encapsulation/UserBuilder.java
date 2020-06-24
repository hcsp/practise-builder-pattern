package com.github.hcsp.encapsulation;

public final class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    private static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String add) {
        this.address = add;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
