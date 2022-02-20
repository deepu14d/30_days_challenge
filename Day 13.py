""" This is Day 13 (Abstract Classes) Challenge in 30 days of code by HackerRank  """

""" Task - 
Given a Book class and a Solution class, write a MyBook class that does the following:

1. Inherits from Book
2. Has a parameterized constructor taking these 3 parameters:
    string title 
    string author
    int price
3. Implements the Book class' abstract display() method so it prints these 3 lines:
    Title:, a space, and then the current instance's title.
    Author:, a space, and then the current instance's author.
    Price:, a space, and then the current instance's price.

"""




from abc import ABCMeta, abstractmethod
class Book(object, metaclass=ABCMeta):
    def __init__(self, title, author):
        self.title = title
        self.author = author   

    @abstractmethod
    def display(): pass
# Write MyBook class


class MyBook(Book):
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price 

    def display(self):
        print("Title: " + self.title)
        print("Author: " + self.author)
        print("Price: " + str(self.price))


title = input()
author = input()
price = int(input())
new_novel = MyBook(title, author, price)
new_novel.display()
