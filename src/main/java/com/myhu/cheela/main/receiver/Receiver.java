package com.myhu.cheela.main.receiver;

import java.io.IOException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.myhu.cheela.main.service.TransactionService;

@Component
public class Receiver {
	
	@Autowired
	TransactionService txnService;
	
	@KafkaListener(topics="${kafka.topic}")
	public void processRecord(ConsumerRecord<?, ?> record) {
		String transactionJson = record.value().toString();
		System.out.println("Received transaction..");
		try {
			txnService.saveRecord(transactionJson);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
