#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <string>
#include <iostream>
#include <fstream>
#include <queue>
using namespace std;

#define M 10
#define N 10

int rows, columns, a[M][N], s[M];


// compute the sum of each row

void* sumArray(void* p) {
    int k = *((int*) p);
    int i;
    for (i = 0; i < columns; i++) {
        s[k] += a[k][i];
    }
    return NULL;
}

int main() {
    int i, j, *ptr, rc;
    pthread_t th[M];
// Get inputs.
    ifstream fin("input.txt");
    ofstream fout("output.txt");
    fin >> rows; //Since dimension of matrix is nxn
    columns = rows;


    // matrix creation
    for (i = 0; i < rows; i++) {
        for (j = 0; j < columns; j++) {
            fin >> a[i][j];
        }
    }

    printf("\nThe matrix is: \n");
    for(i=0; i < rows; i++) {
        for(j=0; j < columns; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }

    // thread creation
    for (i=0; i < rows; i++) {
        ptr = (int*) malloc(sizeof(int));
        *ptr = i;
        rc = pthread_create(&th[i], NULL, sumArray, ptr);
        if (rc != 0) {
            printf("Thread creation failed");
            exit(-1);
        }
    }

    for (i=0; i < rows; i++) {
        pthread_join(th[i], NULL);
    }
    // compute the final sum
    // Find the row(s) with the maximum value.
    int maxValue = -1;
    string maxRows = "";

    for (i=0; i < rows; i++) {
        if(s[i] > maxValue){
            maxValue = s[i];
            maxRows = to_string(i) + " ";
        }else if(s[i] == maxValue){
            maxRows = maxRows + to_string(s[i]) + " ";

        }
    }
    fout << "Maximum Row(s) and value: \n"
            << "Row " << maxRows << " " << maxValue << endl;

    return 0;
}