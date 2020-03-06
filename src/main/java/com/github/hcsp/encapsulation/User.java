package com.github.hcsp.encapsulation;

public class User {
    /** 用户的名 */
    private final String firstName;

    /** 用户的姓 */
    private final String lastName;

    /** 用户的电话 */
    private final String phoneNumber;

    /** 用户的地址 */
    private final String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }
}
