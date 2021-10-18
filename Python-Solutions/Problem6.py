# Sum Square Difference 

def sumOfSquares(n):
    sumOfSquaresVar=0
    for i in range(1,n+1):
        sumOfSquaresVar+=i**2
    return sumOfSquaresVar

def squareOfSums(n):
    squareOfSumsVar = 0
    for i in range(1,n+1):
        squareOfSumsVar+=i
    
    return squareOfSumsVar**2

print(squareOfSums(100) - sumOfSquares(100))