#Problem 3 - Largest Prime Factor

#Old Method - Very Slow

'''
def isPrime(number):
    for i in range(2, number//2+1):
        if number%i==0:
            return False
    return True 


NUMBER = 3453450

largest = 0
for i in range(2, NUMBER):
    if NUMBER%i==0:
        if isPrime(i) == True:
            if largest <i:
                largest = i
                print(f"Current largest: {i}")

'''

#New method - fast

#Theory: for a number n = p1 * p2 * p3...* p(n-1) where pi (from 1 to n-1) is prime (but not necessarily unique) for pi > 1
#if we continuously divide n with it's smallest factor, then the number that we divided it by after which n becomes 1, is the largest prime factor


def smallestPrimeFactor(number):
    assert number>1
    for i in range(2, int(number*0.5) + 1):
        if number%i == 0:
            return i
    return number #the number itself is the smallest prime factor of the number

NUMBER = 600851475143
largestPrimeFactor = 1

while NUMBER!=1:
    factor = smallestPrimeFactor(NUMBER)
    NUMBER //= factor 
    largestPrimeFactor = factor 

print(f"Largest Prime factor of {NUMBER} is: {largestPrimeFactor}")