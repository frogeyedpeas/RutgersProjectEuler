#include <stdio.h>
#include <stdlib.h>

void enumerate(int* table, int size){
	int n;

	for(n = 0; n < size; n++){
		table[n] = n + 1;
	}
}

double compute(int lim){
	int* table = malloc(sizeof(int) * lim);

	enumerate(table, lim);

	int n, k;
	double total = 0;

	for(n = 1; n < lim; n++){
		if(table[n] == n + 1){
			for(k = n; k < lim; k += n + 1){
				table[k] *= 1 - (double) 1 / (n + 1);
			}
		}
		
		total += table[n];
	}

	free(table);

	return total;
}

int main(){
	double fractions = compute(1000000);

	printf("%.0lf fractions", fractions);

	return 0;
}