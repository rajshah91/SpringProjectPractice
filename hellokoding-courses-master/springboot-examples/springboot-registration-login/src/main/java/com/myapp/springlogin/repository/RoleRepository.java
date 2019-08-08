package com.myapp.springlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.springlogin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
