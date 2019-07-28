package com.zensar.spring.performers;


/*Author: Yash Maheshwari
Creation Date: 27-07-2019 12:51PM IST
Modified Date: 27-07-2019 12:51PM IST
Version: 1.0
Copyright: Zensar Technologies. All rights reserved.
Description: It represents a performer jugler of Znesar Idol competition.
Juggler gets bean bags using constructor injection
*/

public class Juggler implements Performer {
	
	
	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor of juggler");
	}
	
	
	//business logic method of performer
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Parameterized constructor of juggler");
	}



	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling "+beanBags);

	}

}