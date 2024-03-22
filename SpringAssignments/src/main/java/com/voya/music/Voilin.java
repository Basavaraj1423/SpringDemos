package com.voya.music;

import org.springframework.stereotype.Component;

@Component
public class Voilin implements IInstrument {

	@Override
	public void play(String song) {
		System.out.println("The song playing in Voilin " + song);
		
	}

}
