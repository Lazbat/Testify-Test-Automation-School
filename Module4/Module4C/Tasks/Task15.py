# Declare a list with any value and number of item/element
# Print the list in console
# Sort the list
# Print the list in console again

# Note: you can experiment with the other list functions too in the task.

# Declare a list with any value and number of item/element
tools = ["postman", "newman", "github", "selenium", "trello", "monosnap"]

# Print the list in console
print("List:", tools)

# Sort the list
# Ascending order
tools.sort()
# Print the list in console again
print("Sort Ascending Order:", tools)

# Descending order
tools.sort(reverse=True)
# Print the list in console again
print("Sort Descending Order:", tools)

# experiment with the other list functions too in the task.
# append()
tools.append("jira")
print("Append:", tools)

# insert()
tools.insert(1, "jira")
print("Insert:", tools)

# pop()
tools.pop(0)
print("Pop:", tools)

# remove()
tools.remove("github")
print("Remove:", tools)

# count()
count_jira = tools.count("jira")
print("Count:", count_jira)

# len()
length = len(tools)
print("Length:", length)

# clear()
tools.clear()
print("Clear:", tools)

tools = ["postman", "newman", "github", "selenium", "trello", "monosnap"]
# copy()
tools_copy = tools.copy()
print("Copy:", tools_copy)

# reverse()
before_reverse = tools.copy()
tools.reverse()
print("before_reverse:", before_reverse, "Reverse:", tools)

# extend()
tools.extend(["mobizen", "jenkins"])
print("Extend:", tools)
