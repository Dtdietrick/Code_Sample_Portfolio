//Health Profile Structure
//Created By Dylan Dietrick
//Created On 4/17/2020
#include <stdio.h>

struct HealthProfile{
  char firstName[8], lastName[12], gender[6];
  float height, weight;
  int currentYear, birthDay,birthMonth,birthYear;
};

struct HealthProfile get_Input();
float calculateBMI(float weight, float height);
int calculateMaxHeart(int year, int birthYear);
int calculateTargetRate(int maxRate);

int main(void) {
  float bmi;
  int maxRate, targetRate;
  struct HealthProfile healthprofile;

  healthprofile = get_Input();
  printf("The patient's name is %s %s\n", healthprofile.firstName, healthprofile.lastName);

  maxRate = calculateMaxHeart(healthprofile.currentYear, healthprofile.birthYear);
  printf("The patient's max heart rate is %d\n", maxRate);

  targetRate = calculateTargetRate(maxRate);
  printf("The patient's target heart rate is %d\n", targetRate);

  bmi = calculateBMI(healthprofile.weight, healthprofile.height);
  printf("The patient's BMI is %f\n", bmi);


}

struct HealthProfile get_Input(){
  struct HealthProfile healthprofile;


  puts("Please enter the current year");
  scanf("%d", &healthprofile.currentYear);

  puts("Please enter the patient's last name");
  scanf("%s", healthprofile.lastName);

  puts("Please enter the patient's first name");
  scanf("%s", healthprofile.firstName);

  puts("Please enter the patient's birthday as mm/dd/yyyy");
  scanf("%d/%d/%d", &healthprofile.birthMonth, &healthprofile.birthDay, &healthprofile.birthYear);

  puts("Please enter the patient's height in inches");
  scanf("%f", &healthprofile.height);

  puts("Please enter the patient's weight in pounds");
  scanf("%f", &healthprofile.weight);

  return healthprofile;
}

float calculateBMI(float weight, float height){
  float bmi;
  bmi = (703 * weight) / (height * height);
  return bmi;
}

int calculateMaxHeart(int year, int birthYear){
  int age;
  int maxRate;
  age = year - birthYear;
  maxRate = 220 - age;
  return maxRate;
}

int calculateTargetRate(int maxRate){
  int targetRate;
  targetRate = maxRate * .85;
  return targetRate;
}
