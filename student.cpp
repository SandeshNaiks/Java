#include <iostream>
#include <string>

class Student {
  public:
    int regNum;
    std::string name;
    float fees;

    void readData() {
        std::cout << "Enter the student's registration number: ";
        std::cin >> regNum;
        std::cout << "Enter the student's name: ";
        std::cin >> name;
        std::cout << "Enter the student's fees: ";
        std::cin >> fees;
    }

    void displayData() {
        std::cout << "Registration number: " << regNum << std::endl;
        std::cout << "Name: " << name << std::endl;
        std::cout << "Fees: " << fees << std::endl;
    }
};

int main() {
    Student *s = new Student(); // create a pointer to an object of the Student class

    s->readData(); // call the readData() function using the pointer to the object

    std::cout << "Student details: " << std::endl;
    s->displayData(); // call the displayData() function using the pointer to the object

    return 0;
}