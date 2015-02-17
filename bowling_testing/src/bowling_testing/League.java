package bowling_testing;

import java.util.Date;

public class League extends Game {
	private Date startDate;
	private Date endDate;
	private String strName;
	
	//constructor, initializing a new league
	//take this stuff and put it in the new league form (when it opens from new league button)
	public League(){
		startDate = new Date();
		endDate = new Date(); //starts out as current date as well
		strName = "";
	}
	
	//call this when save the league after the form is filled
	//take the data from the form and put it in the current league object?
	private void saveLeague() {
		
	}
	
	public void newLeagueNight() {
		//create 3 games
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game();
		
		//i want to do a game1.playgame() type thing..
		game1.playGame();
		
		
	}
}
