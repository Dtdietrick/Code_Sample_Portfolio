#include <iostream>
#include <string>
using namespace std;

class secondRoom
{
public:

    void printRoom() {
        cout << endl
            << "You find yourself in a small command area of the ship" << endl
            << "Looking around you see a computer console and a door that leads to the cargo bay." << endl;

    }

    void printChoice() {
        cout << "Try the Computer Console or go through the Door to the Cargo Bay?\n" << endl
            << "What do you choose?" << endl
            << "\nType \"D\" to go on through to the Cargo Bay." << endl
            << "Type \"C\" to try Computer Console.\n" << endl;
    }

    void printConsoleChoice() {
        cout << endl << "The screen blinks on" << endl
            << "A button pops up asking if you want to pressurize the Cargo Bay\n" << endl
            << "What do you choose?" << endl
            << "\nType \"Y\" to Pressurize the Cargo Bay." << endl
            << "Type \"N\" to Continue without Pressurizing.\n" << endl;
    }

    int roomChoice(string inputString) {
        int doorChoice;

        if (inputString.find('D') != string::npos) {
            return doorChoice = 1;
        }
        else {
            return doorChoice = 2;
        }
    }
};

