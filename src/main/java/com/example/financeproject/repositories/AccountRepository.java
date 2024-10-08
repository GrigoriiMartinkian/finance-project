package com.example.financeproject.repositories;

import com.example.financeproject.models.Account;
import org.springframework.stereotype.Repository;


import java.util.Optional;
@Repository
public interface AccountRepository {
   void save(Account account);
    Optional<Account> findById(long id);

}
