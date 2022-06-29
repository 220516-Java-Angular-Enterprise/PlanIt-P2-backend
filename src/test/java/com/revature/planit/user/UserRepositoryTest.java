package com.revature.planit.user;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserRepositoryTest extends TestCase {
    private UserRepository userRepo;
    private UserService userService;

    User userMock = new User();

//    public void testSaveUser() {
//    }
    @Test
    public void testGetAllUsername() {
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        List<String> usernames = new ArrayList<>();
        usernames.add("username1");
        when(userRepo.getAllUsername()).thenReturn(usernames);
        assertEquals(userRepo.getAllUsername(),usernames);
    }

    public void testGetUserByUsernameAndPassword() {
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        userMock = new User();
        when(userRepo.getUserByUsernameAndPassword("username","pass")).thenReturn(userMock);
        assertEquals(userRepo.getUserByUsernameAndPassword("username","pass"),userMock);
    }

    public void testFindUserById() {
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
        userMock =new User();
        when(userRepo.findUserById("q")).thenReturn(userMock);
        assertEquals(userRepo.findUserById("q"),userMock);
    }
}