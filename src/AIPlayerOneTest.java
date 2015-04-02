import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.Test;

public class AIPlayerOneTest {
	int gridDim = 3;
	String X = "X";
	String O = "O";
	String b = "-"; //'b' for blank.

	@Test
//	public void FirstPlay_Center() {
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 1;
//		String[][] grid = { { b, b, b }, { b, b, b },{ b, b, b } };
//
//		mac.makeAIPlay(player, turns, grid);
//
//		assertEquals("Grid center should be O ", grid[1][1], O);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
//	public void SecondPlay_Corner_X(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 2;
//			//Set up grid: O in center, X in corner
////		String[][] grid = { { b, b, b }, { b, O, b },{ b, b, X } }; 
//		String[][] grid = { { b, b, b }, { b, O, b },{ X, b, b } }; 
////		String[][] grid = { { X, b, b }, { b, O, b },{ b, b, b } }; 
////		String[][] grid = { { b, b, X }, { b, O, b },{ b, b, b } };
//		
//		
//		mac.makeAIPlay(player, turns, grid);
//
////		assertEquals("AI makes a play in the opposite diagonal of X.", O, grid[0][0]);
//		assertEquals("AI makes a play in the opposite diagonal of X.", O, grid[0][2]);
////		assertEquals("AI makes a play in the opposite diagonal of X.", O, grid[2][2]);
////		assertEquals("AI makes a play in the opposite diagonal of X.", O, grid[2][0]);
//
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
//	public void SecondPlay_ColumnX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 2;
//		
//		//Set up grid: O in center, X not in corner
//		
////		String[][] grid = { { b, X, b }, { b, O, b },{ b, b, b } };
//		String[][] grid = { { b, b, b }, { X, O, b },{ b, b, b } };
//
//		mac.makeAIPlay(player, turns, grid);
//		
////		assertEquals("AI makes a corner play in the same row or column of X.", O, grid[0][0]); //OR grid[0][2]
//		assertEquals("AI makes a corner play in the same row or column of X.", O, grid[0][0]); //OR grid[2][0]
//				
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
	public void ThirdPlay_CornerX(){
		AIPlayer mac = new AIPlayer();
		int player = 1;
		int turns = 3;
		
//		String[][] grid = { { X, b, X }, { b, O, b },{ b, b, O } };
		String[][] grid = { { X, b, b }, { b, O, b },{ X, b, O } };
//		String[][] grid = { { X, X, b }, { b, O, b },{ b, b, O } }; 
//		String[][] grid = { { X, b, b }, { X, O, b },{ b, b, O } }; 
//		String[][] grid = { { X, b, b }, { b, O, X },{ b, b, O } }; 
//		String[][] grid = { { b, b, X }, { b, O, b },{ O, X, b } }; 
//		
		mac.makeAIPlay(player, turns, grid);
		
//		assertEquals("AI blocks row win.", O, grid[0][1]); 
//		assertEquals("AI blocks column win ", O, grid[1][0]); 
//		assertEquals("AI makes makes dilemma play, sets up win.", O, grid[0][2]); 
//		assertEquals("AI makes dilemma play, sets up win.", O, grid[2][0]); 
		
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " | ");
			}
			System.out.print("\n");
		}
	}
//	
//	public void ThirdPlay_ColumnOrRowX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 3;
//		
////		String[][] grid = { { O, X, b }, { b, O, X },{ b, b, b } }; // Player 2 doesn't block diagonal
////		String[][] grid = { { b, X, O }, { b, O, X },{ b, b, b } }; // Player 2 doesn't block diagonal
//		String[][] grid = { { O, b, b }, { b, O, X },{ b, b, X } }; // Player 2 blocks diagonal
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("AI completes the diagonal for the win.", O, grid[2][0]); 
//		assertEquals("AI makes dilemma play setting up win.", O, grid[0][2]);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	

//	public void FourthPlay_Win(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 4;
//		
////		String[][] grid = { { X, b, X }, { X, O, b },{ O, b, O } }; 
////		String[][] grid = { { X, X, O }, { b, O, b },{ X, b, O } }; 
////		String[][] grid = { { b, b, O }, { b, O, X },{ X, X, O } }; 
//		String[][] grid = { { X, b, b }, { X, O, b },{ O, X, O } }; 
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//
////	 	assertEquals("Player 2 blocks diagonal, AI makes a row play to win.", O, grid[2][1]);
////	 	assertEquals("Player 2 blocks diagonal, AI makes a column play to win.", O, grid[1][2]);
////		assertEquals("Player 2 blocks column, AI makes winning diagonal play.", O, grid[0][0]);
//		assertEquals("Player 2 blocks column, AI makes winning diagonal play.", O, grid[0][2]);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
//	public void FourthPlay_nonWin(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 4;
//		
////		String[][] grid = { { X, O, X }, { b, O, b },{ b, X, O } };
//		String[][] grid = { { X, b, b }, { O, O, X },{ X, b, O } };
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("Player 2 blocks column win, AI makes a play in last open row.", O, grid[1][0]);
//		assertEquals("Player 2 blocks row win, AI makes a play in last open column.", O, grid[2][1]);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
//	public void FifthPlay_WinOrCatsGame(){
//		AIPlayer mac = new AIPlayer();
//		int player = 1;
//		int turns = 5;
//		
////		String[][] grid = { { X, O, X }, { b, O, O },{ X, X, O } };
////		String[][] grid = { { X, b, X }, { O, O, X },{ X, O, O } };
//		String[][] grid = { { X, X, b }, { O, O, X },{ X, O, O } };
//		
//		mac.makeAIPlay(player, turns, grid);
//		
////		assertEquals("Player 2 doesn't block row, AI makes a winning play.", O, grid[1][0]);
////		assertEquals("Player 2 doesn't block win, AI makes a winning play in column.", O, grid[0][1]);
//		assertEquals("Player 2 blocks win, AI makes a play in last space. Game result: draw.", O, grid[0][2]);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
}