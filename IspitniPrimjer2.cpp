#include "pch.h"
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#pragma warning(disable : 4996)
#define _CRT_SECURE_NO_WARNINGS
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>



struct cvor;
typedef struct cvor * position;
typedef struct cvor {
	char ime[30];
	char prez[30];
	int mat_broj;
	int bodovi;
	position next;
}Cvor;

position createnode();
int readFile(position);
void ispis(position);
int insertsort(position, position);
int unos(position, int, int);
int readFile2(position);
void ispis2(position);
void brisiSve(position);
int postavi1(position);


int main()
{
	Cvor head;
	head.next = NULL;
	//int n = 0;

	readFile(&head);
	ispis(&head);
	printf("\n\n");
	postavi1(&head);
	readFile2(&head);
	ispis2(&head);

	printf("\n\n");
	brisiSve(&head);
	ispis2(&head);

	//scanf(" %d", &n);
	_getche();
	return 0;
}

position createnode()
{
	position q = NULL;
	q = (position)malloc(sizeof(Cvor));

	q->next = NULL;
	if (q == NULL)
	{
		printf("nie aloc");
		return NULL;
	}
	else
	{
		return q;
	}
}

int postavi1(position h)
{
	h = h->next;
	while (h != NULL)
	{
		h->bodovi = -1;
		h = h->next;
	}

	return 0;
}

int readFile(position h)
{
	position s = NULL;
	FILE *f;
	f = fopen("students.txt", "r");
	if (f == NULL)
	{
		printf("nije open");
		return -1;
	}
	else
	{
		while (!feof(f))
		{
			s = createnode();
			fscanf(f, "%s %s %d", s->ime, s->prez, &s->mat_broj);

			insertsort(h, s);
		}

		fclose(f);
	}


	return 0;
}

int insertsort(position p, position s)
{
	while (p->next != NULL && strcmp(p->next->prez, s->prez) < 0)
	{
		p = p->next;
	}
	s->next = p->next;
	p->next = s;


	return 0;
}

void ispis(position h)
{
	position p = h->next;
	if (p == NULL)
	{
		printf("lista je prazna");
	}

	while (p != NULL)
	{
		printf("%s %s %d\n", p->ime, p->prez, p->mat_broj);
		p = p->next;
	}
}

int readFile2(position h)
{
	int maticni = 0;
	int rez = 0;

	FILE *f;
	f = fopen("scores.txt", "r");
	if (f == NULL)
	{
		printf("nije open");
		return -1;
	}
	else
	{
		while (!feof(f))
		{
			fscanf(f, "%d %d", &maticni, &rez);
			unos(h, maticni, rez);
		}
		fclose(f);

	}

	return 0;
}
int unos(position h, int maticni, int rez)
{
	h = h->next;
	while (h != NULL)
	{
		if (h->mat_broj == maticni)
		{
			h->bodovi = rez;
		}
		h = h->next;
	}


	return 0;
}

void ispis2(position h)
{
	position p = h->next;
	if (p == NULL)
	{
		printf("lista je prazna");
	}

	while (p != NULL)
	{
		printf("%s %s %d ->%d\n", p->ime, p->prez, p->mat_broj, p->bodovi);
		p = p->next;
	}
}
void brisiSve(position h)
{
	int x = 0;
	position temp;
	while (h->next != NULL)
	{
		temp = h->next;
		h->next = temp->next;

		free(temp);
		x++;

	}
	printf("izbrisano %d elem. iz liste\n", x);
}
