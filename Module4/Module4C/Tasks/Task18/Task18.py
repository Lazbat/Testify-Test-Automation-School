# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with value of True

# Optionally you can instantiate the class and prints out the leg_count and can_walk attributes

# Create a class called Human
class Human:
    leg_count = 4
    can_walk = True

    def __init__(self, name):
        self.leg_count = 4  # Add an attribute leg_count with the value of 4
        self.can_walk = True  # Add another attribute can_walk with value of True
        self.name = name


person = Human("Person")
print(person.name)

print(person.leg_count)
print(person.can_walk)
