#include <iostream>
#include <string>
using namespace std;

class firstRoom
{
public:

    void printRoom() {
        cout << "\nYou wake up with gun and are presented with three doors. " << endl
            << "The center door stands slightly ajar." << endl
            << "The door to the left covered in blood." << endl
            << "The door to the right has a large metal bar welded across it." << endl;
    }

    void printChoice() {
        cout << endl
            << "What do you choose?" << endl
            << "\nType \"L\" to try the Left Door." << endl
            << "Type \"R\"to try the Right Door." << endl
            << "Type \"C\" to try the Center Door." << endl
            << "Type \"S\" to end it all.\n" << endl;
    }

    int roomChoice(string inputString) {
        int doorChoice;

        if (inputString.find('C') != string::npos) {
            return doorChoice = 3;
        }
        else if (inputString.find('L') != string::npos) {
            return doorChoice = 1;
        }
        else if (inputString.find('S') != string::npos) {
            return doorChoice = 4;
        }
        else {
            return doorChoice = 2;
        }
    }
};

