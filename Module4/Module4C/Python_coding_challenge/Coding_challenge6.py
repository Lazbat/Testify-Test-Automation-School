# Sort an array of strings in alphabetical order

def sort_array_of_strings(arr):
    arr.sort()
    return arr


animals = ["lion", "chimp", "ant", "hyena", "deer", "goose", "platypus", "eagle"]
sorted_array = sort_array_of_strings(animals)
print("Sorted array:", sorted_array)
