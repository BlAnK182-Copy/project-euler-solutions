#Problem 5 - Smallest Multiple

#Old Method - Very Slow

'''
number = 0
while True:
    number+=1
    checker = 0
    for i in range(1,21):
        if number%i==0:
            checker+=1
        else:
            break 
    if checker==20:
        break 

print(f"Number is: {number}")
'''

#New Method - Fast 

#Theory: Smallest number that is evenly divisible by a set of numbers is called the LCM (Least common multiple)
#it is calculated like so: LCM of two numbers x and y = x*y/HCF(x,y). Where HCF is the highest common factor of the two number
# LCM(num1, num2....num(n)) = LC((num1, num2),...num(n))

import math as m

def lcm(num1, num2):
    print(f"the gcd of {num1} and {num2} is: {m.gcd(num1, num2)}")
    return (num1 * num2) // (m.gcd(num1, num2))

smallestMultiple = 1
for i in range(2, 21):
    smallestMultiple = lcm(i, smallestMultiple)
    print(f"Current Smallest multiple (when i = {i}) is: {smallestMultiple}")
    print()

print(f"The smallest multiple which is evenly divisible by all numbers from 1 to 20 is: {smallestMultiple}")