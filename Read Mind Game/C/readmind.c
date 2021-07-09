#include<stdio.h>
#include<conio.h>
void main()
{
	int result;
	int no;
	printf("\n\n");
	
	printf("---------------------------------------\n");
	printf("Think a number between 1 to 1 lakh.\n");
	printf("---------------------------------------\n\n\n");
	
	printf("****INSTRUCTION****\n\n\n");
	
	printf("Multiply that number by 2\n");
	printf("Add 4 to that number\n");
	printf("Multiply that number by 5\n");
	printf("Add 12 to that number\n");
	printf("Multiply that number by 10\n");
	printf("Subtract 320 to that number\n\n");
	printf("---------------------------------------\n");
	
	printf("Enter that number: ");
	scanf("%d",&no);
	result=no/100;
	printf("\nThe number that you think is: %d",result);
	getch();
}

