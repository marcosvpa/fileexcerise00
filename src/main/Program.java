package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<Product>();
		String getProduct = "noone";
		
		while (!getProduct.equals("quit")) {
			System.out.println("Please insert a text,please enter 'quit' to exit");
			getProduct = sc.next();
			if (!getProduct.equals("quit")) {
				String[] getInfo = getProduct.split(",");
				Product productInfos = new Product(getInfo[0],Double.parseDouble(getInfo[1]),Integer.parseInt(getInfo[2]));
				productList.add(productInfos);
			}
		}
		sc.nextLine();
		System.out.println("Enter with the folder path to save");
		String folderPath = sc.nextLine();
				
		boolean sucess = new File(folderPath + "\\out").mkdir();
		if (sucess) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath +"\\out\\summary.csv"))) {
				for (Product list: productList) {
					bw.write(list.toString());
					bw.newLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Fail to create a folder");
		}
		
		sc.close();

	}

}
