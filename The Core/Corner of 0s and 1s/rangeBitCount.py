def rangeBitCount(a, b):
    bits = [0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2]
    return sum(bits[a:b+1])
