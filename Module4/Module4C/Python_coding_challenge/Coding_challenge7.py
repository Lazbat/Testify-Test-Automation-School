# Sort an array of numbers in descending order.

def sort_array_of_numbers(arr):
    arr.sort(reverse=True)
    return arr


numbers = [5, 3, 0, -10, 70, 89, 16, 30, 8, -2]
sorted_array = sort_array_of_numbers(numbers)
print("Sorted array in descending order:", sorted_array)
