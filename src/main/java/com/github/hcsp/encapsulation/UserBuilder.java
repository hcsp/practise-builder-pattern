package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类

    /** 用户的名 */
    private final String firstName;

    /** 用户的姓 */
    private final String lastName;

    /** 用户的电话 */
    private final String phoneNumber;

    /** 用户的地址 */
    private final String address;

    private UserBuilder(){};

    public UserBuilder firstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
        return this;
    }

    public UserBuilder lastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        if (phoneNumber != null) {
            this.phoneNumber = phoneNumber;
        }
        return this;
    }

    public UserBuilder address(String address) {
        if (address != null) {
            this.address = address;
        }
        return this;
    }

    public User build() {
        return new User(this.firstName, this.lastName, this.phoneNumber, this.address);
    }


}
