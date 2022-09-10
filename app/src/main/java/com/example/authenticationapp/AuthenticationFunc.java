package com.example.authenticationapp;

public class AuthenticationFunc
{
    public boolean Authentication (String userLogin, String password)
    {
        User user = new User();
        boolean var = false;
        for (User userT : user.SeedingService())
        {
            if (userLogin.equals(userT.getUserLogin()) && password.equals(userT.getPassword()))
            {
                var = true;
            }
        }
        return var;
    }
}
