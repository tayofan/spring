package com.jsp.vo;

import java.util.Calendar;
import java.util.Date;

import com.jsp.dataSource.DataSource;

public class DateTest {

	public static void main(String[] args) {
		Date new_date = new Date();
		Date old_date = new Date(122, 5, 4);
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 4,8);
		
		DataSource dataSource = DataSource.getInstance();
		
		BoardVO board1 = dataSource.getBoardList().get("20");
		BoardVO board2 = dataSource.getBoardList().get("19");
		
		System.out.println(new_date.after(old_date));
		System.out.println(old_date);
		System.out.println(board1.getRegDate().equals(new_date));
		System.out.println(board2);

	}

}
