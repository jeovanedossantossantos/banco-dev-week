package me.fio.banco_dev_week.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.fio.banco_dev_week.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);

}
