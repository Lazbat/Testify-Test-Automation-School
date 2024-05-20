# Create a function that reverses an array.

def reverse_array(arr):
    arr.reverse()
    return arr


num = [0, 1, 2, 3, 4, 5]
animals = ['ant', 'bat', 'cow', 'dove', 'elephant']

num.reverse()
animals.reverse()

print("Reversed num array:", num)
print("Reversed animals array:", animals)
