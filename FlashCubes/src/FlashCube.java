
//Class for a FlashCube Object

public class FlashCube {
	
	/*
	 * The first thing displayed to a user for a given FC. Could be a question, 
	 * term, formula, etc.
	 */
	private String question;
	
	/*
	 * The 'definition' of the question - what the user is expected memorize / know
	 */
	private String definition;
	private boolean showingBack;
	
	public FlashCube(String question, String definition) {
		this.question = question;
		this.definition = definition;
		this.showingBack = false;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
	//A method, displays the opposite of what was displayed previously
	public String flip() {
		if (showingBack) {
			showingBack = false;
			return this.getQuestion();
		} else {
			showingBack = true;
			return this.getDefinition();
		}
		
	}

}
