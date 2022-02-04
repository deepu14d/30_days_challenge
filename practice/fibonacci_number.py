# Fibonacci Numbers

# List Way
def fibo(num):
    a = 0
    b = 1
    li = []
    for i in list(range(num)):
        li.append(a)
        i = a + b
        a = b
        b = i
    return(li)


print(fibo(20))


# Generators Way
def fibo2(num):
    a = 0
    b = 1
    for i in list(range(num)):
        i = a + b
        yield a
        a = b 
        b = i


for i in fibo2(20):
    print(i, end=" ") 
