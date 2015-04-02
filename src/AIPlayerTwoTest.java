
import static org.junit.Assert.*;

import org.junit.Test;

public class AIPlayerTwoTest {
	int gridDim = 3;
	String X = "X";
	String O = "O";
	String b = "-"; //'b' for blank.

	@Test
//
//	public void FirstPlay_OepnCenter(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 1;
//		
//		String[][] grid = { { b, b, X }, { b, b, b },{ b, b, b } };
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
//		assertEquals("Center should be O", grid[1][1], O);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}

//	public void FirstPlay_CenterX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 1;
//		
//		String[][] grid = { { b, b, b }, { b, X, b },{ b, b, b } };
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("One of the four corners should be O", O, grid[0][0]); //OR grid[0][2], etc.
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//	}
	
	// --------   Second Play Tests -------------

//	public void SecondPlay_CenterX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 2;
////		String[][] grid = { { X, b, O }, { b, X, b },{ b, b, b } }; //Block downward diagonal
////		String[][] grid = { { b, b, b }, { b, X, b },{ O, b, X } }; //Block downward diagonal	
////		String[][] grid = { { O, b, X }, { b, X, b },{ b, b, b } }; //Block upward diagonal
////		String[][] grid = { { b, b, b }, { b, X, b },{ X, b, O } }; //Block upward diagonal
//	
////		String[][] grid = { { O, b, b }, { X, X, b },{ b, b, b } }; //Block Row
////		String[][] grid = { { O, X, b }, { b, X, b },{ b, b, b } }; //Block Column
//
//		String[][] grid = { { O, b, b }, { b, X, b },{ b, b, X } }; //Make play in open corner
////		String[][] grid = { { b, b, O }, { b, X, b },{ X, b, b } }; //Make play in open corner
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//
////		assertEquals("AI blocks win row 3, column 3 ", O, grid[2][2]);
////		assertEquals("AI blocks win row 1, column 1 ", O, grid[0][0]);
////		assertEquals("AI blocks win row 3, column 1 ", O, grid[2][0]);
////		assertEquals("AI blocks win row 1, column 3 ", O, grid[0][2]);
//		
////		assertEquals("AI blocks win in row 2", O, grid[1][2]);
////		assertEquals("AI blocks win in column 2", O, grid[2][1]);
//		
////		assertEquals("AI places O in open corner", O, grid[0][2]);
////		assertEquals("AI places O in open corner", O, grid[0][0]);
//		
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
	
	
//	public void secondPlay_CornerX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 2;
//		
////		String[][] grid = { { X, X, b }, { b, O, b },{ b, b, b } }; //X plays adjacent column or row
////		String[][] grid = { { b, b, X }, { b, O, X },{ b, b, b } }; //X plays adjacent column or row
//		
////		String[][] grid = { { X, b, b }, { b, O, b },{ b, X, b } }; //X plays opposite column or row
////		String[][] grid = { { b, b, b }, { b, O, X },{ X, b, b } }; //X plays opposite column or row
//
////		String[][] grid = { { b, b, b }, { b, O, b },{ X, b, X } }; //X plays adjacent corner
//		
//		String[][] grid = { { b, b, X }, { b, O, b },{ X, b, b } }; //X plays opposite corner in diagonal
//
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//
////		assertEquals("AI blocks win in row 1 ", O, grid[0][2]);
////		assertEquals("AI blocks win in column 3 ", O, grid[2][2]);
//		
////		assertEquals("AI plays O in open row.", O, grid[1][2] );
////		assertEquals("AI plays O in open column.", O, grid[2][1] );
//		
////		assertEquals("AI blocks row win.", O, grid[2][1] );
//		
//		assertEquals("AI plays O in row.", O, grid[1][2] );
//		
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//			}
//			System.out.print("\n");
//		}
//		
//	}
	
//	public void secondPlay_RowX(){
//	AIPlayer mac = new AIPlayer();
//	int player = 2;
//	int turns = 2;
//	
////	String[][] grid = { { X, b, b }, { X, O, b },{ b, b, b } }; //X plays corner in same column
////	String[][] grid = { { X, X, b }, { b, O, b },{ b, b, b } }; //X plays corner in same row
//	
////	String[][] grid = { { b, X, b }, { X, O, b },{ b, b, b } }; //X plays other row or column
////	String[][] grid = { { b, b, b }, { X, O, b },{ b, X, b } }; //X plays other row or column
//	
////	String[][] grid = { { b, b, X }, { X, O, b },{ b, b, b } }; //X plays opposite corner
////	String[][] grid = { { b, X, b }, { b, O, b },{ b, b, X } }; //X plays opposite corner
//
////	String[][] grid = { { b, X, b }, { b, O, b },{ b, X, b } }; //X plays opposite row or column
//	String[][] grid = { { b, b, b }, { X, O, X },{ b, b, b } }; //X plays opposite row or column
//
//	
//	mac.makeAIPlay(player, turns, grid, b, X, O);
//
////	assertEquals("AI blocks column win", O, grid[2][0] );
////	assertEquals("AI blocks row win", O, grid[0][2] );
//	
////	assertEquals("AI plays O in same row or column as X.", O, grid[0][2]); //OR grid[0][0]
////	assertEquals("AI plays O in same row or column as X.", O, grid[0][0]); //OR grid[2][0]
//
////	assertEquals("AI plays a column.", O, grid[2][1]);
////	assertEquals("AI plays a row.", O, grid[1][2]);
//	
////	assertEquals("AI plays a row.", O, grid[1][2]);
//	assertEquals("AI plays a column.", O, grid[2][1]);
//
//	
//	for (int i = 0; i < 3; i++) {
//		System.out.print("| ");
//		for (int j = 0; j < 3; j++) {
//			System.out.print(grid[i][j] + " | ");
//		}
//		System.out.print("\n");
//	}
//	
//}
	
