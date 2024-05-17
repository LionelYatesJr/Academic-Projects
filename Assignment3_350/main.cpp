#include <iostream>
#include <pthread.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include <semaphore.h>
#include <queue>
#define NUM_THREADS    1
using namespace std;
int main() {
    int n;
    char x;
    // create a queue of string
    queue<char> tools;
    ifstream fin("allocate.txt");
    // number of threads
    fin >> n;
    cout << "number of threads " << n << "\n";
    // push elements into the queue
    while (fin >> x)
        tools.push(x);
    cout << "Queue: ";

    // print elements of queue
    // loop until queue is empty
    while(!tools.empty()) {

        // print the element
        cout << tools.front() << ", ";

        // pop element from the queue
        tools.pop();
    }

    cout << endl;

    return 0;
}





