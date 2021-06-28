package com.home.deposit.repository;

import com.home.deposit.model.depositModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface depositRepository extends JpaRepository<depositModel, Long> {
   depositModel findByUserId(Long UserId);
}
