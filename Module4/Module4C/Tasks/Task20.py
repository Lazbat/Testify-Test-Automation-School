# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human

# Optionally you can instantiate the classes Man and Woman
# then print out the values of the get_gender() method in each object instance

# Create a class called Human
class Human:
    leg_count = 4  # Add an attribute leg_count with the value of 4

# Add a method called get_gender() that returns "Unknown" in the Human class
    def get_gender(self):
        return "Unknown"


# Create another class called Man that extends Human
class Man(Human):
    pass


# Optionally you can instantiate the classes Man and Woman
class Woman(Human):
    pass


man = Man()
man.get_gender()
woman = Woman()
woman.get_gender()

# then print out the values of the get_gender() method in each object instance
print("Man:", man.get_gender())  # returns Unknown
print("Woman:", woman.get_gender())  # returns Unknown
