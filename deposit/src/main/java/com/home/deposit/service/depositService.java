package com.home.deposit.service;

import com.home.deposit.model.depositModel;
import com.home.deposit.repository.depositRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class depositService {


    @Autowired
    private depositRepository depositRepository;

    public depositModel saveDeposit(depositModel deposit) {
        return depositRepository.save(deposit);
    }
}
