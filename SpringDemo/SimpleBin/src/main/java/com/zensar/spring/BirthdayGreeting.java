package com.zensar.spring;

/*Author: Yash Maheshwari
Creation Date: 27-07-2019 12:51PM IST
Modified Date: 27-07-2019 12:51PM IST
Version: 1.0
Copyright: Zensar Technologies. All rights reserved.
Description: It is a specialized greeting used to Nisham on his birthday.
*/

public class BirthdayGreeting implements Greeting{

	public BirthdayGreeting() {
		System.out.println("Birthday greeting created.");
	}
	
	public String sayGreet()
	{
		return "Wishing you a very happy birthday Nisham";
	}
}
