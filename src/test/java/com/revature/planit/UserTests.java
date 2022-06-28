package com.revature.planit;

import com.revature.planit.login.dtos.requests.LoginRequest;
import com.revature.planit.user.User;
import com.revature.planit.user.UserRepository;
import com.revature.planit.user.UserService;
import com.revature.planit.user.dtos.NewUserRequest;
import com.revature.planit.util.custom_exceptions.InvalidRequestException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UserTests extends TestCase {
    private UserService userService;
    private UserRepository userRepository;
    NewUserRequest userRequestMock = new NewUserRequest();
    LoginRequest loginRequestMock = new LoginRequest();
    User userMock =new User();

    @Before
    public void setup(){
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }
    @Test
    public void testGetUserAndPass(){
        when(userRepository.getUserByUsernameAndPassword(loginRequestMock.getUsername(),loginRequestMock.getPassword())).thenReturn(userMock);
        assertEquals(userRepository.getUserByUsernameAndPassword(loginRequestMock.getUsername(),loginRequestMock.getPassword()), userMock);
    }
    @Test
    public void testRegisterNewUser(){
        when(userService.register(userRequestMock)).thenReturn(userMock);
        assertEquals(userService.register(userRequestMock),userMock);
    }

    public void testGetAllUsers(){
        List<User> users= Arrays.asList(userMock);
        when(userRepository.findAll()).thenReturn(users);
        assertEquals(userRepository.findAll(),users);
    }

}
