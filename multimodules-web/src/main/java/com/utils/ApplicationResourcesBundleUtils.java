package com.utils;

import java.util.ResourceBundle;

public class ApplicationResourcesBundleUtils {

    private static ResourceBundle getResourceBundle() {
       return ResourceBundle.getBundle("application");
    }

    public static int getServerPort() {
        return Integer.parseInt(getResourceBundle().getString("server.port"));
    }

    public static void main(String[] args) {
        System.out.println(getServerPort());
    }
}