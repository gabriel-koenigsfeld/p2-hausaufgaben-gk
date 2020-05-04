package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class MittelwertMain {

	public static void main(String[] args) {

		ArrayList<Double> doubleList = new ArrayList<Double>();

		Scanner scanner = new Scanner(System.in);

		try {
			while (!scanner.hasNext("quit")) {
				doubleList.add(scanner.nextDouble());
				System.out.println(doubleList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(doubleList);
			double summe = 0;
			double mittelwert = 0;
			
			for(Double inputs: doubleList) {
				summe += inputs;
			}
			
			mittelwert = summe / doubleList.size();
			System.out.println(mittelwert);
			scanner.close();
		}

	}

}
