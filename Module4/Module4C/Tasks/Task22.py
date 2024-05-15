# Create a class called Hunt
# Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
# Create a method get_weapon() that returns "Not Available" in the Hunt class
# Instantiate an object of the Hunt class
# Print the value of get_weapon() from the object instance

# Create a class called Hunt
class Hunt:
    __weapon = "Assault Rifle"  # Create a private attribute called __weapon with the value "Assault Rifle"

# Create a method get_weapon() that returns "Not Available" in the Hunt class
    def get_weapon(self):
        return "Not Available"


# Instantiate an object of the Hunt class
hunt = Hunt()
hunt.get_weapon()

# Print the value of get_weapon() from the object instance
print("Get weapon:", hunt.get_weapon())
