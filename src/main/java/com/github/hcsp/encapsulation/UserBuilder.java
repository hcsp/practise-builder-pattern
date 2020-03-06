package com.github.hcsp.encapsulation;

public class UserBuilder {
    String firstName; // package protected, 相同包的不同类也可以访问
    String lastName;
    String phoneNumber;
    String address;

    public UserBuilder(){}

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

    public User build(){
        // 将builder的属性传入User构造器中， 创建user对象
        return new User(this);
    }

}

