""" This is Day 5 challenge (Loops) in 30 days of code by HackerRank """ 

""" Task - 
Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.
"""


import math
import os
import random
import re
import sys
if __name__ == '__main__':
    n = int(input().strip())
    for i in range(1, 11):
        print(f'{n} x {i} = {n*i}')

    # i = 1
    # while i < 11:
    #     print(f'{n} x {i} = {n*i}')
    #     i += 1 
