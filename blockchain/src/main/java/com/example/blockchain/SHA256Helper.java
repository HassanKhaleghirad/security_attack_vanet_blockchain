package com.example.blockchain;

import java.security.MessageDigest;

public class SHA256Helper {
    public static String generateHash(String data) {
        try {
            // we will get the instance of SHA256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //by using  digest() function, we will get has as one dimensional byte array
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            //we wanna use hexadecimal values not bytes in our program
            // will covert byte into hexadecimal
            StringBuffer hexadecimalString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
