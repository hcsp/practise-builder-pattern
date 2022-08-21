package com.github.hcsp.encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = UserBuilder.anUser().firstName("fpc").build();
        System.out.println(user.getLastName());
    }
}
