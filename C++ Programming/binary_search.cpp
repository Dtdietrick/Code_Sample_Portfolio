// Dylan Dietrick
// Binary Search
// 5/31/20
#include <iostream>
#include <string>
using namespace std;
template <typename T>
int search(T arr[], int lef, int rig, T x)
{
    while (lef <= rig) {
        int mid = lef + (rig - lef) / 2;

        if (arr[mid] == x)
            return mid;

        if (arr[mid] < x)
            lef = mid + 1;

        else
            rig = mid - 1;
    }

    return -1;
}
int main(void)
{
    int arr[] = { 0, 1, 1, 2, 3, 5, 6, 13, 21, 32, 55 };
    string str[] = {"Head","Knees", "Shoulders", "Toes"};
    string query[] = { "Elbow","Knees", "Toes", "Shoulders", "Head", "Feet" };

    cout << "Integer Test Array Contains" << endl;
    cout << "{";
        for (int i = 0; i < 11; i++) {
            if (i == 10) {
                cout << arr[i];
            }
            else {
                cout << arr[i] << ", ";
            }
    }
    cout << "}" << endl;
    cout << "\n";

    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = -1; i < 8; i++) {
        int result = search<int>(arr, 0, n - 1, i);
        (result == -1) ? cout << i << " is not in the array" << endl
            : cout << i << " is at index " << result << endl;
    }

    cout << "\n";
    cout << "String Test Array Contains" << endl;

    cout << "{";
    for (int i = 0; i < 4; i++) {
        if (i == 3) {
            cout << str[i];
        }
        else {
            cout << str[i] << ", ";
        }
    }
    cout << "}" << endl;
    cout << "\n";

    n = sizeof(str) / sizeof(str[0]);

    for (int i = 0; i < 6; i++) {
        int rezult = search<string>(str, 0, n - 1, query[i]);
        (rezult == -1) ? cout << query[i] << " is not in the array" << endl
            : cout << query[i] << " is at index " << rezult << endl;
    }

    system("pause");
    return 0;
}
