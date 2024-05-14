package sapanganku.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sapanganku.backend.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
