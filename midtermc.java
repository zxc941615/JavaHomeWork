import java.util.*;
import java.awt.geom.Point2D;
import java.lang.Math;

public class Main{
	public static void main(String[] args) {
		Triangle trian = new Triangle();
		Scanner input = new Scanner(System.in);
		Point p1 = new Point();
		int number = input.nextInt();
		while(number>0){
			double max = 0;
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double edge1 = p1.distance(x1,y1,x2,y2);
			double edge2 = p1.distance(x2,y2,x3,y3);
			double edge3 = p1.distance(x3,y3,x1,y1);
			if(edge1 > edge2 && edge1 > edge3){
				if((edge2+edge3)<=edge1){
					System.out.println("Just Line!");
				}
				else{
					if(edge2>edge3){
						System.out.printf("%.3f",edge3);
						System.out.print(" ");
						System.out.printf("%.3f",edge2);
						System.out.print(" ");
						System.out.printf("%.3f",edge1);
						System.out.print(" ");
					}
					else{
						System.out.printf("%.3f",edge2);
						System.out.print(" ");
						System.out.printf("%.3f",edge3);
						System.out.print(" ");
						System.out.printf("%.3f",edge1);
						System.out.print(" ");

					}
					trian.Calculate(edge1,edge2,edge3);
				}
			}
			if(edge2 > edge3 && edge2 > edge1){
				if((edge1+edge3)<=edge2){
					System.out.println("Just Line!");
				}
				else{
					if(edge1>edge3){
						System.out.printf("%.3f",edge3);
						System.out.print(" ");
						System.out.printf("%.3f",edge1);
						System.out.print(" ");
						System.out.printf("%.3f",edge2);
						System.out.print(" ");
					}
					else{
						System.out.printf("%.3f",edge1);
						System.out.print(" ");
						System.out.printf("%.3f",edge3);
						System.out.print(" ");
						System.out.printf("%.3f",edge2);
						System.out.print(" ");

					}
					trian.Calculate(edge1,edge2,edge3);
				}
			}
			if(edge3 > edge2 && edge3 > edge1){
				if((edge2+edge1)<=edge3){
					System.out.println("Just Line!");
				}
				else{
					if(edge2>edge1){
						System.out.printf("%.3f",edge1);
						System.out.print(" ");
						System.out.printf("%.3f",edge2);
						System.out.print(" ");
						System.out.printf("%.3f",edge3);
						System.out.print(" ");
					}
					else{
						System.out.printf("%.3f",edge2);
						System.out.print(" ");
						System.out.printf("%.3f",edge1);
						System.out.print(" ");
						System.out.printf("%.3f",edge3);
						System.out.print(" ");

					}
					trian.Calculate(edge1,edge2,edge3);
				}
			}
			number--;
		}

	}
	public static class Triangle{
		double x1,y1,x2,y2,x3,y3;
		public void setPoint(double x1,double y1,double x2,double y2,double x3,double y3){
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
		}
		public void Calculate(double edge1,double edge2,double edge3){
			double s = (edge1 + edge2 + edge3)/2;
			// System.out.println(s);
			double tmp = s * Math.abs(s-edge1) * Math.abs(s-edge2) * Math.abs(s-edge3);
			double area = Math.sqrt(tmp);
			System.out.printf("%.3f",area);
			System.out.println();
		}
	}
	public static class Point{

		public double distance(double x1,double y1,double x2,double y2){
			double x = Math.abs(x1-x2);
			double y = Math.abs(y1-y2);
			double z = Math.pow(y,2) + Math.pow(x,2);
			double length = Math.sqrt(z);
			return length;
		}
	}

}
