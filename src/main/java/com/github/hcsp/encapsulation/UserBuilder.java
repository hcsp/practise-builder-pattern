package com.github.hcsp.encapsulation;

public class UserBuilder {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;

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
    return new User(firstName, lastName, phoneNumber, address);
  }
}
