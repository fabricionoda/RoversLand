package br.com.roverslandmove;

import java.util.HashMap;
import java.util.Map;

import br.com.roverslandmove.interfaces.ChangePosition;
import br.com.roverslandmove.interfaces.Robot;

public class Rovers implements Robot {
	
	private String id;	
	private String position = "0 0 N";
	private Map<String, ChangePosition> changePositionTypeMap;

	public Rovers(){
		changePositionTypeMap = new HashMap<String, ChangePosition>();
	}
	
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
	public String getPosition() {
		return position;
	}

	@Override
	public void move(String instructions) {	
		char[] inst = instructions.trim().toCharArray();
		for (char c : inst) {
			
			changeObjectPosition(c);
		}
	}
	
	public void changeObjectPosition(char c) {		
		changePositionTypeMap.put("L", new ChangePositionRotateLeft());
		changePositionTypeMap.put("R",new ChangePositionRotateRight());
		changePositionTypeMap.put("M",new ChangePositionMove());
		ChangePosition changePosition = changePositionTypeMap.get(Character.toString(c));
		this.position = changePosition.change(position);
	}
}
