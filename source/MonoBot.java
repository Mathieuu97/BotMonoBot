
public class MonoBot implements Bot {
	String TEAM_NAME = "MonoBot";
	Player player =  new Player(TEAM_NAME, TEAM_NAME, 0);
	Dice dice = new Dice();
	Board board = new Board(dice);
	

	public String getName() {
		return TEAM_NAME;
	}

	public String getCommand() {
		String command = getDecision();
		return command;
	}
	
	private boolean hasEnoughMoney(){
		if(player.getBalance()>=500) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getDecision() {
		if (board.getSquare(player.getPosition()) instanceof Property) {
			Property property = (Property) board.getSquare(player.getPosition());
			if (!property.isOwned()) {
				if (hasEnoughMoney()) {
					return "buy";
				}
			}
			
		}
		
		return "done";
	}
}
