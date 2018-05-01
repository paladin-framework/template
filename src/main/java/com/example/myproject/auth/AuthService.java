package com.example.myproject.auth;

public class AuthService
{
    public User login(String username, String password) throws LoginException
    {
        // TODO: Do something more real
        if (username.equalsIgnoreCase("john") && password.equalsIgnoreCase("admin"))
        {
            return new User("John Doe");
        }

        throw new LoginException("Invalid credentials");
    }
}
