//Dylan Dietrick
//4/29/20
//Palindrome Tester
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#define MAX 50

int top = -1, front = 0;
int stack[MAX];

void popStack();
void pushStack(char a);

int main(void){
  int i, n = 0, j = 0, len,choice;
  char s[MAX], temp[MAX], b;

    printf("Enter a line of text:\n");
    fgets(temp,30,stdin);
    strtok(temp, ".");
    strtok(temp, "\n");
    len = strlen(temp);

     for (i = 0; temp[i]!='\0'; i++) {
      if(temp[i] >= 'A' && temp[i] <= 'Z') {
         temp[i] = temp[i] + 32;
      }
   }
    while(temp[n] != '\0'){
      if(temp[n] != ' '){
        s[j++] = temp[n];
      }
      n++;
    }

      for (i = 0;s[i] != '\0';i++){
        b = s[i];
        pushStack(b);
      }

      for (i = 0;i < (strlen(s) / 2);i++){
        if(stack[top] == stack[front]){
          popStack();
          front++;

        }
        else{
          printf("\"%s\" is not a palindrome\n", s);
            break;

        }
      }

    if ((strlen(s) / 2)  ==  front)
    printf("\"%s\" is a palindrome\n",  s);
    front  =  0;
    top  =  -1;
}

void pushStack(char a){
  top++;
  stack[top]  =  a;
}

void popStack(){
  top--;
}
