package se.portals.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

public class EncoderTest extends BCryptPasswordEncoder {

    private Pattern BCRYPT_PATTERN = Pattern
            .compile("\\A\\$2a?\\$\\d\\d\\$[./0-9A-Za-z]{53}");

    public EncoderTest(){
        super(10);
    }

    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        System.out.println("Raw: " + rawPassword.toString());
        System.out.println("Encoded: " + encodedPassword);

        if (!BCRYPT_PATTERN.matcher(encodedPassword).matches()) {
            System.out.println("RAW");
            return rawPassword.toString().equals(encodedPassword);
        }

        System.out.println("BCRYPT");
        return super.matches(rawPassword, encodedPassword);
    }
}
