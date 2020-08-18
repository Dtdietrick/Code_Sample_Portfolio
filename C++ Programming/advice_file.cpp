// Dylan Dietrick
// Advice File
// 6/2/20

#include <iostream>
#include <fstream>
#include <string>
#include <cstdlib>
using namespace std;

using std::ifstream;
using std::ofstream;
using std::cout;
using std::ios;

int main()
{
    string text;
    char* s = (char*)malloc(80);
    ifstream fin;
    ofstream fout;
    fin.open("advice.txt");
    if(!fin.fail()){
        cout << "Found Advice File\n"
            << "Old Advice:\n";
        while (getline(fin, text)) {
            cout << text << "\n";
        }
    }
    else {
        cout << "Could not open Advice File\n"
            << "Assumption: First Run - Creating a New File\n";
        fin.open("advice.txt",ios::in | ios::out | ios::trunc);

    }
    cout << "Enter your phrase for the next user:\n";
    cin.getline(s, 81, '\n');
    fout.open("advice.txt", ios::app);
    fout << s << endl;

    fin.close();
    fout.close();
    return 0;
    system("pause");
}
