package br.com.roverslandmove;

import br.com.roverslandmove.enums.Move;
import br.com.roverslandmove.interfaces.ChangePosition;

public class ChangePositionMove implements ChangePosition {

	@Override
	public String change(String position) {
		
		Move moveOnLand = new MoveOnLand(); 		
		
		String moving = moveOnLand.ahead(position);
		
		return moving;
	}
}
