package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    // 定义 Getter
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
    // 定义属性设置器
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
    // 返回目标实例
    public User build() {
        return new User(firstName, lastName, phoneNumber, address);
    }
}
