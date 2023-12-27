def char_gen():
    char = [chr(i) for i in range(ord('ก'), ord('ก') + 47)]
    char += [chr(i) for i in range(ord('๐'), ord('๐') + 10)]
    char += [chr(i) for i in range(ord('0'), ord('0') + 10)]
    char = char[:64]
    return char

def char_to_hex(msg):
    hex_data = ''
    for c in msg.encode():
        hex_data += hex(c)[2:]
    return hex_data

def base64_encode(msg):
    char = char_gen()
    msg = char_to_hex(msg)
    msg_num = eval('0x' + msg)
    base64 = ''
    while msg_num > 0:
        base64 = char[msg_num % 64] + base64
        msg_num = msg_num // 64
    
    base64 += '=='
    return base64

msg = input('Message: ')
base64 = base64_encode(msg)
open('enc.txt', 'wb').write(base64.encode('utf-16'))

