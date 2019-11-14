#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.
def isBalanced(s):
    dic={"{":"}","(":")","[":"]"}
    stak=[]
    top=-1
    for i in range(0,len(s)):
        if not stak and dic.get(s[i]):
            stak.append(s[i])
            top=stak[-1]
        elif s[i] == dic.get(top):
            #print('here1 '+str(s[i])+' '+str(top))
            stak.pop()
            if stak:
                top=stak[-1]
            else:
                top=-1
        elif dic.get(s[i]):
            stak.append(s[i])
            top=stak[-1]
        else:
            stak.append(s[i])
            top=stak[-1]
            break
       
    if not stak:
        return "YES"
    else:
        return "NO"


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)

        fptr.write(result + '\n')

    fptr.close()
