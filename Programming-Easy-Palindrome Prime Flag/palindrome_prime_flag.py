import hashlib

def is_palindrome(value):
    #your code here
    return True

def is_prime(value):
    #your code here
    return True

num = 1
ans = []
while True:
    hex_num = hex(num)[2:]
    if len(hex_num) > 7:
        break
    else:
        if is_palindrome(hex_num) and is_prime(hex_num):
            ans.append(hex_num)
        num = num + 1
flag = hashlib.md5(ans[-1].encode()).hexdigest()
print('WCTF23{' + flag + '}')
            
