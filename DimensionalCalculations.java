

public class DimensionalCalculations {
	    // Width
		private double width;
		
		//Height
		private double height;
		
		//length
		private double length=0;
		
		//Constructor with two parameters
		public DimensionalCalculations(double height, double width, double length)throws IllegalArgumentException{
			
			//Checks whether given Height and Width is Positive and greater than 1 or it gives an exception.  
			if (height>0 && width>0 && length>=0) {
				this.height=height;
				this.width=width;
				this.length=length;
			}else if(height<=0) {
				throw new IllegalArgumentException("Invalid Height: Height should be positive");
				
			}else if (width<=0) {
				throw new IllegalArgumentException("Invalid Width: Width Should be positive");
			}else if (length<0){
				throw new IllegalArgumentException("Invalid length: Length Should be positive");
				
			}else {
				throw new IllegalArgumentException("Invalid Input");
			}
		}
		//get Height 
		public double getHeight() {
			return this.height;
		}
		
		//get Width 
		public double getWidth() {
			return this.width;
		}
		public double getLength() {
			return this.length;
		}
		
		//Calculate Area of wall
		public double getArea() {
			return this.height*this.width;
		}
		
		//Calculate Floor Area
		public double getFloorArea() {
			return this.length*this.width;
		}
		
		//Calculate Volume of the room
		public double getRoomVolume(){
			return this.length*this.width*this.height;			
		}
		
		
				
}
