package me.khs.dto;

import java.time.LocalDate;

import lombok.Builder;
import me.khs.entity.ReceiptEntity;
public class ReceiptDto {
	
	private Long receiptId;
	private String shop;
	private Long userId;
	private LocalDate date;
	private Long keywordId;
	
	public ReceiptDto() {}
	
	@Builder
	public ReceiptDto(String shop, Long userId, LocalDate date, Long keywordId) { //영수증 등록 dto
		
		this.shop = shop;
		this.userId = userId;
		this.date = date;
		this.keywordId = keywordId;
		
	}

}
