#Problem 1 - Multiples of 3 or 5

NUMBER = 1000

def multipleOfThreeOrFive(number):
    if number%3==0 or number%5==0:
        return True
    return False


sum = 0
for i in range(1,NUMBER):
    if multipleOfThreeOrFive(i) == True:
        sum+=i

print(f"The sum is: {sum}")
