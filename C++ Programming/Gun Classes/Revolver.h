#ifndef REVOLVER_H
#define REVOLVER_H
#include "Handgun.h"
class Revolver : public Handgun
{
private:
    bool singleAction;
    int numberOfRounds;
    string* gunCabinet = new string[12];

public:
    bool singleActionBool(string y) {

        string bulz;

        bulz = "y";
        if (bulz.compare(y) != 0) {
            singleAction = false;
            return false;
        }
        else {
            singleAction = true;
            return true;
        }
    }
    string getSingleAction() {

        string action = " Single Action";
        string noAction = " Double Action";

        if (singleAction == 1) {
            return action;
        }
        else {
            return noAction;
        }
    }
    void setNumberOfRounds(int n) {
        numberOfRounds = n;
    }
    int getNumberOfRounds() {
        return numberOfRounds;
    }

    void setCabinet(string* cabinet) {
        gunCabinet = cabinet;
    }
    string* getCabinet() {
        return gunCabinet;
    }
    void printCabinet() {
        string* cab = this->Revolver::getCabinet();
        for (int i = 0; i < 12; i++) {
            cout << cab[i];
        }
    }
};

#endif