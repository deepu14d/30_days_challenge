""" This is Day 11 (2D Arrays) Challenge in 30 days of code by HackerRank  """

""" Task - 
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

6 x 6 2D Array A :-

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

 """


import math
import os
import random
import re
import sys
if __name__ == '__main__':

    arr = []
    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    res = []
    for x in range(0, 4):
        for y in range(0, 4):
            s = sum(arr[x][y:y + 3]) + arr[x + 1][y + 1] + sum(arr[x + 2][y:y + 3])
            res.append(s)

    print(max(res))
