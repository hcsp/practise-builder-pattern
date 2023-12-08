package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;

    /**
     * 用户的姓
     */
    private String lastName;

    /**
     * 用户的电话
     */
    private String phoneNumber;

    /**
     * 用户的地址
     */
    private String address;

    public UserBuilder firstName(String value) {
        this.firstName = value;
        return this;
    }

    public UserBuilder lastName(String value) {
        this.lastName = value;
        return this;
    }

    public UserBuilder phoneNumber(String value) {
        this.phoneNumber = value;
        return this;
    }

    public UserBuilder address(String value) {
        this.address = value;
        return this;
    }

    public User build() {
        return new User(this.firstName, this.lastName, this.phoneNumber, this.address);
    }
}
