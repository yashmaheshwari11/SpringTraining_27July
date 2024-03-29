package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*Author: Yash Maheshwari
Creation Date: 27-07-2019 12:51PM IST
Modified Date: 27-07-2019 12:51PM IST
Version: 1.0
Copyright: Zensar Technologies. All rights reserved.
Description: It is used to represent instrumentalist of zensar idol competition.
*/
public class Instrumentalist implements Performer {
	
	
	private String song;
	
	private Instrument instrument ;

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
		System.out.println(song);
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}

	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing a song ");
		instrument.play();
		
	
	}

}
