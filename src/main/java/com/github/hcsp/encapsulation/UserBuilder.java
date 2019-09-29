package com.github.hcsp.encapsulation;

public final class UserBuilder {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;

  UserBuilder() {
  }

  public static UserBuilder anUser() {
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

  public UserBuilder address(String address) {
    this.address = address;
    return this;
  }

  public User build() {
    return new User(firstName, lastName, phoneNumber, address);
  }
}
