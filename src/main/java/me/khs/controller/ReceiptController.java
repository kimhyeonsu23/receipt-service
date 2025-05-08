package me.khs.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.khs.dto.ReceiptDto;
import me.khs.service.ReceiptService;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

	private final ReceiptService receiptService;
	
	public ReceiptController (ReceiptService receiptService) {
		
		this.receiptService = receiptService;
		
	}
	
	public ReceiptDto createReceipt (@RequestParam String shop, @RequestParam Long userId, @RequestParam Date date, @RequestParam Long keywordId) {
		
		ReceiptDto receiptDto = ReceiptDto.builder()
				.userId(receiptEntity.getUserId()
				.date, keywordId);
		return receiptDto;
		
	}
	
}
