package com.github.hcsp.encapsulation;

public class UserBuilder {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String address;

  public UserBuilder() {

  }

  public UserBuilder firstName(String name) {
    this.firstName = name;
    return this;
  }

  public UserBuilder lastName(String name) {
    this.lastName = name;
    return this;
  }

  public UserBuilder phoneNumber(String number) {
    this.phoneNumber = number;
    return this;
  }

  public UserBuilder address(String ads) {
    this.address = ads;
    return this;
  }

  public User builder(){
    return new User(firstName,lastName,phoneNumber,address);
  }
}
