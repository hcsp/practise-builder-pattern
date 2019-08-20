package com.github.hcsp.encapsulation;

public class UserBuilder {
    /** 用户的名 */
    private String firstName;

    /** 用户的姓 */
    private String lastName;

    /** 用户的电话 */
    private String phoneNumber;

    /** 用户的地址 */
    private String address;
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类


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

    public UserBuilder phoneNumber(String phoneNum) {
        this.phoneNumber = phoneNum;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build(){
        return new User(this.firstName, this.lastName, this.phoneNumber, this.address);
    }
}
