package com.startjava.lesson_4.game;

public class Player {
	private int number;
	private String name;
	public int[] player1Numbers;
	public int[] player2Numbers;
		
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}