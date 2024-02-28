package com.epam.data;

import org.testng.annotations.DataProvider;

public class DataProviderForUser {

    @DataProvider(name="usersNameDataProvider")
    public Object[][] usersNameData()
    {
        return new Object[][]{
                {"Ervin Howell"}
        };
    }

    @DataProvider(name = "resourceBasePath")
    public Object[][] resourceBasePath()
    {
        return new Object[][]{
                {"/users"}
        };
    }
}
