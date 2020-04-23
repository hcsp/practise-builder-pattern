package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    /**
     * 用户的名
     */
    private String firstName;

    /**
     * 用户的姓
     */
    private String lastName;

    /**
     * 用户的电话
     */
    private String phoneNumber;

    /**
     * 用户的地址
     */
    private String address;

    // 所需的接口请参阅UserBuilderTest测试类
    public UserBuilder() {
    }//UserBuilder接口
    public UserBuilder firstName(String firstName){//Builder firstName
        this.firstName=firstName;
        return this;
    }
    public UserBuilder    lastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address=address;
        return  this;
    }
    public User build(){
    return new User(firstName,lastName,phoneNumber,address);
    }
}
