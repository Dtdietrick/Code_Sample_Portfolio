//A Menu Driven Calculator
//Created By: Dylan Dietrick
//Created On: 3/30/20

#include <stdio.h>

void add(double m, double n)
{
    printf(
            "Adding %.2lf and %.2lf...\n"
            "The result is: %.2lf\n", m, n, (m + n)
            );
    return;
}

void subtract(double m, double n)
{
    printf(
            "Subtracting %.2lf from %.2lf...\n"
            "The result is: %.2lf\n", n, m, (m - n)
            );
    return;
}

void multiply(double m, double n)
{
    printf(
            "Multiplying %.2lf and %.2lf...\n"
            "The result is: %.2lf\n", m, n, (m * n)
          );
    return;
}

void divide(double m, double n)
{
    printf(
            "Dividing %.2lf by %.2lf...\n"
            "The result is: %.2lf\n", m, n, (m / n)
          );
    return;
}

int get_choice(void)
{
    int choice;
    printf(
            "=== Calculator Menu ===\n\n"
            "Please select from the options below:\n\n"
            "(0) Add a number to another.\n"
            "(1) Subtract a number from another.\n"
            "(2) Multiply a number to another.\n"
            "(3) Divide a number by another.\n\n"
          );
    while (1)
    {
        printf("Enter your selection: ");
        scanf("%i", &choice);
        if ((choice < 0) || (choice > 3))
        {
            printf("Invalid selection!\n");
            continue;
        }
        return choice;
    }
}

void get_numbers(double *numbers, int choice)
{
    int count = 0;
    numbers[0] = numbers[1] = 1;
    while (count < 2)
    {
        if (count == 0)
            printf("Enter a number: ");
        else if (count == 1)
            printf("Enter another number: ");
        scanf("%lf", &numbers[count++]);
        if ((choice == 3) && (numbers[1] == 0.00))
        {
            printf("Error: attempting to divide by zero!\n");
            count--;
        }
    }
    return;
}

int get_choice(void);
void get_numbers(double *numbers, int choice);
void (*f[4]) (double, double) = {add, subtract, multiply, divide};

int main(void){
  double numbers[2];
  int choice;
  choice = get_choice();
  get_numbers(numbers, choice);

  (*f[choice])(numbers[0],numbers[1]);



}
