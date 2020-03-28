package com.github.hcsp.encapsulation;


public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;



    public UserBuilder firstName(String string) {
        this.firstName = string;
        return this;
    }

    public UserBuilder lastName(String string) {
        this.lastName = string;
        return this;
    }

    public UserBuilder phoneNumber(String string) {
        this.phoneNumber = string;
        return this;
    }

    public UserBuilder address(String string) {
        this.address = string;
        return this;
    }

    public UserBuilder build() {
        return new User(this.firstName, this.lastName, this.phoneNumber, this.address);
    }
}
