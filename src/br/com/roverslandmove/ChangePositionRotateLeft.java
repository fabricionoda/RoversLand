package br.com.roverslandmove;

import utils.StringPosition;
import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.ChangePosition;
import br.com.roverslandmove.interfaces.Cordinate;

public class ChangePositionRotateLeft implements ChangePosition {

	@Override
	public String change(String position) {

		char cordinate = StringPosition.getCoordinate(position);
		char[] pos = position.trim().toCharArray();
		
		Cordinate rotation = new Rotation(); 		
		
		pos[3] = rotation.getNextCordinate(cordinate, TurnEnum.L);
		
		return pos.toString();
	}

}
