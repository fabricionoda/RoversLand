package br.com.roverslandmove;

import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.Cordinate;

public class Rotation implements Cordinate {

	@Override
	public char getNextCordinate(char cordinate, TurnEnum turn) {
		//TODO: Rewrite
		if (turn == TurnEnum.L){
			if (cordinate == 'E')
				return 'N';
			if (cordinate == 'N')
				return 'W';
			if (cordinate == 'W')
				return 'S';
			if (cordinate == 'S')
				return 'E';			
		}
		if (turn == TurnEnum.R){
			if (cordinate == 'E')
				return 'S';
			if (cordinate == 'S')
				return 'W';
			if (cordinate == 'W')
				return 'N';
			if (cordinate == 'N')
				return 'E';			
		}
		return 'N';
		
	}


	
}
