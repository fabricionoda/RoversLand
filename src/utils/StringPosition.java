package utils;

import java.io.Serializable;

public final class StringPosition extends Object implements Serializable {

	public static char getX(String position) {
		return position.trim().charAt(0);
	}

	public static char getY(String position) {
		return position.trim().charAt(1);
	}

	public static char getCoordinate(String position) {
		return position.trim().charAt(3);
	}

}
