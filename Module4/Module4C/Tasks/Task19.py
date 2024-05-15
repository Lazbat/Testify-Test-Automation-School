# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add another attribute can_walk with the value of True
# Create a method called get_description, the method should print "This is human"
# Create another method that return the leg count, the name of the method is your choice

# Optionally you can instantiate the class and invoke the method get_description()
# and invoke your method that returns leg count.


# Create a class called Human
class Human:
    leg_count = 4  # Add an attribute leg_count with the value of 4
    can_walk = True  # Add another attribute can_walk with value of True

    def __init__(self):
        self.name = "unknown"

# Create a method called get_description, the method should print "This is human"
    def get_description(self):
        print("This is human")

# Create another method that return the leg count, the name of the method is your choice
    def get_leg_count(self):
        return self.leg_count


# Optional instantiation and method invocation
human = Human()
print("Human:", human.name, human.can_walk)
human.get_description()
print("Leg count:", human.get_leg_count())
