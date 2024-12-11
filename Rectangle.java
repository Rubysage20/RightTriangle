/* Name: Valerie Dawson
* Overview: Creates two Rectangle objects using the default constructor
* and using the constructor that takes the length and width as parameters. 
* the dimensions of rectangle 1 are set using the setLength and set Width methods. 
* The dimensions and properties are and perimeter of both rectangles are then printed
* to the console using the get methods. 
* Input: User input : Scan.nextdouble
* Output: Rectangle 1, Enter length, enter width, area - calculated, perimeter - calculated
* Rectangle 2 , length 5.0, width 3.0, area- calculated, perimeter- calculated
 * Variables: double length, double width, scan
*/
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Rectangle class
		public class Rectangle{ 
		private double length;
		private double width;
		
		// Default Constructor 
		public Rectangle() {
		length = 0.0;
		width = 0.0;
		}
		
		// Parameterized constructor
		public Rectangle(double len, double width) {		
			length = len;
			this.width = width; 		
		}
		
		// Set method for Length
		public void setLength(double len) {
			length = len;
		}
		// Get method for Length
		public double getLength() {
			return length;
		}
		// Set method for Width 
		public void setWidth(double width) {
			this.width = width;
		}
		// Get method for width
		public double getWidth() {
			return width;
		}
		// Method to calculate the are of the rectangle
		double getArea() {
			return (length * width); 
		}
		// Method to calculate the perimeter of the rectangle
		double getPerimeter() {
			return 2*(length + width);
		}
		}
		
		// Create a Scanner object for user input 
		Scanner scan = new Scanner(System.in);
		// Construct the first rectangle using default constructor
		Rectangle rectangle1 = new Rectangle(); 
		
		System.out.println("Rectangle 1:");
		// User input of length
		System.out.println("Enter length");
		double length1 = scan.nextDouble();
		// User input of width
		System.out.println("Enter width:");
		double width1 = scan.nextDouble();
		
		rectangle1.setLength(length1);
		rectangle1.setWidth(width1);
		System.out.println("Area:" + rectangle1.getArea());
		System.out.println("Perimeter:" + rectangle1.getPerimeter());
		
		// Create the second rectangle using parameterized constructor

		Rectangle rectangle2 = new Rectangle(5.0,3.0);
		System.out.println("\nRectangle 2:");
		System.out.println("Length:" + rectangle2.getLength());
		System.out.println("Width:" + rectangle2.getWidth());
		System.out.println("Area:" + rectangle2.getArea());
		System.out.println("Perimeter:" + rectangle2.getPerimeter()); 
				
		// Close Scanner object
		scan.close();

		}
	}


