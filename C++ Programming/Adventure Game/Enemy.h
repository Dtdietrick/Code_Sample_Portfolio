#include <iostream>
using namespace std;

class Enemy
{
public:
    int health;
    int alive;
    int distance;

    void printStatus() {
        cout << endl
            << "The creature is still charging towards you!" << endl
            << "The creature is " << distance << " Yards Aways" << endl
            << "The creature has " << health << " Health\n" << endl;
    }

    void printSpiderKill() {
        cout << endl
            << "The spider eats your face off and spins the rest of you into a web for later\n" << endl;
    }

    void printKillSpider() {
        cout << endl
            << "The spider falls down dead in front of you\n" << endl;
    }
};

