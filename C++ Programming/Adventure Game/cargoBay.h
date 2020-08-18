#include <iostream>
using namespace std;

class cargoBay
{
public:

    void printRoom() {
        cout << endl
            << "You enter a huge bay filled with rows of steel shipping containers" << endl
            << "To your left there are towering doors that if opened lead into the cold empty of space" << endl
            << "As you step into the room and before you can get a look around" << endl
            << "you see something out of the corner of your eye\n" << endl
            << "!!! A Spidery Creature Bares Its Fangs and Lunges Towards You !!! \n" << endl;
    }

    void printChoice() {
        cout << "\nDo you try to Shoot the Spider?" << endl
            << "\nType \"Y\" to Shoot the Spider." << endl
            << "Type \"N\" to Cower in Fear.\n" << endl;
    }


    void printRoomAlive() {
        cout << endl
            << "You Begin to Look Around the Cargo Bay" << endl
            << "There is a box of ammo.\n" << endl;
    }

};

