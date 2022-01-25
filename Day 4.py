""" This is Day 4 challenge (Class vs. Instance) in 30 days of code by HackerRank """ 

""" Task - 
Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print 'Age is not valid, setting age to 0.'. 
In addition, you must write the following instance methods:

1. yearPasses() should increase the  instance variable by .
2. amIOld() should perform the following conditional actions:
    If , print You are young..
    If  and , print You are a teenager..
    Otherwise, print You are old..
"""


class Person:
    def __init__(self, initialAge):
        if initialAge >= 0:
            self.initialAge = initialAge
        else:
            print("Age is not valid, setting age to 0.")
            self.age = 0

    def amIOld(self):
        if age < 13:
            print("You are young.")
        elif 13 <= age < 18:
            print("You are a teenager.")
        else:
            print("You are old.")

    def yearPasses(self):
        global age
        age = age + 1


t = int(input())
for i in range(0, t):
    age = int(input())         
    p = Person(age)  
    p.amIOld()
    for j in range(0, 3):
        p.yearPasses()       
    p.amIOld()
    print("")
