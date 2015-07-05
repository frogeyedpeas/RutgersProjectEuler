#include<stdio.h>
#include<stdlib.h>

int main()
{
	int list[10003];
	list[0]=2;	//1st prime number
	int p=3;
	int counter=1;

	while(counter <=10000)
	{
		int i;
		int flag =0;
		for(i=0;i<counter;i++)
		{
			if(p%list[i]==0)
			{
				flag =1;
				break;
			}
		}
		if(!flag)
		{
			printf("%d prime is %d\r", counter+1, p);
			list[counter]=p;
			counter++;
		}
		p=p+2;
	}
	printf("10001th prime is %d\n", list[counter-1]);
	return 0;
}
