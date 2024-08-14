package com.example.financeproject.repositories;

import com.example.financeproject.models.Account;


import java.util.Optional;

public interface AccountRepository {
    void save(Account account);
    Optional<Account> findById(long id);

}
