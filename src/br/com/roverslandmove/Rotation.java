package br.com.roverslandmove;

import br.com.roverslandmove.enums.CordinateEnum;
import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.Cordinate;

public class Rotation implements Cordinate {

	@Override
	public char getNextCordinate(char cordinate, TurnEnum turn) {
		if (turn == TurnEnum.L){
			return 'N';
		}
		return 'N';
	}


	
}
