/*
ID: your_id_here
PROG: test
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>

using namespace std;


/* original code
    ofstream fout ("test.out");
    ifstream fin ("test.in");
    int a, b;
    fin >> a >> b;
    fout << a+b << endl;
    return 0; */
int main() 
{

	ofstream sid ("test.out");
	ifstream gho ("test.in");
	int a,b;
	gho >> a >> b;
	sid << a+b << endl;
	return 0;
}