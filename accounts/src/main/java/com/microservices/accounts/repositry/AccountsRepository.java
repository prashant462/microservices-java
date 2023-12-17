package com.microservices.accounts.repositry;

import com.microservices.accounts.entity.Accounts;
import com.microservices.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    Optional<Accounts> findByCustomerId(long customerId);

    @Transactional
    @Modifying
    void deleteByCustomerId(long customerId);
}
