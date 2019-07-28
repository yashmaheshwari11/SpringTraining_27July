package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*Author: Yash Maheshwari
Creation Date: 27-07-2019 12:51PM IST
Modified Date: 27-07-2019 12:51PM IST
Version: 1.0
Copyright: Zensar Technologies. All rights reserved.
Description: More skilled juggler who juggles while reciting a poem.
Poem is injected into PoeticJuggler usnig constructor injection.
*/


//Dependent object class
public class PoeticJuggler extends Juggler{
	
	//Dependency object
	private Poem poem;
	
	public PoeticJuggler() {
		System.out.println("No Arg-constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parameterized constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While recitingt a poem...");
		poem.recite();
	}
	
	
	
	/*
	 * public void perform() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
