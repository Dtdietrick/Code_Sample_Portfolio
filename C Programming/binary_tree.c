//Dylan Dietrick
//4/29/20
//Binary Tree and PreOrder, InOrder, PostOrder
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct treeNode {
  struct treeNode *leftPtr;
  int data;
  struct treeNode *rightPtr;
};

typedef struct treeNode TreeNode;
typedef TreeNode *TreeNodePtr;

//call prototypes
void insertNode( TreeNodePtr *treePtr, int value );
void inOrder( TreeNodePtr treePtr );
void preOrder( TreeNodePtr treePtr );
void postOrder( TreeNodePtr treePtr );

int main(void) {
  int i;
  int item;
  TreeNodePtr rootPtr = NULL;

  srand(1952);
  printf( "The numbers being placed in the tree are:\n" );

//insert random value betweek 0 and 14
  for ( i = 1; i <= 10; i++ ) {
    item = rand() % 15;
    printf( "%3d", item );
    insertNode( &rootPtr, item );
  }

//run 3 order functions
   printf( "\n\nThe preOrder traversal is:\n" );
   preOrder( rootPtr );

   printf( "\n\nThe inOrder traversal is:\n" );
   inOrder( rootPtr );

   printf( "\n\nThe postOrder traversal is:\n" );
   postOrder( rootPtr );

   return 0;
}

//insert node if data is non duplicate
void insertNode( TreeNodePtr *treePtr, int value ){

//if tree is empty
  if ( *treePtr == NULL ) {
     *treePtr = malloc( sizeof( TreeNode ) );

//if space in memory then assign data
     if ( *treePtr != NULL ) {
        ( *treePtr )->data = value;
        ( *treePtr )->leftPtr = NULL;
        ( *treePtr )->rightPtr = NULL;
     }
     else {
        printf( "%d not inserted. No memory available.\n", value );
     }
  }
  else{
//if data to insert is less then data in current node
    if ( value < ( *treePtr )->data ) {
      insertNode( &( ( *treePtr )->leftPtr ), value );
    }
//if data to insert is greater then data in current node
    else if ( value > ( *treePtr )->data ) {
      insertNode( &( ( *treePtr )->rightPtr ), value );
    }
    else{
      printf( "dup" );
    }
  }
}

//inOrder if tree is not empty
void inOrder( TreeNodePtr treePtr ){
  if ( treePtr != NULL ) {
    inOrder( treePtr->leftPtr );
    printf( "%3d", treePtr->data );
    inOrder( treePtr->rightPtr );
  }
}

//preOrder if tree is not empty
void preOrder( TreeNodePtr treePtr ) {
  if ( treePtr != NULL ) {
    printf( "%3d", treePtr->data );
    preOrder( treePtr->leftPtr );
    preOrder( treePtr->rightPtr );
  }
}

//postOrder if tree is not empty
void postOrder( TreeNodePtr treePtr ){
  if ( treePtr != NULL ) {
    postOrder( treePtr->leftPtr );
    postOrder( treePtr->rightPtr );
    printf( "%3d", treePtr->data );
  }
}
