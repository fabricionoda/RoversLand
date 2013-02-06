package br.com.roverslandmove;

import utils.StringPosition;
import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.ChangePosition;
import br.com.roverslandmove.interfaces.Cordinate;

public class ChangePositionMove implements ChangePosition {

	@Override
	public String change(String position) {
		char x = StringPosition.getX(position);
		char y = StringPosition.getY(position);
		char cordinate = StringPosition.getCoordinate(position);
		char[] pos = position.trim().toCharArray();
		
		Cordinate rotation = new Rotation(); 		
		
		pos[4] = rotation.getNextCordinate(cordinate, TurnEnum.R);
		
		return new String(pos);
	}


}
