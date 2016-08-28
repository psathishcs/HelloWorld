package org.hello.design.gof.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playMp4(String fileName) {
		//No thing
	}
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file.name : " + fileName);
	}

}
