package com.revature.planit.auth;

import com.revature.planit.auth.dtos.requests.LoginRequest;
import com.revature.planit.auth.dtos.responses.Principal;
import com.revature.planit.user.UserService;
import com.revature.planit.util.annotations.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Inject
    private final UserService userService;
    private final TokenService tokenService;

    @Inject
    @Autowired
    public AuthController(UserService userService, TokenService tokenService) {
        this.userService = userService;
        this.tokenService = tokenService;
    }

    @CrossOrigin
    @PostMapping(consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Principal login(@RequestBody LoginRequest request, HttpServletResponse resp) {
        Principal principal = new Principal(userService.login(request));
        String token = tokenService.generateToken(principal);
        resp.setHeader("Authorization", token);
        return principal;
    }
}