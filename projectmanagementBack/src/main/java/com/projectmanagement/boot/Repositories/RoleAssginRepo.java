package com.projectmanagement.boot.Repositories;

import com.projectmanagement.boot.models.RoleAssgin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleAssginRepo extends JpaRepository<RoleAssgin, Long> {
}
