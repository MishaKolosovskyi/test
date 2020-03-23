package com.task.service;

import com.task.model.User;
import java.util.Optional;

public interface UserService {
    Optional<User> findUserByProfileName(String profileName);
}
