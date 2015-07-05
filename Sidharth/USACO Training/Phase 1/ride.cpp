/*
ID: your_id_here
PROG: test
LANG: C++
*/
#include <iostream>
#include <fstream>
#include <string>
#include <cstring>

using namespace std;


/* original code
    ofstream fout ("test.out");
    ifstream fin ("test.in");
    int a, b;
    fin >> a >> b;
    fout << a+b << endl;
    return 0; */

int process(string istring[], int modulus)
{
	int imax = strlen(istring)-1;
	int val  = istring[0];
	while(imax > 0)
	{
		val*=(int)(istring[imax]-64);
		val=val%modulus;
		imax--;
	}

	return val;

}
int main() 
{

	ofstream output ("test.out");
	ifstream input ("test.in");
	string a;
	string b; //two character arrays
	input >> a >> b;

	if(process(a,47) == process(b,47))
	{
		output << "GO";
		return 0;
	}
	output << "STAY";
	return 0;
}