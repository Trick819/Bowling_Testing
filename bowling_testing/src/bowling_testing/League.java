package bowling_testing;

import java.util.Date;

public class League extends Game {
	private Date startDate;
	private Date endDate;
	private String strName;
	
	//constructor, initializing a new league
	//take this stuff and put it in the new league form (when it opens from new league button)
	private League(){
		startDate = new Date();
		endDate = new Date();
		strName = "";
	}
	
	//call this when save the league after the form is filled
	//take the data from the form and put it in the current league object?
	private void saveLeague() {
		
	}
}
