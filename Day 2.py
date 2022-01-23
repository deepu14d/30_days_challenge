""" This is Day 2 challenge (Operators) in 30 days of code by HackerRank """ 

""" Task - 
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.
Example
mealcost=100
tippercent=15
taxpercent=8
A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value 123 and return from the function. """


#
# Complete the 'solve' function below.
#
# The function accepts following parameters:
#  1. DOUBLE meal_cost
#  2. INTEGER tip_percent
#  3. INTEGER tax_percent
#




import math
import os
import random
import re
import sys
def solve(meal_cost, tip_percent, tax_percent):
    tip = (tip_percent / 100) * meal_cost
    tax = (tax_percent / 100) * meal_cost
    total_cost = tip + tax + meal_cost
    return(round(total_cost)) 


if __name__ == '__main__':
    meal_cost = float(input().strip())

    tip_percent = int(input().strip())

    tax_percent = int(input().strip())

    print(solve(meal_cost, tip_percent, tax_percent))
