#Problem 2

FIXED_VALUE = 4000000

def isEven(number):
    if number%2==0:
        return True
    return False

fib = []
fib.append(0)
fib.append(1)

curValue = 0
incrementor = len(fib)

while curValue<FIXED_VALUE:
    curValue = fib[incrementor-1] + fib[incrementor-2] # Every term in a fibonacci series is the sum of the previous two
    fib.append(curValue)
    incrementor+=1

# print(fib) # for debug


fibSum = 0
for term in fib:
    if isEven(term):
        fibSum+=term

print(f"this sum is: {fibSum}")
