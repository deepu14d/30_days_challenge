
# OOPs practice

class Cat:
    species = 'mammal'

    def __init__(self, name, age):
        self.name = name
        self.age = age


# 1 Instantiate the Cat object with 3 cats
cat1 = Cat('sa', 8)
cat2 = Cat('si', 1)
cat3 = Cat('su', 18)

# 2 Create a function that finds the oldest cat


def oldest():
    if cat1.age > (cat2.age and cat3.age):
        return(f'{cat1.name} with {cat1.age} age is oldest')
    elif cat2.age > (cat3.age and cat1.age):
        return(f'{cat2.name} with {cat2.age} age is oldest')
    elif cat3.age > (cat1.age and cat2.age):
        return(f'{cat3.name} with {cat3.age} age is oldest')


print(oldest())
