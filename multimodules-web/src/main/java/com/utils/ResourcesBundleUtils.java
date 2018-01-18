package com.utils;

import java.util.ResourceBundle;

public class ResourcesBundleUtils {
    public static void main(String[] args) {
        ResourceBundle resource = ResourceBundle.getBundle("application");
        String key = resource.getString("server.port");
        System.out.println(key);
    }
}
