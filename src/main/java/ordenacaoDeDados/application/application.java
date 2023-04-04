package ordenacaoDeDados.application;

import ordenacaoDeDados.application.service.InsertionSort;
import ordenacaoDeDados.application.service.Quicksort;
import ordenacaoDeDados.application.service.bubbleSort;

public class application {
	public static void main(String[] args) {
		bubbleSort bb = new bubbleSort();
		InsertionSort in = new InsertionSort();
		Quicksort qs = new Quicksort();

		bb.order();
		in.order();
		qs.printar();

		var numbb = bb.getValues();
		var numbIn = in.getValues();
		var numbQs = qs.getValues();
		
		System.out.println(numbb[0] == 1);
		System.out.println(numbb[5] == 6);
		System.out.println(numbb[14] == 15);

		System.out.println(numbIn[0] == 1);
		System.out.println(numbIn[5] == 6);
		System.out.println(numbIn[14] == 15);

		System.out.println(numbQs[0] == 1);
		System.out.println(numbQs[5] == 6);
		System.out.println(numbb[14] == 15);

	}
}
