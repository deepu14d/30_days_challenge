""" This is Day 12 (Inheritance) Challenge in 30 days of code by HackerRank  """

""" Task - 
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

* A Student class constructor, which has 4 parameters:
  1. A string, firstName.
  2. A string, lastName.
  3. An integer, idNumber.
  4. An integer array (or vector) of test scores, scores.
* A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
    Grading Scale
Letter           Average (a)
  O         90<= a <= 100
  E         80<= a <= 90
  A         70<= a <= 80
  P         55<= a <= 70
  D         40<= a <= 55
  T              a < 40
  
 """


class Person:
    def __init__(self, firstName, lastName, idNumber):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber

    def printPerson(self):
        print("Name:", self.lastName + ",", self.firstName)
        print("ID:", self.idNumber)


class Student(Person):
    #   Class Constructor
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    def __init__(self, firstName, lastName, idNumber, scores):
        Person.__init__(self, firstName, lastName, idNumber)
        self.scores = scores 

        # we can use super() also like--
        # super().__init__(firstName, lastName, idNumber)
        # self.scores = scores

    # Write your constructor here
    # Function Name: calculate
    # Return: A character denoting the grade.
    # Write your function here

    def calculate(self):

        total = 0

        for scores in self.scores:
            total += scores
        average = total / len(self.scores)

        if 90 <= average <= 100:
            return('O')
        elif 80 <= average <= 90:
            return('E')
        elif 70 <= average <= 80:
            return('A')
        elif 55 <= average <= 70:
            return('P')
        elif 40 <= average <= 55:
            return('D')
        return('T')


line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input())  # not needed for Python
scores = list(map(int, input().split()))
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())
