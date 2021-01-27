#include <iostream>
#include <utility>     
#include <string>       
using namespace std;

int main()
{
	int n;
	cin >> n;
	while (n--) {
		long long x;
		cin >> x;
		if (x & (x - 1)) {
			cout << "yes" << endl;
		}
		else {
			cout << "no" << endl;
		}
	}

}

