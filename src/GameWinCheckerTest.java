import static org.junit.Assert.*;

import org.junit.Test;

public class GameWinCheckerTest {
String b = "-";
String x = "x";
String o = "o";
	
	@Test
	public void gameWinTest() {
		GameWinChecker check = new GameWinChecker();
				
//		String[][] grid = {{b,b,b},{b,b,b},{b,b,b}};
//		check.checkForWin(grid, x, o, b);
//		assertEquals("Null board", false, check.getGameStatus());
//		assertEquals("Null board", null, check.getWinner());
//		
		String[][] grid = {{o,x,x},{o,b,b},{b,b,b}};
//		String[][] grid = {{o,x,x},{x,x,b},{o,b,b}};
		check.checkForWin(grid, x, o, b);
		assertEquals("Incomplete win", false, check.getGameOver());
		assertEquals("Incomplete win", null, check.getWinner());
	
//		String[][] grid = {{o,x,o},{x,x,b},{o,o,o}}; // Row win
////		String[][] grid = {{o,x,o},{x,x,b},{o,x,o}}; // column win
////		String[][] grid = {{o,x,o},{x,o,b},{x,x,o}}; // diagonal win
////		String[][] grid = {{o,x,o},{x,o,b},{o,x,x}}; // diagonal win
//		
//		check.checkForWin(grid, x, o, b);
//		assertEquals("Win", true, check.getGameOver());
//		assertEquals("Win", x, check.getWinner());

	}

}