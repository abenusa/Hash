package com.example.hash;

import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Hash strings.
public class Hash {

    public String MD5Hash (String stringToBeHashed) {
        String hashText = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(stringToBeHashed.getBytes());
            byte byteData[] = md.digest();

            // Convert from byte array to hex StringBuilder
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(String.format("%02X", b));
            }

            hashText = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            Log.d("Message", "In exception" + e);
        }

        return hashText;
    } // end method MD5Hash

    public String SHA256Hash (String stringToBeHashed) {
        String hashText = "";

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(stringToBeHashed.getBytes());
            byte byteData[] = md.digest();

            // Convert from byte array to hex StringBuilder
            StringBuilder sb = new StringBuilder();
            for (byte b : byteData) {
                sb.append(String.format("%02X", b));
            }

            hashText = sb.toString();

        } catch (NoSuchAlgorithmException e) {
            Log.d("Message", "In exception" + e);
        }

        return hashText;
    } // end method MD5Hash
}
