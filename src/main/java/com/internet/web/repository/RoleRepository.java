package com.internet.web.repository;

import com.internet.web.model.Role;
import com.internet.web.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