	// --------   Third Play Tests -------------
	
//	public void thirdPlay_CenterX(){
//	AIPlayer mac = new AIPlayer();
//	int player = 2;
//	int turns = 3;
//	
////	String[][] grid = { { O, X, O }, { b, X, b },{ X, b, b } }; // X play 2 was corner, X play 3 blocks row win
////	String[][] grid = { { O, b, b }, { X, X, b },{ O, b, X } }; // X play 2 was corner, X play 3 blocks column win
//	
////	String[][] grid = { { O, b, O }, { X, X, b },{ X, b, b } }; // X play 2 was corner, X play 3 Doesn't block win
////	String[][] grid = { { O, b, X }, { b, X, X },{ O, b, b } }; // X play 2 was corner, X play 3 Doesn't block win
//	
////	String[][] grid = { { O, X, b }, { X, X, O },{ b, b, b } }; // X play 2 was an adjacent row/column, X play 3 is adjacent column / row
////	String[][] grid = { { O, b, b }, { X, X, O },{ b, X, b } }; // X play 2 was an adjacent row/column, X play 3 is opposite column / row
////	String[][] grid = { { O, b, b }, { X, X, O },{ X, b, b } }; // X play 2 was an adjacent row/column, X play 3 is corner in same row / column
////	String[][] grid = { { O, b, X }, { X, X, O },{ b, b, b } }; // X play 2 was an adjacent row/column, X play 3 is corner in opposite row / column
//	String[][] grid = { { O, b, b }, { X, X, O },{ b, b, X } }; // X play 2 was an adjacent row/column, X play 3 is corner in opposite O
//	
//	
////	String[][] grid = { { O, O, b }, { b, X, b },{ b, X, X } }; // X play 2 was an opposite row/column, X play 3 doesn't block O row/column win
////	String[][] grid = { { O, O, X }, { b, X, b },{ b, X, b } }; // X play 2 was an opposite row/column, X play 3 blocks O row/column win
//	
//	mac.makeAIPlay(player, turns, grid, b, X, O);
//	
////	assertEquals("AI blocks column win", O, grid[2][1] );
////	assertEquals("AI blocks row win", O, grid[1][2] );
//	
////	assertEquals("AI plays row win", O, grid[0][1] );
////	assertEquals("AI plays column win", O, grid[1][0] );
//	
////	assertEquals("AI blocks column win", O, grid[2][1] );
////	assertEquals("AI blocks column win", O, grid[0][1] );
////	assertEquals("AI blocks diagonal win and sets up dilemma", O, grid[0][2] );
////	assertEquals("AI blocks diagonal win", O, grid[2][0] );
//	assertEquals("AI plays open corner", O, grid[0][2] );
//	
////	assertEquals("AI completes row win", O, grid[0][2] );
////	assertEquals("AI blocks diagonal win", O, grid[2][0] );
//	
//	
//		for (int i = 0; i < 3; i++) {
//		System.out.print("| ");
//		for (int j = 0; j < 3; j++) {
//			System.out.print(grid[i][j] + " | ");
//		}
//		System.out.print("\n");
//	}
//	
//}
	
	
//	public void thirdPlay_CornerX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 3;
//		
////		String[][] grid = { { X, X, O }, { X, O, b },{ b, b, b } }; // X play 2 was adjacent row/column, X play 3 doesn't block diag win
////		String[][] grid = { { X, X, O }, { b, O, b },{ X, b, b } }; // X play 2 was adjacent row/column, X play 3 blocks diag win
//
////		String[][] grid = { { X, b, b }, { b, O, O },{ b, X, X } }; // X play 2 was opposite row/column, X play 3 doesn't block win
////		String[][] grid = { { X, b, b }, { X, O, O },{ b, X, b } }; // X play 2 was opposite row/column, X play 3 blocks row win
//
////		String[][] grid = { { X, O, X }, { b, O, b },{ X, b, b } }; // X play 2 was adjacent corner, X play 3 fails to block column win
////		String[][] grid = { { X, O, X }, { b, O, b },{ b, X, b } }; // X play 2 was adjacent corner, X play 3 blocks column win
//		
////		String[][] grid = { { X, b, b }, { b, O, b },{ X, O, X } }; // X play 2 was opposite corner, X play 3 doesn't block column win
//		String[][] grid = { { X, O, b }, { b, O, b },{ b, X, X } }; // X play 2 was opposite corner, X play 3 blocks column win
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("AI completes diagonal win", O, grid[2][0]);
////		assertEquals("AI blocks column win", O, grid[1][0]);
//		
////		assertEquals("AI plays row win", O, grid[1][0]);
////		assertEquals("AI blocks column win", O, grid[2][0]);
//		
////		assertEquals("AI completes column win", O, grid[2][1]);
////		assertEquals("AI plays open row", O, grid[1][2]);
//
////		assertEquals("AI plays column win", O, grid[0][1]);
//		assertEquals("AI plays open corner", O, grid[2][0]);
//
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
	
	
	public void thirdPlay_RowX(){
		AIPlayer mac = new AIPlayer();
		int player = 2;
		int turns = 3;
		
//		String[][] grid = {{b, b, b},{X, O, b},{b, b, b}}; //X play 2 was
		
//		String[][] grid = {{X, X ,O},{X ,O ,b},{b ,b ,b}}; //X play 2 was row, play 3 does not block diag
//		String[][] grid = {{X, b ,b},{X ,O ,b},{O ,X ,b}}; //X play 2 was row, play 3 does not block diag
		String[][] grid = {{b, b ,X},{X ,O ,b},{b ,X ,O}}; //X play 2 was row, play 3 does not block diag
//		String[][] grid = {{b, X ,O},{X ,O ,b},{X ,b ,b}}; //X play 2 was row, play 3 blocks diag
		
//		String[][] grid = {{b, b , X},{X ,O ,b},{X, O, b}}; //X play 2 was corner opposite row, play 3 does not block column
//		String[][] grid = {{b, X , X},{X ,O ,b},{b, O, b}}; //X play 2 was corner opposite row, play 3 blocks column

//		String[][] grid = {{b, b, b},{X, O, X},{X, O, b}}; //X play 2 was opposite row, play 3 does not block column win
//		String[][] grid = {{b, X, b},{X, O, X},{b, O, b}}; //X play 2 was opposite row, play 3 blocks column win


		mac.makeAIPlay(player, turns, grid);
		
//		assertEquals("AI ", O, grid[][]);
		
//		assertEquals("AI completes diagonal win", O, grid[2][0]);
//		assertEquals("AI blocks column win", O, grid[0][0]);
		
//		assertEquals("AI completes column win", O, grid[0][1]);
//		assertEquals("AI blocks row win", O, grid[0][0]);
		
//		assertEquals("AI completes column win", O, grid[0][1]);
//		assertEquals("AI plays adjacent corner, sets up dilemma win", O, grid[2][2]);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(grid[i][j] + " | ");
			}
			System.out.print("\n");
		}
	}
	
	// --------   Fourth Play Tests -------------
	
