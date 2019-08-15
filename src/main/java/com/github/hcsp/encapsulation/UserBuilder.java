package com.github.hcsp.encapsulation;

    // 请在这里使用builder模式建造User对象
    // 所需的接口请参阅UserBuilderTest测试类
    public final class UserBuilder {
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String address;

        public UserBuilder() {
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(firstName, lastName, phoneNumber, address);
        }
}
