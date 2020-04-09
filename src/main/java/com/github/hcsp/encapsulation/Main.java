package com.github.hcsp.encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder().firstName("张").lastName("三").build();
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }
}
