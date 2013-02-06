package br.com.roverslandmove.test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import br.com.roverslandmove.Rovers;
import br.com.roverslandmove.interfaces.Robot;

public class RoversMoveTest {
	private ArrayList<Robot> roversList; 

	@Before
	public void init(){
		roversList = new ArrayList<Robot>();
		Robot rovers1 = new Rovers();
		rovers1.setPosition("AX5461668");
		roversList.add(rovers1);
		
		Robot rovers2 = new Rovers();
		rovers2.setPosition("AY5461669");
		roversList.add(rovers2);
	}
	
	@Test
	public void move1(){
		String firstPosition = "1 2 N";
		String instructions = "LMLMLMLMM";
		roversList.get(0).setPosition(firstPosition);
		roversList.get(0).move(instructions);
		assertEquals("1 3 N",roversList.get(0).getPosition());
	}
	@Test
	public void move2(){
		String firstPosition = "3 3 E";
		String instructions = "MMRMMRMRRM";
		roversList.get(1).setPosition(firstPosition);
		roversList.get(1).move(instructions);
		assertEquals("5 1 E",roversList.get(1).getPosition());
	}
	

}
