
#ifndef HANDGUN_H
#define HANDGUN_H

#include "Gun.h"
class Handgun : public Gun
{
private:
    string grips;
    string sights;
    bool laser;

public:
    void setGrips(string g) {
        grips = g;
    }
    string getGrips() {
        return grips;
    }
    void setSights(string s) {
        sights = s;
    }
    string getSights() {
        return sights;
    }
    bool laserBool(string y) {
        string bulz;
        bulz = "y";
        if (bulz.compare(y) != 0) {
            laser = false;
            return false;
        }
        else {
            laser = true;
            return true;
        }
    }
    string getLaser() {
        string lazer = "Laser Sight";
        string nolazer = "No Laser Sight";
        if (laser == 1) {
            return lazer;
        }
        else {
            return nolazer;
        }
    }
};
#endif

