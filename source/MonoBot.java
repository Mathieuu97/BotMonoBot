
public class MonoBot implements Bot {
	
	// The public API of YourTeamName must not change
	// You cannot change any other classes
	// YourTeamName may not alter the state of the board or the player objects
	// It may only inspect the state of the board and the player objects
	String TEAM_NAME = "MonoBot";
	Dice dice = new Dice();
	Board board = new Board(dice);
	Player player =  new Player(TEAM_NAME, TEAM_NAME, 0);
	
	MonoBot (BoardAPI board, PlayerAPI player, DiceAPI dice) {
		return;
	}
	
	public String getName () {
		return "YourTeamName";
	}
	
	public String getCommand () {
	
		
		return "roll"; 
		
	/*	if (board.getSquare(player.getPosition()) instanceof Property) {
			Property property = (Property) board.getSquare(player.getPosition());
			if (!property.isOwned()) {
				if (hasEnoughMoney()) {
					return "buy";
				}
			}
		} */
		
		//return "done";  
	}



private boolean hasEnoughMoney(){
	if(player.getBalance()>=500) {
		return true;
	}
	else {
		return false;
	}
}

	
	public String getDecision () {
		// Add your code here
		return "pay";
	}
	
}
