package com.example.demo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticatorService {

    public boolean authenticate(String name, String Password){

        boolean isValiduser = name.equalsIgnoreCase("root");
        boolean isValidpass = Password.equalsIgnoreCase("root");

        return isValidpass && isValiduser;

    }
}
