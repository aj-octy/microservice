package com.socialapp.auth_server.service;

import com.socialapp.auth_server.dto.LoginRequest;
import com.socialapp.auth_server.dto.RegisterRequest;
import com.socialapp.auth_server.dto.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
