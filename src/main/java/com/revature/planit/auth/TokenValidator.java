package com.revature.planit.auth;

import com.revature.planit.auth.dtos.responses.Principal;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TokenValidator {
    private final JwtConfig jwtConfig;

    @Autowired
    public TokenValidator(JwtConfig jwtConfig) {
        this.jwtConfig = jwtConfig;
    }

    public Optional<Principal> parseToken(String token) {

        try {

            Claims claims = Jwts.parser()
                    .setSigningKey(jwtConfig.getSigningKey())
                    .parseClaimsJws(token)
                    .getBody();

            return Optional.of(new Principal(claims.getId(), claims.getSubject(), claims.get("role", String.class)));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage()); // TODO replace with something better
        }

    }

    public int getDefaultTokenExpiry() {
        return jwtConfig.getExpiration();
    }
}
