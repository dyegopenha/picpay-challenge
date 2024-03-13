package com.example.picpaychallenge.transaction;

import org.springframework.data.repository.ListCrudRepository;

public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {

}
