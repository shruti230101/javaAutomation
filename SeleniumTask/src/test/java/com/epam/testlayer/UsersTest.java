package com.epam.testlayer;

import com.epam.data.DataProviderForUser;
import com.epam.service.UsersService;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class UsersTest {

    UsersService userService;

    @BeforeTest
    public void setUser() {
        userService = new UsersService();
    }

    @Test(dataProviderClass = DataProviderForUser.class, dataProvider = "resourceBasePath")
    public void testUserStatusCode(String basePath) {

        Assert.assertEquals(userService.extractStatusCode(basePath), 200);
    }

    @Test(dataProviderClass = DataProviderForUser.class, dataProvider = "resourceBasePath")
    public void verifyNoOfUsersMoreThan3(String basePath)
    {
        Assert.assertTrue(userService.getNoOfUsers(basePath).length > 3);
    }

    @Test(dataProviderClass = DataProviderForUser.class, dataProvider = "usersNameDataProvider")
    public void validateUserName(String name)
    {
        Assert.assertTrue(userService.getUserName("/users", name));
    }

    @AfterTest
    public void cleanUserService() {
        userService = null;
    }
}
