package com.myhu.cheela.main.service;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.myhu.cheela.main.pojo.TransactionRecord;

public class TransactionServiceTest {
	
	TransactionService service;
	
	@Test
	public void parseJsonTest() throws IOException {
		String json = FileUtils.readFileToString(new File("trans.json"));
		System.out.println(json);
		service = new TransactionService();
		TransactionRecord record = service.parseJson(json);
		System.out.println(record);
	}
}
