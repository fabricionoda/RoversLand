package br.com.roverslandmove;

import utils.StringPosition;
import br.com.roverslandmove.enums.Move;
import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.ChangePosition;
import br.com.roverslandmove.interfaces.Cordinate;

public class ChangePositionMove implements ChangePosition {

	@Override
	public String change(String position) {
		
		Move moveOnLand = new MoveOnLand(); 		
		
		String moving = moveOnLand.ahead(position);
		
		return moving;
	}
}
