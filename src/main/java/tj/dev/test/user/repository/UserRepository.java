package tj.dev.test.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tj.dev.test.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
