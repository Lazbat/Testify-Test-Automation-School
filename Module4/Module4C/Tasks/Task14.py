# Declare a string variable with any value
# Print out the string in the upper case form

# Note: you can experiment with the other functions call too in the task.


# Declare a string variable with any value
name = "   Selenium is a Test Automation tool   "

# Print out the string in the upper case form
upper_case = name.upper()
print("Uppercase:", upper_case)

# experiment with the other functions call too in the task.
# len()
length = len(name)
print("Length:", length)

# lower()
lower_case = name.lower()
print("Lowercase:", lower_case)

# capitalize()
capitalize = name.capitalize()
print("Capitalized:", capitalize)

# count()
count = name.count("Test")
print("Count:", count)

e_count = name.count("e")
print("Count:", e_count)

# find()
a_position = name.find("a")
print("a position:", a_position)

# if the value is not in the string, it returns -1
testing_position = name.find("testing")
print("testing position:", testing_position)

# index()
a_index = name.find("a")
print("a index:", a_index)

tool_index = name.index("tool")
print("tool index:", tool_index)

# if the value is not in the string, it throws an exception
# testing_index = name.index("testing")
# print("testing index:", testing_index)

# strip()
strip_value = name.strip()
print("Stripped name:", strip_value)

# rstrip()
rstrip_value = name.rstrip()
print("rstripped name:", rstrip_value)

# lstrip()
lstrip_value = name.lstrip()
print("lstripped name:", lstrip_value)

# split()
split = name.split("is")
print("Split value:", split)

split_space = name.split(" ")
print("Split space value:", split_space)

# format()
# name format
unformatted = "My name is {name}, I am a {gender}."
formatted_name = unformatted.format(name="Lazbat", gender="female")
print("Name Format:", formatted_name)

# index format
unformatted = "My name is {0}, I am a {1}."
formatted_index = unformatted.format("Lazbat", "female")
print("Index Format:", formatted_index)

unformatted = "My name is {1}, I am a {0}."
formatted_index = unformatted.format("Lazbat", "female")
print("Index Format:", formatted_index)
