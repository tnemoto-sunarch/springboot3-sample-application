package jp.co.sunarch.sample.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDto {

	private int resultCode;
	private String resultMessage;
	private Date process;
	
	private Object resultDetail;
}
