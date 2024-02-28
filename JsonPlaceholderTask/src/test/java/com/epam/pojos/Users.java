package com.epam.pojos;

public record Users(int id, String name, String username, String email,
        Address address, String phone, String website, Company company) {}
