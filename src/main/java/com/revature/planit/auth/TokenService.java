package com.revature.planit.auth;

import com.revature.planit.auth.dtos.responses.Principal;
import com.revature.planit.util.annotations.Inject;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import com.revature.planit.util.custom_exceptions.InvalidTokenException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {
    private final TokenGenerator tokenGenerator;
    private final TokenValidator tokenValidator;

    @Autowired
    public TokenService(TokenGenerator tokenGenerator, TokenValidator tokenValidator) {
        this.tokenGenerator = tokenGenerator;
        this.tokenValidator = tokenValidator;
    }

    public String generateToken(Principal subject) {
        if (!isPrincipalValid(subject)) {
            throw new InvalidRequestException("Invalid Principal object provided!");
        }
        return tokenGenerator.createToken(subject);
    }

    public boolean isTokenValid(String token) {

        if (token == null || token.trim().equals("")) {
            return false;
        }

        return tokenValidator.parseToken(token)
                .isPresent();
    }

    public Principal extractTokenDetails(String token) {

        if (token == null || token.trim().equals("")) {
            throw new InvalidRequestException("No authentication token found on request!");
        }

        return tokenValidator.parseToken(token)
                .orElseThrow(InvalidTokenException::new);

    }

    public int getDefaultTokenExpiry() {
        return tokenValidator.getDefaultTokenExpiry();
    }

    private boolean isPrincipalValid(Principal subject) {
        return subject != null &&
                subject.getId() != null && !subject.getId().equals("") &&
                subject.getUsername() != null && !subject.getUsername().equals("") &&
                subject.getEmail() != null && !subject.getEmail().equals("");
    }
}