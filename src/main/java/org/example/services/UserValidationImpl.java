package org.example.services;

import org.springframework.stereotype.Service;


public class UserValidationImpl implements UserValidation{

    @Override
    public boolean isValid(String userName, String password) {
        if (userName.equals("test") && password.equals("0000"))
            return true;
        else
            return false;
    }

}
