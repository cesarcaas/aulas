package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.00));
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		//list.removeIf(pred);
		//list.removeIf(Product::nonStaticProductPredicate);
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(p -> p.getPrice() >= 100);
		
		
		for (Product p : list ) {
			System.out.println(p);
			
		}
		
	}
}
	
	
	/*
	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
	*/
