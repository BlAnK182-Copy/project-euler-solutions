#Problem 7 - 10001st Prime 

def isPrime(number):
    for i in range(2, number//2 + 1):
        if number%i==0:
            return False

    return True


incrementor = 1
count = 0

while count<10001:
    incrementor+=1
    if isPrime(incrementor) == True:
        count+=1

print(f"The {count}th prime is: {incrementor}")