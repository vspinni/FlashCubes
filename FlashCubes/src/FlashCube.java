
//Class for a FlashCube Object

public class FlashCube {
	
	// Constants to specify direction
	public static final int LEFT = 0;
	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;
	public static final int BACK = 4;
	
	/*
	 * The first thing displayed to a user for a given FC. Could be a question, 
	 * term, formula, etc. Must be a string of some sort
	 */
	private Side<String> frontSide;
	
	//The various sides of the FC
	private Side backSide;
	private Side leftSide;
	private Side rightSide;
	private Side upSide;
	private Side downSide;
	
	//The current side being 'displayed'. By default, it should be initialized to be frontSide
	private Side currentSide;
	
	
	public FlashCube() {
		this.frontSide = new Side<String>("");
		this.currentSide = this.frontSide;
	}
	
	public FlashCube(Side<String> frontSide, Side backSide, Side leftSide, Side rightSide, 
			Side upSide, Side downSide) {
		super();
		this.frontSide = frontSide;
		this.backSide = backSide;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
		this.upSide = upSide;
		this.downSide = downSide;
		this.currentSide = this.frontSide;
	}



	
	//Getters and setters

	public Side<String> getFrontSide() {
		return frontSide;
	}




	public void setFrontSide(Side<String> frontSide) {
		this.frontSide = frontSide;
	}




	public Side getBackSide() {
		return backSide;
	}




	public void setBackSide(Side backSide) {
		this.backSide = backSide;
	}




	public Side getLeftSide() {
		return leftSide;
	}




	public void setLeftSide(Side leftSide) {
		this.leftSide = leftSide;
	}




	public Side getRightSide() {
		return rightSide;
	}




	public void setRightSide(Side rightSide) {
		this.rightSide = rightSide;
	}




	public Side getUpSide() {
		return upSide;
	}




	public void setUpSide(Side upSide) {
		this.upSide = upSide;
	}




	public Side getDownSide() {
		return downSide;
	}




	public void setDownSide(Side downSide) {
		this.downSide = downSide;
	}




	public Side getCurrentSide() {
		return currentSide;
	}




	public void setCurrentSide(Side currentSide) {
		this.currentSide = currentSide;
	}


	


	//A method, switches the currentSide to be in the direction specified. Based on the logic of rotating a cube
	public void flip(int direction) {
		if (direction < LEFT || direction > BACK) {
			throw new IllegalArgumentException("Invalid direction specified!");
		}
		
		//Ok to use '==' to compare, as we actually DO only care about memory address
		if (currentSide == frontSide) {
			if (direction == LEFT) {
				this.currentSide = leftSide;
			} else if (direction == RIGHT) {
				this.currentSide = rightSide;
			} else if (direction == UP) {
				this.currentSide = upSide;
			} else if (direction == DOWN) {
				this.currentSide = downSide;
			} else if (direction == BACK) {
				this.currentSide = backSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else if (currentSide == backSide) {
			if (direction == LEFT) {
				this.currentSide = rightSide;
			} else if (direction == RIGHT) {
				this.currentSide = leftSide;
			} else if (direction == UP) {
				this.currentSide = upSide;
			} else if (direction == DOWN) {
				this.currentSide = downSide;
			} else if (direction == BACK) {
				this.currentSide = frontSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else if (currentSide == rightSide) {
			if (direction == LEFT) {
				this.currentSide = frontSide;
			} else if (direction == RIGHT) {
				this.currentSide = backSide;
			} else if (direction == UP) {
				this.currentSide = upSide;
			} else if (direction == DOWN) {
				this.currentSide = downSide;
			} else if (direction == BACK) {
				this.currentSide = leftSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else if (currentSide == leftSide) {
			if (direction == LEFT) {
				this.currentSide = backSide;
			} else if (direction == RIGHT) {
				this.currentSide = frontSide;
			} else if (direction == UP) {
				this.currentSide = upSide;
			} else if (direction == DOWN) {
				this.currentSide = downSide;
			} else if (direction == BACK) {
				this.currentSide = rightSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else if (currentSide == upSide) {
			if (direction == LEFT) {
				this.currentSide = leftSide;
			} else if (direction == RIGHT) {
				this.currentSide = rightSide;
			} else if (direction == UP) {
				this.currentSide = backSide;
			} else if (direction == DOWN) {
				this.currentSide = frontSide;
			} else if (direction == BACK) {
				this.currentSide = downSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else if (currentSide == downSide) {
			if (direction == LEFT) {
				this.currentSide = leftSide;
			} else if (direction == RIGHT) {
				this.currentSide = rightSide;
			} else if (direction == UP) {
				this.currentSide = frontSide;
			} else if (direction == DOWN) {
				this.currentSide = backSide;
			} else if (direction == BACK) {
				this.currentSide = upSide;
			} else {
				throw new IllegalArgumentException("Invalid direction!"); // should never happen because of arg checking
			}
		} else {
			System.out.println("SOMETHING IS WRONG"); //Should never happen
			throw new IllegalArgumentException("Invalid direction!");
		}
	}

}
