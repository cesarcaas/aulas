package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
 
		System.out.println("Sum = " + String.format("%.2f", sum));
''
		

		/*
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		*/
		
		/*
		
		list.forEach(Product::nonStaticPriceUpdate);
		//list.forEach(Product::staticPriceUpdate)
		list.forEach(System.out::println);
		
		//list.forEach(new PriceUpdate());
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
		*/
	}
}