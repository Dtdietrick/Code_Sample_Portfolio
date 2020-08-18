#ifndef PISTOL_H
#define PISTOL_H

#include "Handgun.h"

class Pistol : public Handgun
{
private:
    bool semiauto;
    string* gunCabinet = new string[12];

public:
    bool semiAutoBool(string y) {
        string bulz;
        bulz = "y";
        if (bulz.compare(y) != 0) {
            semiauto = false;
            return false;
        }
        else {
            semiauto = true;
            return true;
        }
    }
    string getSemiAuto() {
        string semiAuto = " Semi-Automatic";
        string noSemiAuto = "";
        if (semiauto == 1) {
            return semiAuto;
        }
        else {
            return noSemiAuto;
        }
    }
    void setCabinet(string* cabinet) {
        gunCabinet = cabinet;
    }
    string* getCabinet() {
        return gunCabinet;
    }
    
    void printCabinet() {
        string* cab = this->Pistol::getCabinet();
        for (int i = 0; i < 12; i++) {
            cout << cab[i];
        }
    }
    
};

#endif
