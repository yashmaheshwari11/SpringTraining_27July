package com.zensar.spring.poems;

/*Author: Yash Maheshwari
Creation Date: 27-07-2019 12:51PM IST
Modified Date: 27-07-2019 12:51PM IST
Version: 1.0
Copyright: Zensar Technologies. All rights reserved.
Description: It represents TwinkleTwinkle poem.
*/

public class TwinkleTwinkle implements Poem {
	
	private final static String LINES[]= {
			"Twinkle Twink Little Star",
			"How I wonder what you are",
			"up aboce worls so high",
			"Like a diamond in the sky"
	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for(String line: LINES)
			System.out.println(line);

	}

}
