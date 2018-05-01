package com.example.myproject.auth;

import fr.litarvan.paladin.http.routing.RequestException;

public class LoginException extends RequestException
{
    public LoginException(String message)
    {
        super(message);
    }
}