//	public void fourthPlay_CenterX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 4;
//		
////		String[][] grid = {{O, X, O},{X, X, b},{X, O, b}}; //X play 2 was corner, play 3 blocked row, play 4 open row
////		String[][] grid = {{O, X, O},{b, X, b},{X, O, X}}; //X play 2 was corner, play 3 blocked row, play 4 remaining corner
//		
////		String[][] grid = {{O, X, b},{X, X, O},{X, O, b}}; //X play 2 was adjacent row to O, play 3 was an adjacent row to O,
//															//play 4 was remaining corner
////		String[][] grid = {{O, X, b},{X, X, O},{b, O, X}}; //X play 2 was adjacent row to O, play 3 was an adjacent row to O,
//															//play 4 was remaining corner
////		String[][] grid = {{O, O, b},{X, X, O},{b, X, X}}; //X play 2 was adjacent row, play 3 was opposite row, play 4 doesn't block row win
////		String[][] grid = {{O, O, X},{X, X, O},{b, X, b}}; //X play 2 was adjacent row, play 3 was opposite row, play 4 blocks row win
//	
////		String[][] grid = {{O, b, O},{X, X, O},{X, b, X}}; //X play 2 was adjacent row, play 3 was adjacent corner, play 4 blocks column win
////		String[][] grid = {{O, X, O},{X, X, O},{X, b, b}}; //X play 2 was adjacent row, play 3 was opposite row, play 4 blocks row win
//
//		String[][] grid = {{O, X, O},{X, X, O},{b, b, X}}; //X play 2 was adjacent row, play 3 was opposite corner, play 4 blocks row win
//
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("AI blocks row win", O, grid[1][2]);
////		assertEquals("AI plays arbitrary empty space", O, grid[1][0]);
//		
////		assertEquals("AI blocks diagonal win", O, grid[0][2]);
////		assertEquals("AI makes arbitrary play", O, grid[0][2]);
//		
////		assertEquals("AI makes winning play in row", O, grid[0][2]);
////		assertEquals("AI blocks diagonal win", O, grid[2][0]);
//		
////		assertEquals("AI completes row win", O, grid[0][1]);
////		assertEquals("AI completes column win", O, grid[2][2]);
//		
//		assertEquals("AI blocks column win", O, grid[2][1]);
//
//		
//	for (int i = 0; i < 3; i++) {
//		System.out.print("| ");
//		for (int j = 0; j < 3; j++) {
//			System.out.print(grid[i][j] + " | ");
//		}
//		System.out.print("\n");
//	}
//}
	
