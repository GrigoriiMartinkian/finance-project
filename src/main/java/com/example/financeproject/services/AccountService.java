package com.example.financeproject.services;

import com.example.financeproject.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    //    @Autowired
//    private AccountRepository accountRepository;
//
//    @Autowired
//    private UserService userService;
//
//    public AccountDto createAccount(AccountDto accountDto) {
//        // Получаем текущего пользователя
//        User currentUser = userService.getCurrentUser();
//
//        // Преобразуем DTO в сущность
//        Account account = new Account();
//        account.setName(accountDto.getName());
//        account.setType(accountDto.getType());
//        account.setBalance(accountDto.getBalance());
//        account.setCurrency(accountDto.getCurrency());
//        account.setUser(currentUser); // Связываем счет с текущим пользователем
//
//        // Сохраняем счет в базе данных
//        Account savedAccount = AccountRepository.save(account);
//
//        // Преобразуем в DTO и возвращаем
//        return new AccountDto(savedAccount);
//    }
    public Account createAccount(AccountDto accountDto){
        return null;
    }
    public List<Account> getAllAccounts() {
        return null;
    }

    public Account getAccountById(Long id) {
        return null;
    }

    public Account updateAccount(Long id, AccountDto accountDto) {
        return null;
    }
}
