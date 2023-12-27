import random
money = 0
print('Welcome To WCTF23 Lotto')
print('You Will Have 1000 Times To Win The Flag')
for i in range(1, 1001):
    print('----------------------------------------')
    print('Try Your Lucky [Times:' + str(i) + ']')
    digit1 = random.randint(61, 70) % 3 + 1
    digit2 = random.randint(61, 70) % 9 + 1
    lotto = str(digit1) + str(digit2)
    guess = input('Your 2 Digit Lotto: ')
    print('System 2 Digit Lotto:', lotto)
    if guess == lotto:
        print('You Won Lotto')
        money += 1000
    else:
        print('You Loss Lotto')
    print('Your Money:', money)
    if money >= 85000:
        print('WCTF23{md5}')
        break
        
        
