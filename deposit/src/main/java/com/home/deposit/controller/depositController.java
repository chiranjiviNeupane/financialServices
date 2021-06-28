package com.home.deposit.controller;

import com.home.deposit.model.depositModel;
import com.home.deposit.service.depositService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposit")
@Slf4j
public class depositController {
@Autowired
private depositService depositService;

    @PostMapping("/save")
    public depositModel saveDeposit(@RequestBody depositModel deposit) {
        log.info("Inside saveUser of UserController");
        return depositService.saveDeposit(deposit);
    }

}
