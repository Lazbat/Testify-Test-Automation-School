# Declare a dictionary with any key-value pair of items/elements
# Print the dictionary in console
# Update the dictionary with two different key-value pair items
# Print the dictionary in console again

# Note: you can experiment with the other list functions too in the task

# Declare a dictionary with any key-value pair of items/elements
continents = {
    "Africa": "Nigeria",
    "Asia": "China",
    "Europe": "Germany",
    "North America": "USA",
    "South America": "Brazil"
}

# Print the dictionary in console
print("Dictionary:", continents)

# Update the dictionary with two different key-value pair items
continents.update({"Australia": "Australia", "Antarctica": "Antarctica"})
# Print the dictionary in console again
print("Update:", continents)

# experiment with the other list functions too in the task
# get()
africa = continents.pop("Africa")
print("Get:", africa)

# items()
continents_items = continents.items()
print("Items:", continents_items)

# keys()
continents_keys = continents.keys()
print("Keys:", continents_keys)

# values()
continents_values = continents.values()
print("Values:", continents_values)

# pop()
continents.pop("Antarctica")
print("Pop:", continents)

# popitem()
continents.popitem()
print("Popitem:", continents)

# copy()
copied_continents = continents.copy()
print("Copied Continents:", copied_continents)

# clear()
continents.clear()
print("Clear:", continents)
print(copied_continents)
