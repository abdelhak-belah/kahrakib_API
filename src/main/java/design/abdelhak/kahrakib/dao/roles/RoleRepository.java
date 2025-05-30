package design.abdelhak.kahrakib.dao.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity,Long> {

    RoleEntity findRoleEntityByRole(String role);
}
