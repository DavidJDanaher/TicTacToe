import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class GameView extends JFrame {

	private static final String X = "X";
	private static final String O = "O";
	private static final String EMPTY = "-";
	
	JFrame gameFrame = new JFrame();
	JPanel topPanel = new JPanel();
	JPanel boardPanel = new JPanel();
	JPanel textPanel = new JPanel();
	JPanel commandButtonPanel = new JPanel();
		
	JLabel titleLabel = new JLabel("Let's play a game of Tic-Tac-Toe!");
	JLabel exitLabel = new JLabel("EXIT");
	JLabel newGameLabel = new JLabel("NEW GAME");
	JTextArea textWindow = new JTextArea();
	
	JButton exitButton = new JButton();
	JButton newGameButton = new JButton();
	JButton grid_0_0 = new JButton();
	JButton grid_0_1 = new JButton();
	JButton grid_0_2 = new JButton();
	JButton grid_1_0 = new JButton();
	JButton grid_1_1 = new JButton();
	JButton grid_1_2 = new JButton();
	JButton grid_2_0 = new JButton();
	JButton grid_2_1 = new JButton();
	JButton grid_2_2 = new JButton();
	JButton gridButtons[];
	
	
	Dimension boardPanelDim = new Dimension(400, 400);
	Dimension gridDimension = new Dimension(100, 100);
	Dimension frameDimension = new Dimension(450, 700);
	Dimension labelDim = new Dimension(400, 40);
	Dimension textDim = new Dimension(400, 150);
	Dimension buttonDim = new Dimension(150, 75);
	Dimension commandDim = new Dimension(400, 100);
	
	Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

	int numOfPlays = 0;
	
	GameController controller = new GameController();
	AIPlayer computer = new AIPlayer();
	GameWinChecker check = new GameWinChecker();
	
	
	public GameView(){
		
		titleLabel.setPreferredSize(labelDim);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBorder(labelBorder);
		topPanel.setLayout(new GridLayout(1,1));
		topPanel.add(titleLabel);
		
		gridButtons = new JButton[9];
		gridButtons[0] = grid_0_0;
		gridButtons[1] = grid_0_1;
		gridButtons[2] = grid_0_2;
		gridButtons[3] = grid_1_0;
		gridButtons[4] = grid_1_1;
		gridButtons[5] = grid_1_2;
		gridButtons[6] = grid_2_0;
		gridButtons[7] = grid_2_1;
		gridButtons[8] = grid_2_2;
		
		gridButtons[0].addActionListener(new Grid_0_0_Listener());
		gridButtons[1].addActionListener(new Grid_0_1_Listener());
		gridButtons[2].addActionListener(new Grid_0_2_Listener());
		gridButtons[3].addActionListener(new Grid_1_0_Listener());
		gridButtons[4].addActionListener(new Grid_1_1_Listener());
		gridButtons[5].addActionListener(new Grid_1_2_Listener());
		gridButtons[6].addActionListener(new Grid_2_0_Listener());
		gridButtons[7].addActionListener(new Grid_2_1_Listener());
		gridButtons[8].addActionListener(new Grid_2_2_Listener());
		
		
		for(int i = 0; i < 9; i++){
			gridButtons[i].setPreferredSize(gridDimension);
			boardPanel.add(gridButtons[i]);
			gridButtons[i].setFont(new Font("SansSerif", 1, 18));
			
		}
		
		boardPanel.setLayout(new GridLayout(3,3));
		boardPanel.setVisible(true);
		
		textWindow.setPreferredSize(textDim);
		textWindow.setLineWrap(true);
		textWindow.setEditable(false);
		textWindow.setFont(new Font("SansSerif", 1, 14));
		textPanel.setLayout(new GridLayout(1,1));
		textPanel.setBorder(labelBorder);
		textPanel.add(textWindow);
		
		exitButton.add(exitLabel);
		exitButton.addActionListener(new exitListener());
		exitButton.setPreferredSize(buttonDim);
		newGameButton.add(newGameLabel);
		newGameButton.addActionListener(new newGameListener());
		newGameButton.setPreferredSize(buttonDim);
		commandButtonPanel.add(exitButton);
		commandButtonPanel.add(newGameButton);
		
		
		gameFrame.setLayout(new FlowLayout());
		gameFrame.add(topPanel);
		gameFrame.add(boardPanel);
		gameFrame.add(textPanel);
		gameFrame.add(commandButtonPanel);
		gameFrame.setSize(frameDimension);
		gameFrame.setTitle("Tic Tac Toe");
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		populateBoard(controller.getGrid());
		textWindow.append("\n Let's flip a coin.  If it comes up heads, you go first.  \n\n");
		textWindow.append(" But if it comes up tails, I go first.  \n\n");
		textWindow.append(" Ok the result is: " + controller.getCoinFlip().toUpperCase()+"!  " + controller.getPlayer().toUpperCase() + " will go first." );
		 if(controller.getCoinFlip() == "tails"){
				computer.makeAIPlay(1, 1, controller.getGrid());
				populateBoard(controller.getGrid());
		 }
		
	}
	
	private void getWinStatus() {
		
	check.checkForWin(controller.getGrid(), X, O, EMPTY);
	if(check.getGameOver() == true){
	textWindow.setText("\n" + check.getWinner() + " has won the game!");
	
	
		}
	
	else if(numOfPlays == 4 && controller.getPlayer() == "I"){
		textWindow.setText("Cat's game. Well played!  I cannot beat you!");
	}
	
	else if(numOfPlays == 5){
		textWindow.setText("Cat's game. Well played!  I cannot beat you!");

	}
	
	
	}
	

	
	public void populateBoard(String[][] grid){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				gridButtons[3*i+j].setText(grid[i][j]);
			}
		}
	}
	

	
	
	 class Grid_0_0_Listener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if(grid_0_0.getText() == EMPTY){
				numOfPlays++;
				controller.executePlays(numOfPlays, 0, 0, computer);
				populateBoard(controller.getGrid());
				getWinStatus();
			}
			
			else {
				textWindow.setText("\n Please select another square");
			}
		}
	}
	 
	 class Grid_0_1_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_0_1.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 0, 1, computer);
					populateBoard(controller.getGrid());
					getWinStatus();
				}
				
				else {
					textWindow.setText("\n Please select another square");
				}	
			}
		}
	 
	 class Grid_0_2_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				
				if(grid_0_2.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 0, 2, computer);
					populateBoard(controller.getGrid());
					getWinStatus();
					}
				
				else {
					textWindow.setText("\n Please select another square");
				}
			}
		}
	 class Grid_1_0_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_1_0.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 1, 0, computer);
					populateBoard(controller.getGrid());	
					getWinStatus();
				}
				
				else {
					textWindow.setText("\n Please select another square");
				}
			}
		}
	 
	 class Grid_1_1_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_1_1.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 1, 1, computer);
					populateBoard(controller.getGrid());	
					getWinStatus();
				}
				
				else {
					textWindow.setText(" \n Please select another square");
				}
			}
		}
	 
	 class Grid_1_2_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_1_2.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 1, 2, computer);
					populateBoard(controller.getGrid());
					getWinStatus();
					}
				
				else {
					textWindow.setText("\n Please select another square");
				}
		
			}
		}
	 
	 class Grid_2_0_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_2_0.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 2, 0, computer);
					populateBoard(controller.getGrid());
					getWinStatus();
					}
				
				else {
					textWindow.setText("\n Please select another square");
				}
			}
		}
	 
	 class Grid_2_1_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_2_1.getText() == EMPTY){	
					grid_2_1.setText(X);
					numOfPlays++;
					controller.executePlays(numOfPlays, 2, 1, computer);
					populateBoard(controller.getGrid());
					getWinStatus();
					}
				
				else {
					textWindow.setText(" \n Please select another square");
				}
			}
		}
	 
	 class Grid_2_2_Listener implements ActionListener {
			public void actionPerformed(ActionEvent e){
				if(grid_2_2.getText() == EMPTY){	
					numOfPlays++;
					controller.executePlays(numOfPlays, 2, 2, computer);
					populateBoard(controller.getGrid());
					
					getWinStatus();
					}
				
				else {
					textWindow.setText(" \n Please select another square");
				}
			}
		}
	 
	 class exitListener implements ActionListener{
		 public void actionPerformed(ActionEvent e){
			 System.exit(0);
		 }	 
	 }
	 
	 class newGameListener implements ActionListener{
		 public void actionPerformed(ActionEvent e){
			
			GameView view = new GameView();
//			GameController controller = new GameController();		
		 }	 
	 }
	 
	public static void main(String[] args){
		GameView view = new GameView();
	}
}