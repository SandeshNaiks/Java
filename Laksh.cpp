#include<iostream.h>
#include<iomanip.h>
#include<string.h>
class student
{
	privte:
		int regno;
		char name[20];
		float fees;
	public:
		void get();
		void display();
};
void student::get()
{
	count<<"Enter student name: ";
	cin.getline(name, 20);
	count<<"Enter student register number: ";
	cin>>regno;
	count<<"Enter student fees: ";
	cin>>fees;
}
void student::display()
{
	count<<student register number: "<<regno<<endl;
	count<<studen name: "<<name<<endl;
	count<<studen fees: "<<fees;
}
int main()
{
	student s, *sp;
	clsr();
	sp=&s;
	sp.>get();
	sp.>getdisplay();
	getch();
	return 0;
}