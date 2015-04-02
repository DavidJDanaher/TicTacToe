
import java.util.Random;

public class AIPlayer {
	
	private static final int N = 3;
	boolean madePlay = false;
	String X = "X";
	String O = "O";
	String empty = "-";	
		
	public String[][] makeAIPlay(int player, int turnNumber, String[][] grid ){
		if(player==1){			
			switch(turnNumber){
				case 1: 
					madePlay = false;
					playCenter(grid);
						break;
					
				case 2:	
					madePlay = false;
					playOppositeCorner(grid); 
					if (!playHasBeenMade()){		playSharedCorner(grid);			}
						break;
					
				case 3: 
					madePlay = false;
					playDownwardDiagonalWin(grid);  
					if (!playHasBeenMade()){		playUpwardDiagonalWin(grid); 		}
					if (!playHasBeenMade()){		blockRowWin(grid); 			}	
					if (!playHasBeenMade()){		blockColumnWin(grid);			}
					if (!playHasBeenMade()){		makeDilemmaPlay(grid);			}
						break;
			
				case 4:
					madePlay = false;
					playRowWin(grid);
					if (!playHasBeenMade()){	playColumnWin(grid);				}
					if (!playHasBeenMade()){	playUpwardDiagonalWin(grid);			}
					if (!playHasBeenMade()){	playDownwardDiagonalWin(grid);			}
					if (!playHasBeenMade()){	playColumn(grid);				}
					if (!playHasBeenMade()){	playRow(grid);					}
						break;
					
				case 5:
					madePlay = false;
					playRowWin(grid);
					if (!playHasBeenMade()){	playColumnWin(grid);				}
					if (!playHasBeenMade()){	playArbitrary(grid);				}
						break;
					}		
				} 
			
	
		else if (player == 2){
			switch(turnNumber){
				case 1:
					madePlay = false;
					playCenter(grid);
					if (!playHasBeenMade()){  	playAnyCorner(grid);				}				
					break;
					
				case 2:
					madePlay = false;
					blockUpDiagonalWin(grid);		
					if (!playHasBeenMade()){	blockDownDiagonalWin(grid);			}	
					if (!playHasBeenMade()){	blockColumnWin(grid);				}				
					if (!playHasBeenMade()){	blockRowWin(grid);				}	
					if (!playHasBeenMade()){	playRow(grid);					}
					if (!playHasBeenMade()){	playColumn(grid);				}
					if (!playHasBeenMade()){	playSharedCorner(grid);				}
					break;	
					
				case 3:
					madePlay = false;
					playRowWin(grid);		
					if (!playHasBeenMade()){	playColumnWin(grid);				}
					if (!playHasBeenMade()){	playDownwardDiagonalWin(grid)			}
					if (!playHasBeenMade()){	playUpwardDiagonalWin(grid); 			}
					if (!playHasBeenMade()){	blockColumnWin(grid); 				}
					if (!playHasBeenMade()){	blockRowWin(grid); 				}
					if (!playHasBeenMade()){	blockUpDiagonalWin(grid);			}
					if (!playHasBeenMade()){	blockDownDiagonalWin(grid);			}
					if (!playHasBeenMade()){	playOpenCorner(grid);				}	
					if (!playHasBeenMade()){	playRow(grid);					}
					if (!playHasBeenMade()){	playColumn(grid);				}
					break;	
					
				case 4:
					madePlay = false;
					playRowWin(grid);
					if (!playHasBeenMade()){	playColumnWin(grid);				}
					if (!playHasBeenMade()){	playUpwardDiagonalWin(grid);			}
					if (!playHasBeenMade()){	playDownwardDiagonalWin(grid);			}
					if (!playHasBeenMade()){	blockColumnWin(grid); 				}
					if (!playHasBeenMade()){	blockRowWin(grid); 				}	
					if (!playHasBeenMade()){	blockUpDiagonalWin(grid);			}
					if (!playHasBeenMade()){	blockDownDiagonalWin(grid);			}
					if (!playHasBeenMade()){	playArbitrary(grid);				}
					break;
				}
			}
		return grid;
	}
	
