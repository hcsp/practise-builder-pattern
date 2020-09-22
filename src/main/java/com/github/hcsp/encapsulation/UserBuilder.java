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

    public UserBuilder firstName(String s) {
        this.firstName = s;
        return this;
    }

    public UserBuilder lastName(String s) {
        this.lastName = s;
        return this;
    }

    public UserBuilder phoneNumber(String s) {
        this.phoneNumber = s;
        return this;
    }

    public UserBuilder address(String s) {
        this.address = s;
        return this;
    }

    public User build() {
        return new User(this.firstName, this.lastName, this.phoneNumber, this.address);
    }
}
