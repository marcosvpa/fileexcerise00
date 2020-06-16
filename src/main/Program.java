package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<Product>();
		String getProduct = "noone";
		
		while (!getProduct.equals("quit")) {
			System.out.println("Please insert a text,please enter 'quit' to exit");
			getProduct = sc.next();
			if (!getProduct.equals("quit")) {
				String[] getInfo = getProduct.split(",");
				Product productInfos = new Product(getInfo[0],Double.parseDouble(getInfo[1]),Integer.parseInt(getInfo[2]));
			System.out.println(productInfos);
			}
		}
		
		
		
	}

}
