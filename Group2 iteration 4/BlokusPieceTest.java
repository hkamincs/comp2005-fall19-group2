import static org.junit.Assert.assertArrayEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlokusPieceTest {
														// I was unable to perform the testing properly
														// Mainly because most of our functions return void
														// This issue resulted in having void in our Assert Argument
														// which raised an errors when comparing the expected and the results
														// I Tried assertThat, assertEquals as well as AssertArrayEquals

	int firstShape[][] = new int[][] { 
			{0, 0, 0, 0, 0, 0, 0},
	        {0, 0, 0, 0, 0, 0, 0},											
	        {0, 0, 0, 0, 0, 0, 0},
	        {0, 1, 1, 1, 1, 1, 0},
	        {0, 0, 0, 0, 0, 0, 0},
	        {0, 0, 0, 0, 0, 0, 0},
	        {0, 0, 0, 0, 0, 0, 0}
	     };
     
     int firstShapeTurned[][] = new int[][] { 
	         {0, 0, 0, 0, 0, 0, 0},
	         {0, 0, 0, 1, 0, 0, 0},
	         {0, 0, 0, 1, 0, 0, 0},
	         {0, 0, 0, 1, 0, 0, 0},
	         {0, 0, 0, 1, 0, 0, 0},
	         {0, 0, 0, 1, 0, 0, 0},
	         {0, 0, 0, 0, 0, 0, 0}
	  };
	  
	  int secoundShape[][] = new int[][] {
	         {0, 0, 0, 0, 0, 0, 0}, 	
	         {0, 0, 0, 0, 0, 0, 0},
	         {0, 0, 1, 0, 0, 0, 0},
	         {0, 0, 1, 1, 1, 1, 0},
	         {0, 0, 0, 0, 0, 0, 0},
	         {0, 0, 0, 0, 0, 0, 0},
	         {0, 0, 0, 0, 0, 0, 0}
	      };
	      
	      BlokusPiece testing = new BlokusPiece(firstShape, 0); 
	    
	      BlokusPiece testingAnswer = new BlokusPiece(firstShapeTurned, 0); 
	    
	      
	

	@Test
	void testRotateClockwise() {
		assertEquals("testing the Clockwise rotation",testingAnswer, testing); 
	}

	@Test
	void testRotateCounterClockwise() {
		assertEquals("testing the Counter-Clockwise rotation",firstShapeTurned, testing);
	}

	@Test
	void testFlipOver() {
		assertEquals("testing the Flip rotation",firstShapeTurned, testing);
	}

	
}
