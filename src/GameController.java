import java.util.Random;

public class GameController {	
		private static final String X = "X";
		private static final String O = "O";
		private static final String EMPTY = "-";

		String player1 = null;
		String player2 = null;
		int coinFlip = -1;
		

		private String[][] gameBoard = new String[3][3];

		public GameController() {			

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					gameBoard[i][j] = EMPTY;
				}
			}
		
			Random rand = new Random();
			coinFlip = rand.nextInt(2);
			if(coinFlip == 0){
				player1 = "You";
				player2 = "I";
		
			}
			else if (coinFlip == 1){
				player1 = "I";
				player2 = "You";
			
			}
		
		}
		
		public void executePlays(int turn, int row, int column, AIPlayer computer){
			if(player1 == "You"){
				gameBoard[row][column] = X;
				computer.makeAIPlay(2, turn, gameBoard);
			}
			else{
				gameBoard[row][column] = X;
				computer.makeAIPlay(1, (turn+1), gameBoard);
			}	
		}
		
		public String[][] getGrid(){
			return gameBoard;
		}
		
		public String getPlayer(){
			return player1;
		}
		
		public String getCoinFlip(){
			
			if (coinFlip == 0){
				return "heads";
			}
			else {
				return "tails";
				}
		}
		
		public void printGameBoard(String[][] gameBoard){
			
			for(int i = 0; i < 3; i++){
				System.out.print("| ");
				for(int j = 0; j < 3; j++){
					System.out.print( gameBoard[i][j] + " | " );
					}
				System.out.print("\n");
			}	
			System.out.println("\n");	
		} 	
}