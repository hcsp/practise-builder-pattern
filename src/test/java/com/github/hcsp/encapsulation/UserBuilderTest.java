package com.github.hcsp.encapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserBuilderTest {
    @Test
    public void canUseBuilderToCreateObjects() {
        User user =
                UserBuilder.anUser()
                        .withFirstName("德华")
                        .withAddress("刘")
                        .withPhoneNumber("我也不知道")
                        .withAddress("可能在地球上吧")
                        .build();
        Assertions.assertEquals("德华", user.getFirstName());
        Assertions.assertEquals("刘", user.getLastName());
        Assertions.assertEquals("我也不知道", user.getPhoneNumber());
        Assertions.assertEquals("可能在地球上吧", user.getAddress());
    }
}
