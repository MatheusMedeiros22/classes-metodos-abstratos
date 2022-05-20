package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
	
		System.out.println("Enter the number of shapes");
		int shapes = sc.nextInt();
		
		for(int i = 0; i < shapes; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.println("Rectangle or Circle (r/c)?");
			char type = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			if(type == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.printf("%.2f - ", shape.area() );
			System.out.println(shape.getColor());
		}
		
		sc.close();
	}

}
