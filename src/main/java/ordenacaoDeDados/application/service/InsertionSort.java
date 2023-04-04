package ordenacaoDeDados.application.service;

import org.springframework.stereotype.Service;

@Service
public class InsertionSort {
	private Integer[] value = { 2, 16, 5, 8, 9, 15, 6, 1, 7, 3, 4, 13, 12, 10, 14, 11 };

	public void order() {
		for (int i = 1; i < value.length; i++) {

			int aux = value[i];
			int numb = i;
			while (numb > 0 && value[numb - 1] > aux) {
				value[numb] = value[numb - 1];
				numb--;
			}

			value[numb] = aux;
		}

		System.out.println("Insertion Sort:");
		for (int i = 0; i < value.length; i++) {

			if (i < 15)
				System.out.print(value[i] + " - ");
			else
				System.out.print(value[i] + "\n");

		}
	}

	public Integer[] getValues() {
		return value;
	}
}
