package com.github.hcsp.encapsulation;

public class UserBuilder {
    String firstname;
    String lastname;
    String phonenumber;
    String address;
    public UserBuilder firstName(String firstname){
        this.firstname=firstname;
        return this;
    }
    public UserBuilder lastName(String lastname){
        this.lastname=lastname;
        return this;
    }
    public UserBuilder phoneNumber(String phonenumber){
        this.phonenumber=phonenumber;
        return this;
    }
    public UserBuilder address(String address){
        this.address=address;
        return this;
    }
    public User build(){
        return(new User(firstname,lastname,phonenumber,address));
    }



}
