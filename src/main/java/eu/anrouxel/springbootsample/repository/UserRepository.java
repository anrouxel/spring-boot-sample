package eu.anrouxel.springbootsample.repository;

import eu.anrouxel.springbootsample.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
}
