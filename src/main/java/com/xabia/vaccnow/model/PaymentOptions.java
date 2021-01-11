package com.xabia.vaccnow.model;

import java.util.Arrays;
import java.util.List;

public class PaymentOptions {

	private static final List<String> paymentOptions = Arrays.asList("CASH", "CREDIT", "GIFTCARD");
	
	public static List<String> getPaymentOptions(){
		return paymentOptions;
	}

}
