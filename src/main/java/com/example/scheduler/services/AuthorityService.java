package com.example.scheduler.services;

import com.example.scheduler.models.Authority;
import com.example.scheduler.repositories.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;


    public Iterable<Authority> getAllRoles() {
        return authorityRepository.findAll();
    }
    public Authority addRole(Authority authority) {
        return authorityRepository.save(authority);
    }

    public Authority getRole(String roleCode) {
       return authorityRepository.findAuthorityByRoleCode(roleCode);
    }
}
