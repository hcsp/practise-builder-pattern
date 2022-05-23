package com.github.hcsp.encapsulation;

public class UserBuilder {
    private  String firstName;
    /** 用户的姓 */
    private  String lastName;

    /** 用户的电话 */
    private  String phoneNumber;

    /** 用户的地址 */
    private  String address;

    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
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


    public User build() {
        return new User(this.getFirstName(),this.getLastName(),this.getPhoneNumber(),this.getAddress());
    }

    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
}
