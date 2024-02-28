package com.epam.factory;

public class BrowserNotFoundException extends RuntimeException{

    public BrowserNotFoundException(String message)
    {
        super(message);
    }
}
