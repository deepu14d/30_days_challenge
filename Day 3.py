""" This is Day 3 challenge (Conditional Statements) in 30 days of code by HackerRank """ 

""" Task - 
Given an integer, n, perform the following conditional actions:

1. If n is odd, print Weird
2. If n is even and in the inclusive range of 2 to 5, print Not Weird
3. If n is even and in the inclusive range of 6 to 20, print Weird
4. If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird. """

#!/bin/python3




import math
import os
import random
import re
import sys
def check_fun(N):
    if ((N % 2 != 0) or ((N % 2 == 0) and (6 <= N <= 20))):
        return("Weird")
    elif ((N % 2 == 0) and ((2 <= N <= 5) or (20 <= N))):
        return("Not Weird")


if __name__ == '__main__':
    N = int(input().strip())
    print(check_fun(N))
