package DJ.example.demo.repository;
import DJ.example.demo.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<Users, Long> {
    Users findById(long id);
}
