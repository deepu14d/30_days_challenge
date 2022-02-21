""" This is Day 14 (Scope) Challenge in 30 days of code by HackerRank  """

""" Task - 
Complete the Difference class by writing the following:

1. A class constructor that takes an array of integers as a parameter and saves it to the __elements instance variable.
2. A computeDifference method that finds the maximum absolute difference between any 2 numbers in __elements and stores it in the maximumDifference instance variable.

"""


class Difference:
    def __init__(self, a):
        self.__elements = a

    # Add your code here
    def computeDifference(self):
        self.maximumDifference = abs(max(self.__elements) - min(self.__elements))


# End of Difference class
_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
