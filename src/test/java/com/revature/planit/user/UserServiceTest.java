package com.revature.planit.user;

import com.revature.planit.login.dtos.requests.LoginRequest;
import com.revature.planit.user.dtos.NewUserRequest;
import com.revature.planit.util.custom_exceptions.AuthenticationException;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;


public class UserServiceTest extends TestCase {
    private UserRepository userRepo;
    private UserService userService;
    private NewUserRequest newUserRequest;
    private LoginRequest loginRequest;
    private User user;


    @Test
    public void testLogin() {
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        user = new User("id", "halcoro9","P@ssw0rd", "name");
        loginRequest= new LoginRequest(user.getUsername(),user.getPassword());
        Assert.assertThrows(AuthenticationException.class,()->userService.login(loginRequest));
    }
    @Test
    public void testRegisterUsernameWillThrowIfInvalidPass() {
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        user = new User("id", "","P@ssw0rd", "name");
        newUserRequest = new NewUserRequest(user.getUsername(),user.getPassword(),user.getfName());

        Assert.assertThrows(InvalidRequestException.class,()->userService.register(newUserRequest));
    }
    @Test
    public void testRegisterPasswordWillThrowIfInvalidPass(){
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        user = new User("id", "halcoro1","", "name");
        newUserRequest = new NewUserRequest(user.getUsername(),user.getPassword(),user.getfName());

        Assert.assertThrows(InvalidRequestException.class,()->userService.register(newUserRequest));
    }

}