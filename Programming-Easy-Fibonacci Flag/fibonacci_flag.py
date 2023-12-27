import hashlib

def fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

num = int(input('Enter Num: '))
fibo = fibonacci(num)
if '699387094480315688924629988621889821512140593355179' in str(fibo):
    flag = hashlib.md5(str(fibo).encode()).hexdigest()
    print('WCTF23{' + flag + '}')
else:
    print('WCTF23{f4k3_f!@g}')
