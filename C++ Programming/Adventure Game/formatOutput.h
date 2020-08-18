#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class formatOutput
{
public:

    string formatString(string inputString) {
        string outputString = inputString;
        transform(outputString.begin(), outputString.end(), outputString.begin(), ::toupper);
        return outputString;
    }

    int inputValidDoors(string inputString) {
        int valid;

        if (inputString.find('C') != string::npos || inputString.find('L') != string::npos || inputString.find('R') != string::npos || inputString.find('S') != string::npos) {
            return valid = 1;
        } {
            return valid = 0;
        }
    }

    int inputConsoleChoice(string inputString) {
        int valid;
        if (inputString.find('Y') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }

    }

    int inputValidConsole(string inputString) {
        int valid;

        if (inputString.find('C') != string::npos || inputString.find('D') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }

    }

    int inputValidContinue(string inputString) {
        int valid;

        if (inputString.find('Y') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }
    }
    int inputShotChoice(string inputString) {
        int valid;

        if (inputString.find('Y') != string::npos || inputString.find('N') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }
    }

    int inputValidShot(string inputString) {
        int valid;

        if (inputString.find('Y') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }

    }

    int inputValidStatus(string inputString) {
        int valid;

        if (inputString.find('STAT') != string::npos) {
            return valid = 1;
        }
        else {
            return valid = 0;
        }

    }
};

