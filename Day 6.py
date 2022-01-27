""" This is Day 6 Challenge in 30 days of code by HackerRank 
	I am using Python3 to solve this and other upcoming challenges """

""" Task - 
Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Example
s = abcdef
Print abc def """

t = int(input())
for i in range(t):
    string = str(input())
    print(string[::2], string[1::2])
