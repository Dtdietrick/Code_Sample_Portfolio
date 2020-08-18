//Dylan Dietrick
//4/29/20
//Push/delete value in stack
#include <stdio.h>
#include <stdlib.h>

struct stackNode{
  int data;
  struct stackNode *nextPtr;
};

typedef struct stackNode StackNode;
typedef StackNode *StackNodePtr;

//call prototypes
void push( StackNodePtr *topPtr, int info );
int pop( StackNodePtr *topPtr );
int isEmpty( StackNodePtr topPtr );
void printStack( StackNodePtr currentPtr );
void instructions( void );

int main(void) {
 StackNodePtr stackPtr = NULL;
 int choice;
 int value;

 instructions();
 printf("? ");
 scanf("%d", &choice);

//switch case for menu
  while ( choice != 3 ) {

    switch(choice){
      case 1:
        printf( "Enter an integer: " );
        scanf( "%d", &value );
        push( &stackPtr, value );
        printStack( stackPtr );
        break;
      case 2:
         if ( !isEmpty( stackPtr ) ) {
          printf( "The popped value is %d.\n", pop( &stackPtr ) );
         }
        printStack( stackPtr );
        break;
      default:
      printf( "Invalid choice.\n\n" );
      instructions();
      break;
    }
     printf( "? " );
     scanf( "%d", &choice );
  }

 printf( "End of run.\n" );
 return 0;
}

void instructions( void ) {
  printf( "Enter choice:\n"
  "1 to push a value on the stack\n"
  "2 to pop a value off the stack\n"
   "3 to end program\n" );
}

//inserts a node at top of the stack
void push( StackNodePtr *topPtr, int info ){

//create new node
   StackNodePtr newPtr;
   newPtr = malloc( sizeof( StackNode ) );
//insert at top
   if ( newPtr != NULL ) {
     newPtr->data = info;
     newPtr->nextPtr = *topPtr;
     *topPtr = newPtr;
   }
   else{
      printf( "%d not inserted. No memory available.\n", info );
   }
}

//remove node from top of stack
int pop( StackNodePtr *topPtr ){
  StackNodePtr tempPtr;
  int popValue;
  tempPtr = *topPtr;
  popValue = ( *topPtr )->data;
  *topPtr = ( *topPtr )->nextPtr;
  free( tempPtr );
  return popValue;
}

 void printStack( StackNodePtr currentPtr ) {
    if ( currentPtr == NULL ) {
       printf( "The stack is empty.\n\n" );
    }
    else{
       printf( "The stack is:\n" );

//print current pointer while current pointer isn't end
       while ( currentPtr != NULL ) {
         printf( "%d --> ", currentPtr->data );
         currentPtr = currentPtr->nextPtr;
       }
        printf( "NULL\n\n" );
    }
 }

//returns 1 if list is empty, otherwise returns 0
 int isEmpty( StackNodePtr topPtr ) {
   return topPtr == NULL;
 }
