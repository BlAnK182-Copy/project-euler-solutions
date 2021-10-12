#Slow Method 

def isPrime(number):
    for i in range(2, number//2+1):
        if number%i==0:
            return False
    return True 


NUMBER = 600851475143


largest = 0
for i in range(2, NUMBER):
    if NUMBER%i==0:
        if isPrime(i) == True:
            if largest <i:
                largest = i
                print(f"Current largest: {i}")
