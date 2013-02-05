package br.com.roverslandmove;

import br.com.roverslandmove.interfaces.Robot;

public class Rovers implements Robot {
	
	private String id;	
	private String position;

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setPosition(String position) {
		this.position = position;	
	}
	
	@Override
	public String getPosition(String instructions) {
		return position;
	}

	@Override
	public void move(String instructions) {
		// TODO Auto-generated method stub		
	}

}
