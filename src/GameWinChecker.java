
public class GameWinChecker {
	boolean gameOver = false;
	String winner = null;

	public void checkForWin(String[][] grid, String x, String o, String blank) {

		for (int i = 0; i < 3; i++) {

			if ((grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2])
					&& grid[i][0] != blank) {
				gameOver = true;
				winner = grid[i][0];
				break;
			} else if ((grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i])
					&& grid[0][i] != blank) {
				gameOver = true;
				winner = grid[0][i];
				break;
			}

			else if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
					&& grid[0][0] != blank) {
				gameOver = true;
				winner = grid[0][0];
				break;
			}

			else if ((grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])
					&& grid[0][2] != blank) {
				gameOver = true;
				winner = grid[0][2];
				break;
			}

			else {
				gameOver = false;

			}
		}

	}

	public boolean getGameOver() {
		return gameOver;
	}

	public String getWinner() {
		return winner;
	}

}
