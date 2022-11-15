package paintCalculatorModel;

import java.io.*;


//assume room is Cube or Cuboid
public class Main {
	private double height;																	//Height of the Room
	private double width;																	//Width of the Room
	private double length;																	//Length of the Room	
	private double wallAreaToPaint;															//Area of the wall to be Painted
	
	private double totalAreaOfDoors;														//Area of the Doors
	private double totalAreaOfWindows;														//Area of the Windows
	private double totalExAreas;            												//Assume only Excluded area is Doors and Windows
	private final double COATS=2;															//Assume coats of paint on wall is given 2  which is normally recommended.
	private final double PAINTPERMETERSQ=0.1;												//Assume paints(in Liter) per meter square is 0.1
	private final int noOfDoors=1;															//Assume Total number of Doors=1
	private final int noOfWindows=2;														//Assume Total number of the Windows=2

	
	BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));			//Buffered Reader to read the input of the System

	public static void main(String[] args){
		new Main().run();
	}
	
	public void run(){
		try {
			//Getting the Height of the Room from the user
			System.out.println("----------Room----------");
			System.out.print("Enter the Height of the Room (in meters): ");
			this.height=Double.parseDouble(keyboard.readLine());
			
			//Getting the width of the Room from the user
			System.out.print("Enetr the Width of the Room(in meters): ");
			this.width=Double.parseDouble(keyboard.readLine());
			
			//Getting the Length of the Room from the user
			System.out.print("Enter the Length of the Room(in meters): ");
			this.length=Double.parseDouble(keyboard.readLine());
			
			
			//Getting the Calculation of the room through DimensionalCalculations class
			DimensionalCalculations room=new DimensionalCalculations(this.height,this.width,this.length);
			
			
			System.out.println("\n\n----------Doors----------");
			//Getting the total areas of the door
			totalDoorArea(noOfDoors);
			
			System.out.println("\n\n----------Windows----------");
			//Getting the total areas of the Window
			totalWindowArea(noOfWindows);
			
			//Total Area Excluded for paint
			this.totalExAreas=this.totalAreaOfDoors+this.totalAreaOfWindows;
			
			//Area of Wall to Paint
			this.wallAreaToPaint=(2*(room.getArea()+(this.height*this.length)))-this.totalExAreas;
			
			
			if (this.wallAreaToPaint<=0) {
				
				//Printing the Result
			    System.out.println("\n\n\n----------RESULT----------");
				System.out.println("Area of the Floor: "+String.format("%,.2f",room.getFloorArea() )+" meter Square.");
				System.out.println("Amount of paint required to paint the wall: NO PAINT REQUIRED ONLY EXCLUDED AREAS NO AREA FOR PAINTING");
				System.out.println("Volume of the room: "+String.format("%,.2f",room.getRoomVolume())+" meter cube.");
				System.out.println("--------------------------");
				
				
				
				
				
			}else {
			   
				//Printing the Result
			    System.out.println("\n\n\n----------RESULT----------");
				System.out.println("Area of the Floor: "+String.format("%,.2f",room.getFloorArea() )+" meter Square.");
				System.out.println("Amount of paint required to paint the wall: "+String.format("%,.2f",paintRequired(this.wallAreaToPaint))+" Liters.");
				System.out.println("Volume of the room: "+String.format("%,.2f",room.getRoomVolume())+" meter cube.");
				System.out.println("--------------------------");
				
				
				
			}
			
			
			
			
			
		}catch(IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException "+e.getMessage());
		}
		}
	
	
	
	
	
	//Method for calculating the total areas of the all Windows
	private double totalWindowArea(int windows)throws IOException{
		for (int i=1; i<=windows;i++) {
			System.out.print("Enter the Height of Window "+i+"(in meters): ");
			double h=Double.parseDouble(keyboard.readLine());
			System.out.print("Enetr the Width of Window "+i+"(in meters): " );
			double w=Double.parseDouble(keyboard.readLine());
			System.out.println("\n");
			double area=new DimensionalCalculations(h,w,0).getArea();
			this.totalAreaOfWindows+=area;
		}
		return this.totalAreaOfWindows;
	}
	
	//Method for Calculating the total areas of the all Doors
	private double totalDoorArea(int doors) throws IOException{
			for (int i=1; i<=doors;i++) {
				System.out.print("Enter the Height of Door "+i+"(in meters): ");
				double h=Double.parseDouble(keyboard.readLine());
				System.out.print("Enetr the Width of Door "+i+"(in meters): " );
				double w=Double.parseDouble(keyboard.readLine());
				System.out.println("\n");
				double area=new DimensionalCalculations(h,w,0).getArea();
				this.totalAreaOfWindows+=area;
			}
			return this.totalAreaOfDoors;
		}
	
	private double paintRequired(double wallArea) {
		return this.COATS*this.PAINTPERMETERSQ*wallArea;
	}

}
