package com.example.testsecurityjwt.controller;

import com.example.testsecurityjwt.dto.JwtRequest;
import com.example.testsecurityjwt.dto.RegistrationUserDto;
import com.example.testsecurityjwt.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest autRequest) {
        return authService.createAuthToken(autRequest);
    }

    @PostMapping("/registraton")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);
    }
}
