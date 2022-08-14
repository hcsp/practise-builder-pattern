package com.github.hcsp.encapsulation;

public class UserBuilder {
    /** 用户的名 */
    private String builderFirstName;

    /** 用户的姓 */
    private String builderLastName;

    /** 用户的电话 */
    private String builderPhoneNumber;

    /** 用户的地址 */
    private String builderAddress;

    public UserBuilder firstName(String firstName){
        this.builderFirstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName){
        this.builderLastName = lastName;
        return this;
    }
    public UserBuilder phoneNumber(String phoneNumber){
        this.builderPhoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address){
        this.builderAddress = address;
        return this;
    }
    public User build(){
        return new User(this.builderFirstName, this.builderLastName,this.builderPhoneNumber, this.builderAddress);
    }

}
