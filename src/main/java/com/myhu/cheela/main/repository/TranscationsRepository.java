package com.myhu.cheela.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myhu.cheela.main.pojo.TransactionRecord;

@Repository
public interface TranscationsRepository extends JpaRepository<TransactionRecord,Long>{

}