package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;

    /** 用户的姓 */
    private String lastName;

    /** 用户的电话 */
    private String phoneNumber;

    /** 用户的地址 */
    private String address;
    public UserBuilder firstName(String name){
        this.firstName=name;
        return this;
    }
    public UserBuilder lastName(String name){
        this.lastName=name;
        return this;
    }
    public UserBuilder address(String someplace){
        this.address=someplace;
        return this;
    }
    public UserBuilder phoneNumber(String number){
        this.phoneNumber=number;
        return this;
    }
    public User build(){
        return new User(firstName,lastName,phoneNumber,address);
    }
}
