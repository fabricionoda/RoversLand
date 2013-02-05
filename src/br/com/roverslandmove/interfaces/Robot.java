package br.com.roverslandmove.interfaces;

public interface Robot {

	public void setId(String id);
	
	public String getId();
	
	public void setPosition(String firstPosition);

	public String getPosition();

	public void move(String instructions);
}
