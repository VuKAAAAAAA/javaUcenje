#include "pch.h"
#include <iostream>
#include <fstream>
#include<string>
#include <cmath>
using namespace std;

class Tocka
{
private:
	double x;
	double y;

public:
	Tocka()
	{
		x = 0;
		y = 0;
	}

	Tocka(int a, int b)
	{
		x = a;
		y = b;
	}

	void Ispis()
	{
		cout << "(" << x << "," << y << ")" << endl;
	}

	friend void Inkrementiraj(Tocka *);
};

void Inkrementiraj(Tocka *t)
{
	t->x++;
	t->y++;
}


int main()
{
	int x = 0;
	int y = 0;

	cout << "Upisite X koordinatu tocke: ";
	cin >> x;
	cout << "Upisite Y koordinatu tocke: ";
	cin >> y;

	Tocka t(x, y);

	cout << endl;
	cout << "Tocka t: ";
	t.Ispis();

	Inkrementiraj(&t);

	cout << endl;
	cout << "Tocka t nakon inkrementiranja: ";
	t.Ispis();
	cout << endl;

	return 0;
}
