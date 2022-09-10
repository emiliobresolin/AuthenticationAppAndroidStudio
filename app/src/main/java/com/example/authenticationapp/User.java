package com.example.authenticationapp;
import java.util.ArrayList;
import java.util.List;

public class User
{
    private int id;
    private String name;
    private String userLogin;
    private String password;

    private static List<User> users;

    public User() {}

    public User(int id, String name, String userLogin, String password)
    {
        this.id = id;
        this.name = name;
        this.userLogin = userLogin;
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUserLogin()
    {
        return userLogin;
    }

    public void setUserLogin(String userLogin)
    {
        this.userLogin = userLogin;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public static List<User> SeedingService()
    {
        if (users == null)
        {
            users = new ArrayList<>();
            users.add(new User(1, "Bigui", "bizao1", "0123456789"));
            users.add(new User(2, "Jacare", "japa2", "0123456789"));
            users.add(new User(0, "Emilio", "admin", "admin"));
        }
        return users;
    }
}
