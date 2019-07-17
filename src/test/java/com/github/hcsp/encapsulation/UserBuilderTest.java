package com.github.hcsp.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserBuilderTest {
    @Test
    public void canUseBuilderToCreateObjects() {
        User user =
                    UserBuilder.anUser()
                        .firstName("德华")
                        .lastName("刘")
                        .phoneNumber("我也不知道")
                        .address("可能在地球上吧")
                        .build();
        Assertions.assertEquals("德华", user.getFirstName());
        Assertions.assertEquals("刘", user.getLastName());
        Assertions.assertEquals("我也不知道", user.getPhoneNumber());
        Assertions.assertEquals("可能在地球上吧", user.getAddress());
    }
}
