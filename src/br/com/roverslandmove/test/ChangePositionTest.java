package br.com.roverslandmove.test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.roverslandmove.ChangePositionMove;
import br.com.roverslandmove.ChangePositionRotateLeft;
import br.com.roverslandmove.ChangePositionRotateRight;

import br.com.roverslandmove.interfaces.ChangePosition;


public class ChangePositionTest {
	private ChangePosition changePositionLeft; 
	private ChangePosition changePositionRight; 
	private ChangePosition changePositionMove; 

	@Before
	public void init(){
		changePositionLeft = new ChangePositionRotateLeft();
		changePositionRight = new ChangePositionRotateRight();
		changePositionMove = new ChangePositionMove();
	}
	
	@Test
	public void rotateLeft(){
		assertEquals("5 5 W",changePositionLeft.change("5 5 N"));
	}
	@Test
	public void rotateRight(){
		assertEquals("5 5 E",changePositionRight.change("5 5 N"));
	}
	@Test
	public void move(){
		assertEquals("5 5 N",changePositionMove.change("5 6 N"));
	}
}
