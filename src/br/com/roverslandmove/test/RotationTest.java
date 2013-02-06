package br.com.roverslandmove.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.roverslandmove.Rotation;
import br.com.roverslandmove.enums.TurnEnum;
import br.com.roverslandmove.interfaces.Cordinate;

public class RotationTest {
	
	private Cordinate rotation;
	@Before
	public void init(){
		rotation = new Rotation();
	}
	@Test
	public void rotateToLeftStartingOnEast (){		
		assertEquals('N',rotation.getNextCordinate('E', TurnEnum.L));
	}
	@Test
	public void rotateToLeftStartingOnNorth (){		
		assertEquals('W',rotation.getNextCordinate('N', TurnEnum.L));
	}
	@Test
	public void rotateToLeftStartingOnWest (){		
		assertEquals('S',rotation.getNextCordinate('W', TurnEnum.L));
	}
	@Test
	public void rotateToLeftStartingOnSouth (){		
		assertEquals('E',rotation.getNextCordinate('S', TurnEnum.L));
	}
	@Test
	public void rotateToRightStartingOnEast (){		
		assertEquals('S',rotation.getNextCordinate('E', TurnEnum.R));
	}
	@Test
	public void rotateToRightStartingOnNorth (){		
		assertEquals('E',rotation.getNextCordinate('N', TurnEnum.R));
	}
	@Test
	public void rotateToRightStartingOnWest (){		
		assertEquals('N',rotation.getNextCordinate('W', TurnEnum.R));
	}
	@Test
	public void rotateToRightStartingOnSouth (){		
		assertEquals('W',rotation.getNextCordinate('S', TurnEnum.R));
	}
}
