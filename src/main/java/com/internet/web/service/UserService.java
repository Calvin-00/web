package com.internet.web.service;

import com.internet.web.dto.RegistrationDto;
import com.internet.web.model.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    UserEntity findByEmail(String email);

    UserEntity findByUsername(String username);
}
