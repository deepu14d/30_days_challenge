""" This is Day 7 (Arrays) Challenge in 30 days of code by HackerRank  """

""" Task - 
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Example
A = [1, 2, 3, 4]

Print 4 3 2 1. Each integer is separated by one space. """


#!/bin/python3


import math
import os
import random
import re
import sys
if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    print(*arr[::-1], sep=' ')
