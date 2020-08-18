// Test Adventure Game
// V3 With Classes and Status Updates
// 5/19/20

#include <iostream>
#include <algorithm>
#include <string>
#include <math.h>
#include <iomanip>
#include <stdlib.h>
#include<time.h>

//Classes
#include "Player.h";
#include "Enemy.h";
#include "firstRoom.h";
#include "secondRoom.h";
#include "cargoBay.h";
#include "formatOutput.h";

using namespace std;

int main() {
    srand(time(0));
    Player one;
    Enemy firstEnemy;
    firstRoom rmOne;
    secondRoom rmTwo;
    cargoBay rmThree;
    formatOutput frmt;
    int roomChoice;
    int validChoice;
    int validConsoleChoice;
    int validShot;
    int shotChance;
    int validStatus;
    string usrInput = " ";
    string restartGame = "Y";



    while (restartGame == "Y") {
        one.name = " ";
        usrInput = " ";
        one.alive = 1;
        one.health = 100;
        one.ammo = 50;
        one.rooms = 0;
        one.kills = 0;
        roomChoice = 0;
        validChoice = 0;
        validConsoleChoice = 0;
        validShot = 0;
        validStatus = 0;

        do {

            cout << endl << "To Start Game Please Enter Character's Name \n";
            cin >> one.name;
            one.printStatus();
            cout << "\n***  Type Status at Any Time to Check " << one.name << "'s Status  ***\n";
            cout << "\n***  All Commands Are Case Insensitive : \'D\' and \'d\' are the same  ***\n";
            rmOne.printRoom();
            rmOne.printChoice();
            cin >> usrInput;
            usrInput = frmt.formatString(usrInput);
            validStatus = frmt.inputValidStatus(usrInput);

            //check status
            while (validStatus == 1) {
                one.printStatus();
                rmOne.printRoom();
                rmOne.printChoice();
                cin >> usrInput;
                usrInput = frmt.formatString(usrInput);
                validStatus = frmt.inputValidStatus(usrInput);
            }
            validChoice = frmt.inputValidDoors(usrInput);

            // invalid door select
            while (validChoice == 0) {
                cout << "\nInvalid Choice, Try Again" << endl;
                rmOne.printRoom();
                rmOne.printChoice();
                cin >> usrInput;
                usrInput = frmt.formatString(usrInput);
                validStatus = frmt.inputValidStatus(usrInput);

                //check status while invalid
                while (validStatus == 1) {
                    one.printStatus();
                    rmOne.printRoom();
                    rmOne.printChoice();
                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validStatus = frmt.inputValidStatus(usrInput);
                }
                validChoice = frmt.inputValidDoors(usrInput);
            }

            roomChoice = rmOne.roomChoice(usrInput);
            //suicide
            if (roomChoice == 4) {
                cout << "\nYou Overload Your Laser Pistol and Tearfully Wave Goodbye" << endl;
                one.ammo -= 10;
                one.health -= 100;
                one.alive = 0;
            }
            //unable to open
            while (roomChoice == 2) {
                if (roomChoice == 2) {
                    cout << "Feel the barred door for clues, but are unable to open it" << endl
                        << "Choose another Door" << endl;
                    //repeat choices
                    rmOne.printChoice();
                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validStatus = frmt.inputValidStatus(usrInput);

                    while (validStatus == 1) {
                        one.printStatus();
                        rmOne.printRoom();
                        rmOne.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);
                    }
                    validChoice = frmt.inputValidDoors(usrInput);

                    while (validChoice == 0) {
                        cout << "\nInvalid Door, Try Again" << endl;
                        rmOne.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);

                        while (validStatus == 1) {
                            one.printStatus();
                            rmOne.printRoom();
                            rmOne.printChoice();
                            cin >> usrInput;
                            usrInput = frmt.formatString(usrInput);
                            validStatus = frmt.inputValidStatus(usrInput);
                        }
                        validChoice = frmt.inputValidDoors(usrInput);
                    }
                    roomChoice = rmOne.roomChoice(usrInput);
                }
            }
            //rmTwo
            if (roomChoice == 1) {
                cout << "\nYou enter a hallway and see a waiting space ship at the end of the hall!" << endl
                    << "But as you begin to run towards it you hear footsteps, the last thing you hear" << endl
                    << "As everything fades to black\n";
                one.health -= 100;
                one.alive = 0;
            }
            //death room
            else if (roomChoice == 3) {
                cout << "\nYou manage to pry the ajar door open and continue down the hallway." << endl;
                one.rooms += 1;
            }

            //rmTwo
            if (one.alive == 1) {

                rmTwo.printRoom();
                if (validConsoleChoice == 0) {
                    cout << "There is a red light above the Cargo Bay Door" << endl;
                }
                rmTwo.printChoice();
                cin >> usrInput;
                usrInput = frmt.formatString(usrInput);
                validStatus = frmt.inputValidStatus(usrInput);

                //check status
                while (validStatus == 1) {
                    one.printStatus();
                    rmTwo.printRoom();
                    if (validConsoleChoice == 0) {
                        cout << "There is a red light above the Cargo Bay Door" << endl;
                    }
                    else {
                        cout << "There is a green light above the Cargo Bay Door" << endl;
                    }
                    rmTwo.printChoice();
                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validStatus = frmt.inputValidStatus(usrInput);
                }
                validChoice = frmt.inputValidConsole(usrInput);

                //invalid door select
                while (validChoice == 0) {
                    cout << "\nInvalid Choice, Try Again" << endl;
                    rmTwo.printRoom();
                    if (validConsoleChoice == 0) {
                        cout << "There is a red light above the Cargo Bay Door" << endl;
                    }
                    else {
                        cout << "There is a green light above the Cargo Bay Door" << endl;
                    }
                    rmTwo.printChoice();
                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validStatus = frmt.inputValidStatus(usrInput);

                    //check status while invalid door
                    while (validStatus == 1) {
                        one.printStatus();
                        rmTwo.printRoom();
                        if (validConsoleChoice == 0) {
                            cout << "There is a red light above the Cargo Bay Door" << endl;
                        }
                        else {
                            cout << "There is a green light above the Cargo Bay Door" << endl;
                        }
                        rmTwo.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);
                    }

                    validChoice = frmt.inputValidConsole(usrInput);
                }

                roomChoice = rmTwo.roomChoice(usrInput);

                //rmTwo Console
                while (roomChoice == 2) {
                    if (roomChoice == 2) {

                        rmTwo.printConsoleChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);

                        //check status
                        while (validStatus == 1) {
                            one.printStatus();
                            rmTwo.printConsoleChoice();
                            cin >> usrInput;
                            usrInput = frmt.formatString(usrInput);
                            validStatus = frmt.inputValidStatus(usrInput);
                        }
                        validChoice = frmt.inputShotChoice(usrInput);
                        validConsoleChoice = frmt.inputValidContinue(usrInput);

                        //invalid colsole choice
                        while (validChoice == 0) {
                            cout << "Invalid Choice, Try Again" << endl;
                            rmTwo.printConsoleChoice();
                            cin >> usrInput;
                            usrInput = frmt.formatString(usrInput);
                            validStatus = frmt.inputValidStatus(usrInput);

                            while (validStatus == 1) {
                                one.printStatus();
                                rmTwo.printConsoleChoice();
                                cin >> usrInput;
                                usrInput = frmt.formatString(usrInput);
                                validStatus = frmt.inputValidStatus(usrInput);
                            }
                            validChoice = frmt.inputShotChoice(usrInput);
                            validConsoleChoice = frmt.inputValidContinue(usrInput);
                        }
                    }
                    cout << endl
                        << "You look up from the console" << endl;
                    if (validConsoleChoice == 1) {
                        cout << endl << "The light above the Cargo Bay Door has turned from Red to Green" << endl;
                    }
                    else {
                        cout << endl << "The light above the Cargo Bay Door has turned from Green to Red" << endl;
                    }
                    rmTwo.printRoom();
                    if (validConsoleChoice == 0) {
                        cout << "There is a red light above the Cargo Bay Door" << endl;
                    }
                    else {
                        cout << "There is a green light above the Cargo Bay Door" << endl;
                    }
                    rmTwo.printChoice();

                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validStatus = frmt.inputValidStatus(usrInput);

                    while (validStatus == 1) {
                        one.printStatus();
                        rmTwo.printRoom();
                        if (validConsoleChoice == 0) {
                            cout << "There is a red light above the Cargo Bay Door" << endl;
                        }
                        else {
                            cout << "There is a green light above the Cargo Bay Door" << endl;
                        }
                        rmTwo.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);
                    }
                    validChoice = frmt.inputValidConsole(usrInput);

                    while (validChoice == 0) {
                        cout << "Invalid Choice, Try Again" << endl;
                        rmTwo.printRoom();
                        if (validConsoleChoice == 0) {
                            cout << "There is a red light above the Cargo Bay Door" << endl;
                        }
                        else {
                            cout << "There is a green light above the Cargo Bay Door" << endl;
                        }
                        rmTwo.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validStatus = frmt.inputValidStatus(usrInput);

                        while (validStatus == 1) {
                            one.printStatus();
                            rmTwo.printRoom();
                            if (validConsoleChoice == 0) {
                                cout << "There is a red light above the Cargo Bay Door" << endl;
                            }
                            else {
                                cout << "There is a green light above the Cargo Bay Door" << endl;
                            }
                            rmTwo.printChoice();
                            cin >> usrInput;
                            usrInput = frmt.formatString(usrInput);
                            validStatus = frmt.inputValidStatus(usrInput);
                        }

                        validChoice = frmt.inputValidConsole(usrInput);
                    }

                    roomChoice = rmTwo.roomChoice(usrInput);

                }


                if (roomChoice == 1 && validConsoleChoice == 1) {
                    cout << endl
                        << "The Cargo Bay opens with a faint hiss of stale air\n";
                    one.rooms += 1;
                }
                else {
                    cout << endl
                        << "The Cargo Bay wasn't pressurized and you were sucked into Space\n" << endl;
                    one.health -= 100;
                    one.alive = 0;
                }

            }

            //rmThree
            if (one.alive == 1) {
                firstEnemy.alive = 1;
                firstEnemy.health = 100;
                firstEnemy.distance = 10;
                rmThree.printRoom();

                //enemy encounter
                while (firstEnemy.distance > 0 && firstEnemy.alive != 0) {
                    rmThree.printChoice();
                    cin >> usrInput;
                    usrInput = frmt.formatString(usrInput);
                    validChoice = frmt.inputShotChoice(usrInput);
                    validShot = frmt.inputValidShot(usrInput);

                    while (validChoice == 0) {
                        cout << "\nInvalid Choice, Try Again" << endl;
                        rmThree.printChoice();
                        cin >> usrInput;
                        usrInput = frmt.formatString(usrInput);
                        validChoice = frmt.inputShotChoice(usrInput);
                        validShot = frmt.inputValidShot(usrInput);
                    }
                    if (validShot == 1) {
                        shotChance = rand() % 10 + 1;

                        if (shotChance > 5) {
                            cout << "\nYou hit the spider\n";
                            one.ammo -= 1;
                            firstEnemy.health -= 25;
                        }
                        else {
                            cout << "\nYou missed the spider\n";
                            one.ammo -= 1;
                        }
                    }
                    if (firstEnemy.health == 0) {
                        firstEnemy.alive = 0;
                    }

                    firstEnemy.distance -= 1;
                    firstEnemy.printStatus();
                    one.ammoStatus();
                }

                if (firstEnemy.alive == 1) {
                    one.health -= 100;
                    one.alive = 0;
                    firstEnemy.printSpiderKill();
                }
                else {
                    firstEnemy.printKillSpider();
                    one.kills += 1;
                }

            }

            //Survived Creature
            if (one.alive == 1) {
                rmThree.printRoomAlive();
                one.rooms += 1;
            }

            if (one.alive == 1) {
                cout << endl
                    << "\nyou survived...for now...more to come" << endl;
            }
            if (one.health == 100) {
                one.health -= 100;
            }

        } while (one.health > 0);

        one.printStatus();

        cout << "\nPlay Again? Y for Yes N for No" << endl;
        cin >> usrInput;

        usrInput = frmt.formatString(usrInput);
        validChoice = frmt.inputValidContinue(usrInput);

        if (validChoice == 1) {
            restartGame = 'Y';
        }
        else {
            restartGame = 'N';
        }
    }

}
