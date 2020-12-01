package com.github.hcsp.encapsulation;

public final class UserBuilder {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    private UserBuilder() {

    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
