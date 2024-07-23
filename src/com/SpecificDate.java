package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDate {
	public static void main(String[] args) {
		String partten ="MM-dd-YYYY";
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		String date=sdf.format(new Date());
		System.out.println(date);
	}

}
