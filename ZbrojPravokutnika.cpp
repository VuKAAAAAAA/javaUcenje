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
	Tocka(double a, double b)
	{
		x = a;
		y = b;
	}
	double Udaljenost()
	{
		double duzina;
		duzina = sqrt(pow(x, 2) + pow(y, 2));

		return duzina;
	}

	friend class Pravokutnik;
};
class Pravokutnik
{
private:
	Tocka donja_lijeva;
	Tocka gornja_desna;

	int sirina;
	int visina;

public:

	Pravokutnik()
	{
		Pravokutnik(0, 0, 0, 0);
	}
	Pravokutnik(Tocka t1, Tocka t2)
	{
		donja_lijeva = t1;
		gornja_desna = t2;
	}
	Pravokutnik(double tocka1_x, double tocka1_y, double tocka2_x, double tocka2_y)
	{
		donja_lijeva.x = tocka1_x;
		donja_lijeva.y = tocka1_y;

		gornja_desna.x = tocka2_x;
		gornja_desna.y = tocka2_y;

		sirina = gornja_desna.x - donja_lijeva.x;
		visina = gornja_desna.y - donja_lijeva.y;
	}

	Pravokutnik operator+(Pravokutnik p)
	{
		Pravokutnik novi(0, 0, 0, 0);

		if ((this->donja_lijeva.Udaljenost()) < (p.donja_lijeva.Udaljenost()))
			novi.donja_lijeva = donja_lijeva;
		else
			novi.donja_lijeva = p.donja_lijeva;


		novi.sirina = this->sirina + p.sirina;
		novi.visina = this->sirina + p.sirina;

		novi.gornja_desna.x = donja_lijeva.x + novi.sirina;
		novi.gornja_desna.y = donja_lijeva.y + novi.visina;

		return novi;
	}

	int Ispis()
	{
		cout << "Sirina:" << sirina << " Visina:" << visina << " Donja lijeva (" << donja_lijeva.x << "," << donja_lijeva.y << ")" << " Gornja desna (" << gornja_desna.x << "," << gornja_desna.y << ")" << endl;
		cout << endl;
		return 0;
	}
};


int main()
{
	Pravokutnik p1(1, 1, 3, 3);
	Pravokutnik p2(4, 4, 6, 6);
	Pravokutnik p3;

	p3 = p1 + p2;

	cout << "Pravokutnik 1: " << endl << endl;
	p1.Ispis();
	cout << endl;

	cout << "Pravokutnik 2: " << endl << endl;
	p2.Ispis();
	cout << endl;

	cout << "Pravokutnik 3: " << endl << endl;
	p3.Ispis();
	cout << endl;

	return 0;
}

