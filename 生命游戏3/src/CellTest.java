package Game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {




	private int[][] grid;

	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testCell() {
	int flag =0;
	     grid = new int[35][20];
	     for (int i = 0; i <= 34; i++) {
	            for (int j = 0; j <= 19 ; j++)
	               if( grid[i][j] != 0){flag=1;}
	        }
	     assertEquals(0,flag);
	}

	@Test
	public void testRandomCell() {
		int flag =0;
	     grid = new int[35][20];
	     for (int i = 0; i <= 34; i++) {
	            for (int j = 0; j <= 19 ; j++)
	            	 grid[i][j] = Math.random()>0.5?1:0;
	        }
	     for (int i = 0; i <= 34; i++) {
	            for (int j = 0; j <= 19 ; j++)
	               if( grid[i][j] != 0){flag=1;}
	        }
	     assertEquals(1,flag);
	}

	@Test
	public void testDeleteAllCell() {
		int flag =0;
	     grid = new int[35][20];
	     for (int i = 0; i <= 34; i++) {
	            for (int j = 0; j <= 19 ; j++)
	               if( grid[i][j] != 0){flag=1;}
	        }
	     assertEquals(0,flag);
	  
	}

}
