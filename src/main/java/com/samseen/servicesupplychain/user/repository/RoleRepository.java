package com.samseen.servicesupplychain.user.repository;

import com.samseen.servicesupplychain.user.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Permission, Long> {
    Permission getRoleByName(String roleName);
}
