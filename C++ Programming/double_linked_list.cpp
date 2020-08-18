// Dylan Dietrick
// Double Linked List
// 7/9/20
#include <iostream>
#include <string>
using namespace std;

// node defined for storage & linking
class node
{
public:
    string name;
    node* next;
    node* prev;
};

class linkedList
{
public:
    linkedList() :top(NULL), end(NULL) {}
    bool empty() { return top == NULL; }
    node* getTop() { return top; }
    node* getEnd() { return end; }
    void setTop(node* n) { top = n; }
    void setEnd(node* n) { end = n; }
    void add(string);
    int menu();
    void remove(string);
    ~linkedList();
    void reversePrint();
    friend ostream& operator << (ostream&, const linkedList&); // default output in-order print
private:
    node* top;
    node* end;
};

int main()
{
    linkedList l;
    cout << l.empty() << endl;
    int option = 0;
    string s;
    bool go = true;
    while (go)
    {
        option = l.menu();
        switch (option)
        {
        case 1: cout << "enter a name: ";cin >> s; l.add(s);
            break;
        case 2: cout << "enter name to be deleted: "; cin >> s; l.remove(s);
            break;
        case 3: cout << l;
            break;
        case 4: l.reversePrint();
            break;
        case 5: cout << "exiting" << endl; go = false;
            break;
        }
    }
    // l out of bounds, calls on ~linkedList()
}

// no can do - "delete" is a reserved keyword.
void linkedList::remove(string s)
{
    bool found = false;
    node* curr = getTop();
    node* prev = NULL;;
    while (curr != NULL)
    {

        if (curr->name == s) //if match found then delete it
        {
            found = true;

            if (prev == NULL) //at top
            {
                node* temp = getTop();
                setTop(curr->next);
                if (curr == end)  //at end
                    end = NULL;
                else
                    curr->next->prev = NULL;
                delete(temp);


            }
            else //found anywhere else in list besides top/bottom
            {
                prev->next = curr->next;
                if (curr->next == NULL)
                    setEnd(prev);
                else
                    curr->next->prev = prev;
                delete(curr);
            }
        }


        if (!found)  //keep going if not found
        {
            prev = curr;
            curr = curr->next;
        }


        else curr = NULL;  //found it get out of loop
    }
    if (found)cout << "Deleted " << s << endl;  //adjust count accordingly
    else cout << s << " Not Found " << endl;
}

void linkedList::add(string s) {
    node* n = new node();
    n->name = s;
    n->next = NULL;
    n->prev = NULL;


    if (empty())  //fixing empty list
    {
        {
            top = n;
            end = n;
        }


    }
    else if (getTop()->name > s) //nodes at beginning
    {
        n->next = getTop();
        n->next->prev = n;
        n->prev = NULL;
        setTop(n);


    }
    else// insert inorder
    {
        node* curr = getTop(), * prev = curr;
        while (curr != NULL)
        {
            if (curr->name > s)
                break;
            prev = curr;
            curr = curr->next;
        }
        if (curr != NULL) { // found insert spot
            n->next = curr;
            prev->next = n;
            n->prev = prev;
            curr->prev = n;
        }


        else if (curr == NULL) {// checked if not EOL and insert point
            prev->next = n;
            n->prev = prev;
            setEnd(n);
            n->next = NULL;
        }
    }
}

ostream& operator << (ostream& os, const linkedList& ll)
{

    node* n = ll.top;
    if (n == NULL)cout << "List is empty." << endl;
    else
        while (n != NULL)
        {
            os << n->name << endl;
            n = n->next;
        }
    return os;
}

linkedList::~linkedList()//return linkedlist mem back to 'heap'
{
    cout << "~linkedList called." << endl;
    node* curr = getTop(), * del;
    while (curr != NULL) {
        del = curr;
        curr = curr->next;
        delete(del);
    }
}

int linkedList::menu()
{
    int choice = 0;
    while (choice < 1 || choice > 5)
    {
        cout << "\nEnter your choice" << endl;
        cout << " 1. Add a name." << endl;
        cout << " 2. Delete a name." << endl;
        cout << " 3. Show list." << endl;
        cout << " 4. Show reverse list. " << endl;
        cout << " 5. EXIT " << endl;
        cin >> choice;
    }
    return choice;
}

void linkedList::reversePrint()
{
    node* temp = end;

    if (temp == NULL)
        cout << "The List is Empty" << endl;
    while (temp != NULL)
    {
        cout << temp->name << endl;
        temp = temp->prev;
    }
}
