package ordenacaoDeDados.application.service;

import org.springframework.stereotype.Service;

@Service
public class bubbleSort {
	private Integer[] value = { 2, 16, 5, 8, 9, 15, 6, 1, 7, 3, 4, 13, 12, 10, 14, 11 };
	private Boolean loop = true;

	public void order() {
		while (loop) {
			loop = false;
			for (int i = 0; i < value.length - 1; i++) {
				if (value[i] > value[i + 1]) {
					int aux = value[i];

					value[i] = value[i + 1];
					value[i + 1] = aux;

					loop = true;
				}
			}
		}

		System.out.println("Bubble Sort:");
		for (int i = 0; i < value.length; i++) {

			if (i < 15) {
				System.out.print(value[i] + " - ");
			}
			else { System.out.print(value[i] + "\n");
			
			}

		}
	}
	
	public Integer[] getValues() {
		return value;
	}

}