//	public void fourthPlay_CornerX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 4;
//		
////		String[][] grid = {{X, X, O},{O, O, b},{X, X, b}}; //X play 2 was adjacent row, play 3 blocked diagonal win, 
//															//play 4 does not block row win
////		String[][] grid = {{X, X, O},{O, O, X},{X, b, b}}; //X play 2 was adjacent row, play 3 blocked diagonal win, 
////		//play 4 does not block row win
//
////		String[][] grid = {{X, X, b},{X, O, O},{O, X, b}}; //X play 2 was opposite row, play 3 blocked row win, 
//															// play 4 does not block diagonal
//		
////		String[][] grid = {{X, b, X},{X, O, O},{O, X, b}}; //X play 2 was opposite row, play 3 blocked row win, 
//															// play 4 blocks diagonal
//		
////		String[][] grid = { { X, O, X }, { b, O, O },{ b, X, X } }; // X play 2 was adjacent corner, X play 3 blocks column win
//																	//play 4 doesn't block row win
//		
////		String[][] grid = { { X, O, X }, { X, O, O },{ b, X, b } }; // X play 2 was adjacent corner, X play 3 blocks column win
//																	// play 4 blocks row win
//		
////		String[][] grid = { { X, O, b }, { X, O, b },{ O, X, X } }; // X play 2 was opposite corner, X play 3 blocks column win
//																	// play 4 doesn't block diag win
//		String[][] grid = { { X, O, X }, { b, O, b },{ O, X, X } }; // X play 2 was opposite corner, X play 3 blocks column win
//																	// play 4 blocks diag win
//		
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("AI completes row win", O, grid[1][2]);
////		assertEquals("AI plays arbitrary space (open corner)", O, grid[2][2]);
//		
////		assertEquals("AI completes diagonal win", O, grid[0][2]);	
////		assertEquals("AI blocks row win", O, grid[0][1]);
//		
////		assertEquals("AI completes row win", O, grid[1][0]);
////		assertEquals("AI blocks column win", O, grid[2][0]);
//		
////		assertEquals("AI completes diagonal win", O, grid[0][2]);
//		assertEquals("AI plays arbitrary space", O, grid[1][2]);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//				}
//			System.out.print("\n");
//		}
//	}
	
	
//	public void fourthPlay_RowX(){
//		AIPlayer mac = new AIPlayer();
//		int player = 2;
//		int turns = 4;
//		
////		String[][] grid = { { O, X, O }, { X, O, b },{ X, X, b} }; // X play 2 was adjacent row , X play 3 blocks diag win
//																	// play 4 doesn't block diag win
////		String[][] grid = { { O, X, O }, { X, O, b },{ X, b, X} }; // X play 2 was adjacent row , X play 3 blocks diag win
//																	// play 4 blocks diag win
//		
////		String[][] grid = { { O, X, X }, { X, O, b },{ X, O, b} }; // X play 2 was opposite corner , X play 3 plays same row
//																	// play 4 doesn't block diag win
////		String[][] grid = { { O, X, X }, { X, O, b }, { b, O, X }}; // X play 2 was opposite corner , X play 3 plays same row
//																	// play 4 blocks diag win
//		
////		String[][] grid = { { b, X, b }, { X, O, X }, { O, O, X }}; // X play 2 was opposite row , X play 3 blocks column win
//																	// play 4 blocks row win
//		String[][] grid = { { b, X, X }, { X, O, X }, { O, O, b }}; // X play 2 was opposite row , X play 3 blocks column win
//																	// play 4 blocks diag win
//
//
//		mac.makeAIPlay(player, turns, grid, b, X, O);
//		
////		assertEquals("AI completes diagonal win", O, grid[2][2]);
////		assertEquals("AI blocks row win", O, grid[2][1]);
//		
////		assertEquals("AI completes diagonal win", O, grid[2][2]);
////		assertEquals("AI blocks column win", O, grid[1][2]);
//		
////		assertEquals("AI completes diagonal win", O, grid[0][2]);
//		assertEquals("AI completes row win", O, grid[2][2]);

//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("| ");
//			for (int j = 0; j < 3; j++) {
//				System.out.print(grid[i][j] + " | ");
//				}
//			System.out.print("\n");
//		}
//	}
	

}