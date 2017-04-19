
public class MonoBot implements Bot {
	String TEAM_NAME = "MonoBot";
	Player player =  new Player(TEAM_NAME, TEAM_NAME, 0);
	Dice dice = new Dice();
	Board board = new Board(dice);
	
	@Override
	public String getName() {
		return TEAM_NAME;
	}

	@Override
	public String getCommand() {
		String command = getDecision();
		return command;
	}

	@Override
	public String getDecision() {
		// TODO Auto-generated method stub
		return null;
	}

}
