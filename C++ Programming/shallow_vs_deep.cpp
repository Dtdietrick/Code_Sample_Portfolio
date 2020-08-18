// Dylan Dietrick
// Shallow vs Deep Copies
// 6/16/20
#include <iostream>
using namespace std;

typedef int* IntPtr;
typedef char* CharPtr;
void printPointers();

class WrapArrayDeep {
    CharPtr pch;
public:

    WrapArrayDeep();
    WrapArrayDeep(CharPtr pch);
    WrapArrayDeep(const WrapArrayDeep& wad);
    ~WrapArrayDeep();
};
WrapArrayDeep::WrapArrayDeep() {
    pch = new char[5];
    *pch = 97;
    *(pch + 1) = 98;
    *(pch + 2) = 99;
    *(pch + 3) = 100;
    *(pch + 4) = 101;
    for (int i = 0; i < 5; i++)
        cout << pch[i] << " ";
}
WrapArrayDeep::WrapArrayDeep(CharPtr pntr) {
    pch = new char[5];
    pch = pntr;
    for (int i = 0; i < 5; i++)
        cout << pch[i] << " ";
}
WrapArrayDeep::WrapArrayDeep(const WrapArrayDeep& wad) {
    pch = wad.pch;
}
WrapArrayDeep::WrapArrayDeep::~WrapArrayDeep() {
    cout << "Calling Destructor for WrapArrayDeep\n";
}

class WrapArrayShallow {
    char pca[5];
public:
    WrapArrayShallow();
    WrapArrayShallow(char inp);
    WrapArrayShallow(WrapArrayShallow& ws);
    ~WrapArrayShallow();
};
WrapArrayShallow::WrapArrayShallow() {
    pca[0] = 'a';
    pca[1] = 'b';
    pca[2] = 'c';
    pca[3] = 'd';
    pca[4] = 'e';
    for (int i = 0; i < 5; i++)
        cout << *(pca + i) << " ";
}
WrapArrayShallow::WrapArrayShallow(char inp) {
    pca[0] = '{';
    pca[1] = '|';
    pca[2] = '}';
    pca[3] = '~';
    pca[4] = '!';
    for (int i = 0; i < 5; i++)
        cout << *(pca + i) << " ";
}
WrapArrayShallow::WrapArrayShallow(WrapArrayShallow& was) {
    *pca = *was.pca;
}

WrapArrayShallow:: ~WrapArrayShallow() {
    cout << "Calling Destructor for WrapArrayShallow\n";
}

int main()
{
    CharPtr pntr;
    char dumb = 'f';

    printPointers();
    cout << "\n\n";

    pntr = new char[5];
    *pntr = 123;
    *(pntr + 1) = 124;
    *(pntr + 2) = 123;
    *(pntr + 3) = 125;
    *(pntr + 4) = 33;

    cout << "This section instantiates a wrapper class for a dynamic array of 5 elements\n"
        << "\nWrapArrayDeep 1\n";
    WrapArrayDeep deepOne;


    cout << "\nWrapArrayDeep 2 created using the copy constructor on 1\n";
    WrapArrayDeep deepTwo;

    cout << "\nAfter changing the contents of WrapArrayDeep 1, 1 and 3 =\n";
    deepOne.WrapArrayDeep::WrapArrayDeep(pntr);
    cout << "\n";
    deepTwo.WrapArrayDeep::WrapArrayDeep();




    cout << "\n\nNow doing the same thing with WrapArrayShallow\n"
        << "\nWrapArrayShallow 1\n";
    WrapArrayShallow shallowOne;
    cout << "\nWrapArrayShallow 2 created using the copy constructor on 1\n";
    WrapArrayShallow shallowTwo;
    cout << "\nAfter changing the contents of WrapArrayShallow 1, 1 and 3 =\n";
    shallowOne.WrapArrayShallow::WrapArrayShallow(dumb);
    cout << "\n";
    shallowTwo.WrapArrayShallow::WrapArrayShallow(dumb);

    cout << "\n\n";

    system("pause");
    return 0;

}

void printPointers() {
    int i = 7;
    IntPtr pi;
    IntPtr* ppi;

    pi = &i;

    cout << "This program section uses 3 variables\n"
        << "i = " << i << ", pi a pointer to i and ppi a pointer to pi\n";
    cout << "\npi = " << pi << "\n"
        << "derefrence of pi " << *pi << endl
        << "address of pi = " << &pi << endl
        << "address of i = " << &i << endl;

    ppi = &pi;

    cout << "\nppi = " << ppi << "\n"
        << "derefrence of ppi " << *ppi << endl
        << "address of ppi = " << &ppi << endl
        << "double dereference of ppi = " << **ppi << endl;
}
