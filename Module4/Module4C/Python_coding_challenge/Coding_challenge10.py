# Create a function that filters out negative numbers.

def filter_out_negative_numbers(num):
    filtered_numbers = []
    for i in num:
        if i >= 0:
            filtered_numbers.append(i)
    return filtered_numbers


numbers_array = [7, -3, 2, -1, 0, -68, 50, -14, 35]
filtered_out_numbers = filter_out_negative_numbers(numbers_array)
print("Filtered numbers:", filtered_out_numbers)
