""" This is Day 10 (Binary Number) Challenge in 30 days of code by HackerRank  """

""" Task - 
Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

 """


import math
import os
import random
import re
import sys
if __name__ == '__main__':
    num = int(input().strip())

    string = str(bin(num))
    string2 = (max(string[2::].split('0')).count('1'))
    print(string2)
