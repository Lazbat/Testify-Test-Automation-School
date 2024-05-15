# Create a class called Human
# Add an attribute leg_count with the value of 4
# Add a method called get_gender() that returns "Unknown" in the Human class
# Create another class called Man that extends Human
# Create another class called Woman that extends Human
# In the class, Man create the method get_gender() which should return "man"
# In the class, Woman create the method get_gender() which should return "woman"
# Instantiate the Man and Woman classes
# Print out the value of get_gender() from the Man and Woman object instances

# Create a class called Human
class Human:
    leg_count = 4  # Add an attribute leg_count with the value of 4

# Add a method called get_gender() that returns "Unknown" in the Human class
    def get_gender(self):
        return "Unknown"


# Create another class called Man that extends Human
class Man(Human):
    def get_gender(self):
        return "man"  # In the class, Man create the method get_gender() which should return "man"


# Create another class called Man that extends Human
class Woman(Human):
    def get_gender(self):
        return "woman"  # In the class, Woman create the method get_gender() which should return "woman"


# Instantiate the Man and Woman classes
man = Man()
man.get_gender()
woman = Woman()
woman.get_gender()

# Print out the value of get_gender() from the Man and Woman object instances
print("Man:", man.get_gender())
print("Woman:", woman.get_gender())
