package org.hello.design.gof.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file.name : " + fileName);
		
	}
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
	}
}
