package kr.amaranth.jwt;

import kr.amaranth.jwt.service.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Objects;

@SpringBootTest
class JwtApplicationTests {

    @Autowired
    private JwtService jwtService;

    @Test
    void contextLoads() {
    }

    @Test
    void tokenCreate() {
        var claims = new HashMap<String, Object>();

        claims.put("user_id", 926);

        var expiredAt = LocalDateTime.now().plusSeconds(30);

        var jwtToken = jwtService.create(claims, expiredAt);
        System.out.println(jwtToken);
    }

    @Test
    void tokenValidation() {

        var token = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo5MjYsImV4cCI6MTcwMjYyMjI5M30.unHU8PxBHvRqYPtHxjAXQGovPcxU1a3ijkkQ89t4IBA";

        jwtService.validation(token);

    }

}
