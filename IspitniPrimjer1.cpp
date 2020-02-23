#include "pch.h"
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define _CRT_SECURE_NO_WARNINGS
#pragma warning(disable : 4996)

typedef struct cvor* position;
typedef struct cvor { //svi podaci koje trebamo su definirani u strukturi
	char pass[20];
	char ime[20];
	char prez[20];

	int prioritet;

	position next;
}Cvor;

position createNode();
void readFile(position head);
int randomNumber(int min, int max);
int insert(position head, position p, int brojac);
void brisi(position head);
void ispis(position head, int brojac);
void sort(position head);

int main() {
	srand(time(0));
	position head = createNode();

	readFile(head);

	system("PAUSE");
	return 0;
}
void readFile(position head) { //funkcija za citanje podatka
	position temp = NULL; 
	int brojac = 0;
	FILE* fp = fopen("Studenti2702.txt", "r"); //citaj iz txt file-a Studenti2702.txt

	if (fp == NULL) { //ako je fp == NULL ispisi da se file ne moze otvorit
		printf("Couldn't open file");
		return;
	}

	if (head->next != NULL) { //ako head->next nije NULL
		head = head->next; //head ide jedan u naprid
	}

	while (!feof(fp)) {
		temp = createNode();
		fscanf(fp, "%s %s %s", &(temp->pass), &(temp->ime), &(temp->prez));
		temp->prioritet = randomNumber(1, 5);
		brojac = insert(head, temp, brojac);
	}
	ispis(head, brojac);

	fclose(fp);
}

position createNode() {
	position q = NULL;
	q = (position)malloc(sizeof(Cvor));
	if (q == NULL) {
		printf("Memory allocation nyet");
		return NULL;
	}
	q->next = NULL;
	return q;
}

int randomNumber(int min, int max) {
	return rand() % (max + 1 - min) + min;
}

int insert(position head, position p, int brojac) {
	position temp = head;

	while (head->next != NULL)
		head = head->next;

	head->next = p;
	p->next = NULL;

	head = temp;


	sort(head);
	head = head->next;

	while (head != NULL && head->next != NULL) {
		
		for (int i = 0; i <=5; i++)
		if ((head->prioritet == head->next->prioritet)&&(head->ime[i] == head->next->ime[i])&&(head->prez[i] == head->next->prez[i]))
		{
			brisi(head);
			brojac++;
			return brojac;
		}
		
		head = head->next;
	}
	return brojac;
}

void brisi(position head) {
	position temp = NULL;

	temp = head->next;
	head->next = temp->next;
	free(temp);
}


void ispis(position head, int brojac) {
	if (head->next != NULL)
		head = head->next;

	while (head != NULL) {
		printf("\nSifra: %s\tIme: %s\tPrezime: %s\tPrioritet:%d", head->pass, head->ime, head->prez, head->prioritet);
		head = head->next;
	}
	printf("\nBrojac je: %d", brojac);
}

void sort(position head) {
	position i, j = NULL;
	int temp = 0;
	i = head;
	j = head->next;

	for (i = head; i != NULL; i = i->next) {
		for (j = i->next; j != NULL; j = j->next) {
			if (i->prioritet > j->prioritet) {
				temp = i->prioritet;
				i->prioritet = j->prioritet;
				j->prioritet = temp;
			}
		}
	}
}