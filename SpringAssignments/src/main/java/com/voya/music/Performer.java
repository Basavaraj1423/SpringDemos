package com.voya.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	IInstrument voilin;
	@Autowired
	IInstrument keyboard;
	@Autowired
	IInstrument guitar;
	void playMusic(String choice, String song) {
		if(choice.equals("v")) {
			voilin.play(song);
		}else if(choice.equals("k")) {
			keyboard.play(song);
		}else if(choice.equals("g")) {
			guitar.play(song);
		}
	}
}
