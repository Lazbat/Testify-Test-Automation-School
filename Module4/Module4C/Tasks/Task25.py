# Create a class called Utilities
# Create a static method called print_name which accepts a parameter, and prints out the parameter.
# Invoke the static method print_name()
# You can use any of the two methods to create your static methods.

# Create a class called Utilities
class Utilities:
    # using the built-in static method() function
    def print_name(length, breadth):
        return length * breadth


# Invoke the static method print_name()
Utilities.print_name = staticmethod(Utilities.print_name)

print("5 * 6 =", Utilities.print_name(5, 6))


# using @staticmethod annotation
# @staticmethod
# def print_name(length, breadth):
#    return length * breadth

# print("5 * 6 =", Utilities.print_name(5, 6))
