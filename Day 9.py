""" This is Day 9 (Recursion) Challenge in 30 days of code by HackerRank  """

""" Task - 
Complete the factorial function in the editor below. Be sure to use recursion.
factorial has the following paramter:
  int n: an integer
Returns
  int: the factorial of n

 """

#!/bin/python3


#
# Complete the 'factorial' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER n as parameter.
#




import math
import os
import random
import re
import sys
def factorial(n):
    # Write your code here
    if n == 1:
        return 1
    else:
        return (n * factorial(n - 1))


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    result = factorial(n)

    fptr.write(str(result) + '\n')

    fptr.close()
