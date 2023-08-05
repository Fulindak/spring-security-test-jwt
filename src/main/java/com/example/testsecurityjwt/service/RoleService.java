package com.example.testsecurityjwt.service;

import com.example.testsecurityjwt.entity.Role;
import com.example.testsecurityjwt.repositorie.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
