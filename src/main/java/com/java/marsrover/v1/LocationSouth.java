package com.java.marsrover.v1;

/**
 * @author richajain
 * 2007
 * 
 * LocationSouth class implements the Location interface.
 * It defines the movement of rover towards South direction as well as 
 * changing the direction of rover.
 */
public class LocationSouth implements Location {

	Rover rover;
	
	public LocationSouth(Rover rover){
		this.rover = rover;
	}
	
	public void move(String ctrlStr) {
		
		if(ctrlStr.equals("M")){
			if(isMoveAllowed()){
				System.out.println("Moving south...");
				rover.setY(rover.getY() - 1);
			}
			else{
				System.out.println(Location.MOVE_ERR_MSG);
			}
		}		
		else if(ctrlStr.equals("L")){
			rover.setLoc(rover.getlocEast());
		}
		else if(ctrlStr.equals("R")){
			rover.setLoc(rover.getlocWest());
		}
	
			
	}
	
	public boolean isMoveAllowed(){
		
		if(rover.getY() > rover.getLowerLeftY()){
			return true;
		}
		else{
			return true;
		}
		
	}
	
	public String toString(){
		 
		return "S";
	}

}
