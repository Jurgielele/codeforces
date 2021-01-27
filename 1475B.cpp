#include <iostream>

using namespace std;

int main()
{
	int a;
	cin >> a;
	for (int i = 0; i < a; i++) {
		int x;
		bool y = false;
		cin >> x;
		if (x >= 2020) {
			while (x >= 2020) {
				if (x % 2020 == 0 || x % 2021 == 0) {
					cout << "yes" << endl;
					y = true;
					break;
				}
				x = x - 2021;
			}
			if (y==false) {
				cout << "no" << endl;
			}
		}
		else {
			cout << "no" << endl;
		}
	}


}

