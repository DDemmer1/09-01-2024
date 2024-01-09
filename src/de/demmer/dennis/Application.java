package de.demmer.dennis;


public class Application {
	
	public static void main(String[] args) {
		
		
		// - - - - - 
		// - - X - -
		// - - - - -
	
	
		GameEntity[][] board = new GameEntity[3][5];
		
		Player player = new Player(0, 0, 100);
		player.x = 2;
		player.y = 1;
	
		Object o = new Object();
		
		
		board[player.y][player.x] = player;
		
		for (int i = 0; i < board.length; i++) {
				
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] instanceof Player) {
					System.out.print(" X ");
				} else { 
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		
		
	
	}

}
