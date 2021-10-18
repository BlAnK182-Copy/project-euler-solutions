#Problem 4 - Largest Palindrome Product

def palindromeCheck(number):
    if str(number)[::-1].lower() == str(number).lower():
        return True
    return False 


largestPalindrome = 0
for i in range(100, 999):
    for j in range(100, 999):
        if palindromeCheck(i*j) == True:
            if largestPalindrome<i*j:
                largestPalindrome = i*j

print(f"Largest palindrome product made by 2 three-digit numbers is: {largestPalindrome}")