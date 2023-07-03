package DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@Builder
public class Payment {
	private int payment_id;
	private String customer_id;
	private int rent_no;
	private Date payment_day;
	private int money;
	private String payment_method;
	private int car_id;
}