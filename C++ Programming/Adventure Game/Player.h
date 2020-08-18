#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

class Player
{

public:
    string name;
    int health;
    int ammo;
    int alive;
    int rooms;
    int kills;

    void printStatus()
    {
        cout << endl
            << name << "'s Status: " << endl;
        cout << std::left << std::setw(12) << "Health:"
            << std::right << std::setw(3) << health
            << '\n';
        cout << std::left << std::setw(12) << "Ammo:"
            << std::right << std::setw(3) << ammo
            << '\n';
        cout << std::left << std::setw(12) << "Rooms:"
            << std::right << std::setw(3) << rooms
            << '\n';
        cout << std::left << std::setw(12) << "Kills:"
            << std::right << std::setw(3) << kills
            << '\n';
    }

    void ammoStatus() {
        cout << "Ammo Left: " << ammo << " \n";
    }
};

