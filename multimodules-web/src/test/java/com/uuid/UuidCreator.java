package com.uuid;

import java.util.UUID;

public class UuidCreator {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.fromString("0db53cbc-8442-4d96-93b3-38dc064f990e"));
        System.out.println(UUID.nameUUIDFromBytes("name".getBytes()));
    }
}
