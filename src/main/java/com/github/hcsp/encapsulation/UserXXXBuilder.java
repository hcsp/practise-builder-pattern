package com.github.hcsp.encapsulation;

public final class UserXXXBuilder {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    private UserXXXBuilder() {
    }

    public static UserXXXBuilder anUser() {
        return new UserXXXBuilder();
    }

    public UserXXXBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserXXXBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserXXXBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserXXXBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
