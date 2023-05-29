package com.github.hcsp.encapsulation;

public class UserBuilder {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;

	public UserBuilder firstName(String test) {
		this.firstName = test;
		return this;
	}

	public UserBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder phoneNumber(String PhoneNumber) {
		this.phoneNumber= PhoneNumber;
		return this;

	}

	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	public User build(){
		return new User(firstName,lastName,phoneNumber,address);
	}
	// 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
}
