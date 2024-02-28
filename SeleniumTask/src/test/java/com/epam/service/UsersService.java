package com.epam.service;

import com.epam.pojos.Users;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;

public class UsersService {

    public UsersService()
    {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    public Response getUsersResponse(String basePath)
    {
        return RestAssured.given().request(Method.GET,basePath);
    }

    public int extractStatusCode(String basePath) {
        Response userResponse = getUsersResponse(basePath);
        return userResponse.getStatusCode();
    }

    public Users[] getNoOfUsers(String basePath)
    {
            return getUsersResponse(basePath).as(Users[].class);
    }

    public boolean getUserName(String basePath, String userName)
    {
//        JsonPath jsonPath = getUsersResponse(basePath).jsonPath();
//        return jsonPath.getString("name").contains(userName);

        return Arrays.stream(getNoOfUsers(basePath))
                .map(Users :: name)
                .anyMatch(name -> name.contains(userName));
    }


}
