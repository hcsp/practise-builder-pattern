package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类

    /** 用户的名 */
    private String firstName;

    /** 用户的姓 */
    private String lastName;

    /** 用户的电话 */
    private String phoneNumber;

    /** 用户的地址 */
    private String address;

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


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserBuilder firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        return this;
    }

    public UserBuilder address(String address) {
        this.setAddress(address);
        return this;
    }

    public User build() {
        return new User(this.firstName,this.lastName,this.phoneNumber,this.address);
    }
}
