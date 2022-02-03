"""                                                  Decorators Exercise                                                              """

# First Practice Program
# A decorator that you can call before any function to see how much time the function will take to run the function or better to say you can know the performance of the function.

from time import time
print("\t First Practice Program")


def func_performance(func):
    def wrapper(*arg, **kwargs):
        time1 = time()
        result = func(*arg, **kwargs)
        time2 = time()
        time_taken = time2 - time1
        # return('it took {time} ns.'.format(time = time2 - time1))
        return(f'it took {time_taken} s.')
    return wrapper


@func_performance
def loop():
    for i in range(10000):
        print(i)


print(loop())
print(' \n')


# ************************************************************************************************************************************

# Second Practice Program
# Authenticate decorator that allow function to run only when valid is set as 'True'

user1 = {'name': "Sorma", 
         'valid': 0}
print('\t Second Practice Program ')


def aunthenticate(func):
    def wrapper(user):
        if user['valid']:
            print('its True')
        else:
            print('not here')
    return(wrapper)


@aunthenticate
def check(user1):
    return('done')


print(check(user1))
