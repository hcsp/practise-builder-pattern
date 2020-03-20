package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public String getFirstName(){
        return firstName;
    }
    public UserBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public String getLastName(){
        return lastName;
    }
    public UserBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public UserBuilder phoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
        return this;
    }
    public String getAddress(){
        return address;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }

}
