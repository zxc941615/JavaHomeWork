import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		String tmp = input.nextLine();
		String color = input.nextLine();
		boolean fill = input.nextBoolean();
		Triangle triangle = new Triangle(side1,side2,side3);
		triangle.setColor(color);
		triangle.setFilled(fill);
		System.out.println(triangle.toString());
		System.out.println("The area is " + triangle.getArea());
		System.out.println("The perimeter is " + triangle.getPerimeter());
		System.out.println(triangle.getColor());
		System.out.println(triangle.isFilled());

	}
}
// 交e-tutor 不可於class前加public
class Triangle extends GeometricObject{
		private double side1;
		private double side2;
		private double side3;

		public Triangle(double side1,double side2,double side3){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		public Triangle(){
			this.side1 = 1;
			this.side2 = 1;
			this.side3 = 1;
		}

		@Override
		public double getArea(){
			double area = 0.0;
			double s = (side1+side2+side3)/2;
			area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
			return area;
		}
		@Override
		public double getPerimeter(){
			return side1+side2+side3;
		}
		@Override
		public String toString(){
			return "Triangle: "+
					"side1 = " + side1 + " " +
					"side2 = " + side2 + " " +
					"side3 = " + side3;
		}
		public void setSide1(double side1){
			this.side1 = side1;
		}
		public void setSide2(double side2){
			this.side2 = side2;
		}
		public void setSide3(double side3){
			this.side3 = side3;
		}
}
abstract class GeometricObject {
		private String color = "white";
		private boolean filled;
		private java.util.Date dateCreated;

		/** Construct a default geometric object */
		protected GeometricObject() {
			dateCreated = new java.util.Date();
		}

	/** Construct a geometric object with color and filled value */
		protected GeometricObject(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}

		/** Return color */
		public String getColor() {
			return color;
		}

		/** Set a new color */
		public void setColor(String color) {
			this.color = color;
		}

		/** Return filled. Since filled is boolean,
		 *  the get method is named isFilled */
		public boolean isFilled() {
			return filled;
		}

		/** Set a new filled */
		public void setFilled(boolean filled) {
			this.filled = filled;
		}

		/** Get dateCreated */
		public java.util.Date getDateCreated() {
			return dateCreated;
		}

		@Override
		public String toString() {
			return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
		}

		/** Abstract method getArea */
		public abstract double getArea();

		/** Abstract method getPerimeter */
		public abstract double getPerimeter();
	}