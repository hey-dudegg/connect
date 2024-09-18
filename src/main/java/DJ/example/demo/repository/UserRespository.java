package DJ.example.demo.repository;
import DJ.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRespository extends CrudRepository<User, Long> {
    List<User> find_By_userId(Long userId);
    User find_By_userId(long userId);
}
