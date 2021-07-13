package com.github.hcsp.encapsulation;

public final class UserBuilder {
    /**
     * 用户的名
     */
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

    public UserBuilder firstName(String name) {
        firstName = name;
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

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}

