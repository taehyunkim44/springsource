package com.study.myapp;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체 생성");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker 륨 업");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker 볼륨 다운");
		
	}

}