		private void playCenter(String[][] grid){
			//Check if center is empty and places an O there.
			if (grid[1][1] == empty) { 
			
					grid[1][1] = O;
					madePlay = true;
				}
			}
	
		
		private void playOppositeCorner(String[][] grid){
			//Checks for an X in the corner and plays an O in the corner of an opposite diagonal
			for (int i = 0; i < 2 ; i++ ){
				for (int j = 0; j < 2 ; j++){
					if (grid[(i % 2) * 2][(j % 2) * 2] == X){
						
						grid[((i+1) % 2) * 2][((j+1) % 2) * 2] = O; //Plays corner opposite X
						madePlay = true;
						break;
						}
					}
				}
			}
		

		private void playSharedCorner(String[][] grid){
			//Plays the corner opposite X
				Random rand = new Random();
				int x = rand.nextInt(2) * 2; //Either this gives me 0 or 2.  Places O in random corner

				for (int i = 0; i < 2 ; i++ ){
					if(grid[i*2][1] == X){
						grid[i*2][x] = O;
						madePlay = true;
						break;
					}			
					else if(grid[1][i*2] == X){
						grid[x][i*2] = O;
						madePlay = true;
						break;
					}	
				}
			}
				
		
		private void blockRowWin(String[][] grid){
			// Checks for consecutive X's in rows and places an O in the empty space if found
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					if (grid[i][j % N] == grid[i][(j+1) % N] 
							&& grid[i][j % N] == X
							&& grid[i][(j+2) % N] == empty){ 
					
						grid[i][(j+2) % N] = O;
						madePlay = true;
						break;
					}
				}
			}
		}
		
		private void blockColumnWin(String[][] grid){
			// Checks for consecutive X's in columns and places an O in the empty space if found
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){

					if (grid[i % N][j % N] == grid[(i+1) % N][j% N] 
							&& grid[i % N][j% N] == X
							&& grid[(i+2) % N][j% N] == empty){ 
						
						grid[(i+2) % N][j% N] = O;
						madePlay = true;
					}
				}
			}
		}
		
		
		private void makeDilemmaPlay(String[][] grid){
			// Locates the corner O and places an O in that row or column where there is no X.  
			// This gives player 2 a dilemma of being unable to block both possible wins
			
			for (int i = 0; i < 2; i++){
				for (int j = 0; j < 2; j++){
					if (grid[i*2][j*2] == O){
						if (grid[(i*2+1) % N][j*2] == empty && grid[(i*2+2) % N][j*2] == empty){
							grid[(i*2+1) % N][j*2] = O;
							madePlay = true;
						}
						
						else if (grid[i*2][(j*2+1) % N] == empty && grid[i*2][(j*2+2) % N] == empty){
							grid[i*2][(j*2+1)%N] = O;
							madePlay = true;
						}
					}
				}
			}
		}
		
		private void playAnyCorner(String[][] grid){
			// Places O in random corner
			Random rand1 = new Random();
			Random rand2 = new Random();
			int x = rand1.nextInt(2) * 2; //Either this gives me 0 or 2. 
			int y = rand2.nextInt(2) * 2; 
			
			grid[x][y] = O;
			madePlay = true;
			
		}
		
		private void playOpenCorner(String[][] grid){
			//Plays open corner only if opposite an occupied diagonal
			if(grid[0][2] != empty && grid[2][0] != empty){
				
				if(grid[0][0] == empty && grid[2][2]!= empty){
					grid[0][0] = O;
					madePlay = true;
					}
				else if(grid[2][2] == empty && grid[0][0]!= empty){
					grid[2][2] = O;
					madePlay = true;
					}
				else if(grid[0][0] == empty && ((grid[1][0] != X && grid[2][0] != X) || (grid[0][1] != X && grid[0][2] != X))){
						grid[0][0] = O;
						madePlay = true;
					}
				else if(grid[2][2] == empty && ((grid[0][2] != X && grid[1][2] != X) || (grid[2][0] != X && grid[2][1] != X))){
					grid[2][2] = O;
					madePlay = true;
					}
				else if(grid[0][0] == empty){
					grid[0][0] = O;
					madePlay = true;
					}
				else if(grid[2][2] == empty){
					grid[2][2] = O;
					madePlay = true;
					}
				}
			
			else if(grid[0][0] != empty && grid[2][2]  != empty ){
				
				if(grid[2][0] == empty && grid[0][2]!= empty){
					grid[2][0] = O;
					madePlay = true;
					}
				else if(grid[0][2] == empty && grid[2][0]!= empty){
					grid[0][2] = O;
					madePlay = true;
					}
				else if(grid[2][0] == empty && ((grid[1][0] != X && grid[0][0] != X) || (grid[2][1] != X && grid[2][2] != X))){
					grid[2][0] = O;
					madePlay = true;
					}
				else if(grid[0][2] == empty && ((grid[1][2] != X && grid[2][2] != X) || (grid[0][0] != X && grid[0][1] != X))){
					grid[0][2] = O;
					madePlay = true;
					}
				else if(grid[2][0] == empty){
					grid[2][0] = O;
					madePlay = true;
					}
				else if(grid[0][2] == empty){
					grid[0][2] = O;
					madePlay = true;
					}	
				}		
			}
		
		
		
		
		private void blockDownDiagonalWin(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				// Check for consecutive X's in diagonals
					if (grid[i % N][i % N] == grid[(i+1) % N][(i+1) % N] 
							&& grid[i % N][i % N] == X 
							&& grid[(i+2) % N][(i+2) % N] == empty){
						
						grid[(i+2) % N][(i+2) % N] = O;
						madePlay = true;

						break;
						}
					}
				}
		
		private void blockUpDiagonalWin(String[][] grid){
			for (int i = 0, j = 5; i < N ; i++, j--){
				if (grid[i % N][j % N] == grid[(i+1) % N][(j-1) % N] 
						&& grid[i % N][j % N] == X
						&& grid[(i+2) % N][(j-2) % N] == empty ){
					// Check for consecutive X's in diagonals
					grid[(i+2) % N][(j-2) % N] = O;
					madePlay = true;

					break;
					}
				}
			}
				
		
		private void playDownwardDiagonalWin(String[][] grid) {
			for (int i = 0; i < N ; i++ ){	
				// Check for consecutive O's in diagonal and place winning O.
				if (grid[i % N][i % N] == grid[(i+1) % N][(i+1) % N] 
							&& grid[i % N][i % N] == O 
							&& grid[(i+2) % N][(i+2) % N] == empty){
						
						grid[(i+2) % N][(i+2) % N] = O;
						madePlay = true;

				}
					}
				}
		private void playUpwardDiagonalWin(String[][] grid){
			// Check for consecutive O's in diagonal and place winning O.
			for (int i = 0, j = 5; i < 3 ; i++, j--){
					if (grid[i % 3][j % 3] == grid[(i+1) % 3][(j-1) % 3] 
							&& grid[i % 3][j % 3] == O
							&& grid[(i+2) % 3][(j-2) % 3] == empty ){
						
						grid[(i+2) % 3][(j-2) % 3] = O;
						madePlay = true;

						break;
						}
					}	
				}	
		
		private void playRowWin(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					if (grid[i][j % N] == grid[i][(j+1) % N] 
							&& grid[i][j % N] == O
							&& grid[i][(j+2) % N] == empty){
						// Check for consecutive X's in rows
						grid[i][(j+2) % N] = O;
						madePlay = true;

						break;
					}
				}
			}
		}
			
		private void playColumnWin(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					if (grid[i % N][j % N] == grid[(i+1) % N][j% N] 
							&& grid[i % N][j% N] == O
							&& grid[(i+2) % N][j% N] == empty){
						// Check for consecutive O's in columns
						grid[(i+2) % N][j% N] = O;
						madePlay = true;

						break;
					}
				}
			}
		}
		
		private void playColumn(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					//Look for a column with only O's
					if (grid[i % N][j % N] == grid[(i+1) % N][j% N] 
							&& grid[i % N][j% N] == empty
							&& grid[(i+2) % N][j% N] == O){
						
						grid[i % N][j% N] = O;
						madePlay = true;
					}
				}
			}
		}
		
		private void playRow(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					//Look for a row with only O
					if (grid[i][j % N] == grid[i][(j+1) % N] 
							&& grid[i][j % N] == empty
							&& grid[i][(j+2) % N] == O){
						
						grid[i][j % N] = O;
						madePlay = true;

						break;
					}
				}
			}
		}
		
		private void playArbitrary(String[][] grid){
			for (int i = 0; i < N ; i++ ){
				for (int j = 0; j < N ; j++){
					if (grid[i][j] == empty && madePlay == false){
						grid[i][j] = O;
						madePlay = true;

						break;
					}
				}
			}
		}
		
		
		private boolean playHasBeenMade(){
			return madePlay;
		}
		
	}
