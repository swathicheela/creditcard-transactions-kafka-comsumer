package com.myhu.cheela.main.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.myhu.cheela.main.pojo.TransactionRecord;
import com.myhu.cheela.main.repository.TranscationsRepository;

@Component
public class TransactionService {

	@Autowired
	private TranscationsRepository txnRepository;
	
	ObjectMapper objMapper = new ObjectMapper();
	
	public void saveRecord(String transactionJson) throws JsonParseException, JsonMappingException, IOException {
		TransactionRecord txn = parseJson(transactionJson);
		txnRepository.save(txn);
		System.out.println("Saved transaction record with txn id -> "+txn.getTxnId());
	}
	
	protected TransactionRecord parseJson(String json) throws JsonParseException, JsonMappingException, IOException{
		System.out.println("Parse transaction record..");
		objMapper.setSerializationInclusion(Include.ALWAYS);
		objMapper.setSerializationInclusion(Include.NON_EMPTY);
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		
		return objMapper.readValue(json, TransactionRecord.class);
	}

}
