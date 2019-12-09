package com.github.hcsp.encapsulation;

public class UserBuilder {
    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
	public String builderFirstName;
	public String builderLastName;
	public String builderPhoneNumber;
	public String builderAddress;
	
	UserBuilder firstName(String fName) {
		this.builderFirstName = fName;
		return this;
	}
	
	UserBuilder lastName(String lName) {
		this.builderLastName = lName;
		return this;
	}
	
	UserBuilder phoneNumber(String pNumber) {
		this.builderPhoneNumber = pNumber;
		return this;
	}
	
	UserBuilder address(String uAddress) {
		this.builderAddress = uAddress;
		return this;
	}
	
	User build() {
		return new User(builderFirstName,builderLastName,builderPhoneNumber,builderAddress);
	}
	
}
