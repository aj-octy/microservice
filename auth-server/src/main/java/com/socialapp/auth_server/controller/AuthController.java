package com.socialapp.auth_server.controller;

import com.socialapp.auth_server.dto.AuthResponse;
import com.socialapp.auth_server.dto.LoginRequest;
import com.socialapp.auth_server.dto.RegisterRequest;
import com.socialapp.auth_server.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    @GetMapping("/test1")
    public String test1() {
        return "Auth server is running!";
    }
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
