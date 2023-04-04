package ordenacaoDeDados.application.service;

import org.springframework.stereotype.Service;

@Service
public class Quicksort {
	private Integer[] value = { 2, 16, 5, 8, 9, 15, 6, 1, 7, 3, 4, 13, 12, 10, 14, 11 };

	public void order(Integer inicio, Integer fim) {
		if (fim > inicio) {
			int indexPivo = dividir(value, inicio, fim);
			
			order(inicio, indexPivo - 1);
			
			order(indexPivo + 1, fim);
		}

	}

	private void trocar(Integer[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

	private int dividir(Integer[] vetor, Integer inicio, Integer fim) {
		int pivo, pontEsq, pontDir = fim;
		pontEsq = inicio + 1;
		pivo = vetor[inicio];

		while (pontEsq <= pontDir) {
			
			while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
				pontEsq++;
			}
			while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
				pontDir--;
			}
			if (pontEsq < pontDir) {
				trocar(vetor, pontDir, pontEsq);
				pontEsq++;
				pontDir--;
			}
		}

		trocar(vetor, inicio, pontDir);
		return pontDir;
	}

	public void printar() {
		order(0, 15);
		
		System.out.println("Quicksort:");
		for (int k = 0; k < value.length; k++) {

			if (k < 15)
				System.out.print(value[k] + " - ");
			else
				System.out.print(value[k] + "\n");

		}
	}
	
	public Integer[] getValues() {
		return value;
	}

}
