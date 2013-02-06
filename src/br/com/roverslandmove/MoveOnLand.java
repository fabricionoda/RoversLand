package br.com.roverslandmove;

import utils.StringPosition;
import br.com.roverslandmove.enums.Move;

public class MoveOnLand implements Move{
	//TODO: Rewrite
	@Override
	public String ahead(String position) {
		char x = StringPosition.getX(position);
		char y = StringPosition.getY(position);
		char cordinate = StringPosition.getCoordinate(position);
		char[] pos = position.trim().toCharArray();
		
		if (cordinate == 'N')
			pos[2] = movePlus(y);
		if (cordinate == 'S')
			pos[2] = moveMinus(y);		
		if (cordinate == 'E')
			pos[0] = movePlus(x);	
		if (cordinate == 'W')
			pos[0] = moveMinus(x);	
		
		return new String(pos);
	}

	private char moveMinus(char in) {
		int current = (char) in;
		int result = current - 1;
		return (char) (result);
	}

	private char movePlus(char in) {
		int current = (char) in;
		int result = current + 1;
		return (char) (result);
	}
	
	
}
