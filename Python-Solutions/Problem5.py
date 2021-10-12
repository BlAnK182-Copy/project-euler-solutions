#Problem 5

#Slow solution

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