#include <string>
#include <iostream>
using namespace std;
#ifndef GUN_H
#define GUN_H

class Gun
{
private:
    string caliber;
    string manufacturer;
    string* gunCabinet = new string[12];

public:    
    virtual void printCabinet() {
        
    }
        void setMaker(string m) {
        manufacturer = m;
    }
    string getMaker() {
        return manufacturer;
    }

    void setCaliber(string c) {
        caliber = c;
    }
    string getCaliber() {
        return caliber;
    }
    
};

#endif
