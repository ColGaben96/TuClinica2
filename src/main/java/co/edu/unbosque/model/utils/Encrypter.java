package co.edu.unbosque.model.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypter {
    public static String encrypt(String content) {
        var encoder = new BCryptPasswordEncoder();
        return encoder.encode(content);
    }
}
