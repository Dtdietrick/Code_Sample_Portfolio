// Dylan Dietrick
// Virtual Print Class
// 6/29/20

#include <iostream>
#include "Gun.h"
#include "Handgun.h"
#include "Revolver.h"
#include "Pistol.h"

using namespace std;

int main()
{
    Revolver r1,r2;
    Pistol p1,p2;
    string rT = "Revolver:";
    string pT = "Pistol:";
    string* revolverCabinet1 = new string[12];
    string* pistolCabinet1 = new string[12];
    string* revolverCabinet2 = new string[12];
    string* pistolCabinet2 = new string[12];
    string sp = ", ";


    r1.setCaliber("0.357");
    r1.setMaker("Smith & Wesson");
    r1.setGrips("Hoague Grips");
    r1.setSights("Trijicon");
    r1.setNumberOfRounds(6);
    r1.laserBool("y");
    r1.singleActionBool("n");


    revolverCabinet1[0] = rT;
    revolverCabinet1[1] = r1.getSingleAction();
    revolverCabinet1[2] = sp;
    revolverCabinet1[3] = r1.getCaliber();
    revolverCabinet1[4] = sp;
    revolverCabinet1[5] = r1.getMaker();
    revolverCabinet1[6] = sp;
    revolverCabinet1[7] = r1.getGrips();
    revolverCabinet1[8] = sp;
    revolverCabinet1[9] = r1.getSights();
    revolverCabinet1[10] = sp;
    revolverCabinet1[11] = r1.getLaser();
    r1.setCabinet(revolverCabinet1);

    r2.setCaliber("0.45");
    r2.setMaker("Colt");
    r2.setGrips("Ivory Grips");
    r2.setSights("Standard Sights");
    r2.setNumberOfRounds(6);
    r2.laserBool("n");
    r2.singleActionBool("y");

    revolverCabinet2[0] = rT;
    revolverCabinet2[1] = r2.getSingleAction();
    revolverCabinet2[2] = sp;
    revolverCabinet2[3] = r2.getCaliber();
    revolverCabinet2[4] = sp;
    revolverCabinet2[5] = r2.getMaker();
    revolverCabinet2[6] = sp;
    revolverCabinet2[7] = r2.getGrips();
    revolverCabinet2[8] = sp;
    revolverCabinet2[9] = r2.getSights();
    revolverCabinet2[10] = sp;
    revolverCabinet2[11] = r2.getLaser();
    r2.setCabinet(revolverCabinet2);

    p1.setCaliber("9mm");
    p1.setMaker("Glock");
    p1.setGrips("Manufacturers Grips");
    p1.setSights("3 Dot Sights");
    p1.laserBool("n");
    p1.semiAutoBool("y");

    pistolCabinet1[0] = pT;
    pistolCabinet1[1] = p1.getSemiAuto();
    pistolCabinet1[2] = sp;
    pistolCabinet1[3] = p1.getCaliber();
    pistolCabinet1[4] = sp;
    pistolCabinet1[5] = p1.getMaker();
    pistolCabinet1[6] = sp;
    pistolCabinet1[7] = p1.getGrips();
    pistolCabinet1[8] = sp;
    pistolCabinet1[9] = p1.getSights();
    pistolCabinet1[10] = sp;
    pistolCabinet1[11] = p1.getLaser();
    p1.setCabinet(pistolCabinet1);

    p2.setCaliber("7.65mm");
    p2.setMaker("Walther");
    p2.setGrips("Custom Grips");
    p2.setSights("Modified Sights");
    p2.laserBool("n");
    p2.semiAutoBool("y");


    pistolCabinet2[0] = pT;
    pistolCabinet2[1] = p2.getSemiAuto();
    pistolCabinet2[2] = sp;
    pistolCabinet2[3] = p2.getCaliber();
    pistolCabinet2[4] = sp;
    pistolCabinet2[5] = p2.getMaker();
    pistolCabinet2[6] = sp;
    pistolCabinet2[7] = p2.getGrips();
    pistolCabinet2[8] = sp;
    pistolCabinet2[9] = p2.getSights();
    pistolCabinet2[10] = sp;
    pistolCabinet2[11] = p2.getLaser();
    p2.setCabinet(pistolCabinet2);


    Gun *g[4];
    g[0] = &r1;
    g[1] = &p1;
    g[2] = &r2;
    g[3] = &p2;

    cout << "Guns in Cabinet:\n";
    for (int i = 0; i < 4; i++) {
        g[i]->printCabinet();
        cout << "\n";
    }

    system("pause");
    return 0;
}
