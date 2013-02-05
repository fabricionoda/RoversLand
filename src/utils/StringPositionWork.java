package utils;

import java.io.Serializable;

public final class StringPositionWork extends Object implements Serializable{
	public static class StrinPosition{
		
		public char getX(String position){
			return position.trim().charAt(0);		
		}
		
		public char getY(String position){
			return position.trim().charAt(1);				
		}
		
		public char getCoordinate(String position){
			return position.trim().charAt(3);		
		}		
		
	}

}
