//File Functions
//Dylan Dietrick
//4/25/20
#include <stdio.h>
#include <string.h>

typedef struct person {
  char lastName[15];
  char firstName[15];
  char age[4];
} Input;

void writeInputFile(Input *usrInput);
void writeEmptyFile(FILE *fptr);
void updateUserRecord(FILE *fptr, int recordID);
void deleteRecord(FILE *fptr, int recordID);

int main(void) {
FILE *fptr;

fptr = fopen("nameage.dat","wb");

writeEmptyFile(fptr);

  for(int i = 1; i <=10; i++){
    updateUserRecord(fptr, (i+100));
  }

updateUserRecord(fptr, 4);
deleteRecord(fptr,109);
fclose(fptr);
}

void writeEmptyFile(FILE *fptr){
  rewind(fptr);
  Input emptyFile = {"unassigned", "", "0"};
    for(int i = 1; i <= 100; i++){
      fwrite(&emptyFile, sizeof(Input), 1, fptr);
    }
}


void writeInputFile(Input *usrData){
printf("Enter a last name");
scanf("%15s", usrData->lastName);

printf("Enter a first name");
scanf("%15s", usrData->firstName);

printf("Enter an age");
scanf("%15s", usrData->age);
}

void updateUserRecord(FILE *fptr, int recordID){
  Input usrInput;
  writeInputFile(&usrInput);
  fseek(fptr, (recordID -1) * sizeof(Input), SEEK_SET);
  fwrite(&usrInput, sizeof(Input), 1, fptr);
}

void deleteRecord(FILE *fptr, int recordID){
  Input emptyFile = {"unassigned", "", "0"};
  fseek(fptr, (recordID -1) * sizeof(Input), SEEK_SET);
  fwrite(&emptyFile, sizeof(Input), 1, fptr);
}
