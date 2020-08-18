//Created By Dylan Dietrick
//Created On 3/31/20
//Shape Calculator
#include <stdio.h>
#include <math.h>

void circumference(double input)
{
  printf(
          "The circumference of a circle "
          "with radius %.2lf is %.2lf \n\n", input, (2 * 3.14 * input)
    );
}

void area(double input)
{
  printf(
          "The area of a circle "
          "with radius %.2lf is %.2lf \n\n", input, (3.14 * pow(input, 2))
    );
}

void volume(double input)
{
  printf(
          "The volume of a sphere "
          "with radius %.2lf is %.2lf \n\n", input, ((4.0 / 3.0) * 3.14 * pow(input, 3))
    );
}

int get_input(void)
{
    int choice;
    printf(
            "Enter 0 to calculate the circumference of a circle\n"
            "1 for the area of a circle.\n"
            "2 for the volume of a sphere.\n"
          );
    scanf("%i", &choice);
    return choice;
    }


void get_number(double *inputNumber, int choice)
{

  printf("Enter the length of a radius: \n");
  scanf("%lg", inputNumber);
  return;
}

void (*f[3]) (double) = {circumference, area, volume};

int main(void) {
  double inputNumber = 0;
  int choice = 0;



  do{
    choice = get_input();
    if (choice < 0 || choice > 2){
      puts("Program ended.");
      return 0;
    }
    get_number(&inputNumber, choice);
   (*f[choice])(inputNumber);
  }
  while (choice >= 0 && choice <= 2);

}
