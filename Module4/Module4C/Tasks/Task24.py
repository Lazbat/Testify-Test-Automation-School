# Create an abstract class called Vehicle
# Create an abstract method called drive_direction()
# Create another class Car that inherits from Vehicle
# Create another class Plane that inherits from Vehicle
# Try running the program and fix the abstract method issues
import abc


# Optionally instantiate the Car and Plane method, then invoke the drive_direction() in each of the object instances.

# Hint: the drive_direction() method in your Car should print "Drive forward",
# while drive_direction() in your Plane class should print "Drive Upward"

# Create an abstract class called Vehicle
class Vehicle(metaclass=abc.ABCMeta):

    # Create an abstract method called drive_direction()
    @abc.abstractmethod
    def drive_direction(self):
        pass


# Create another class Car that inherits from Vehicle
class Car(Vehicle):
    def drive_direction(self):  # implement drive_direction for car
        return "Drive forward"


# Create another class Plane that inherits from Vehicle
class Plane(Vehicle):
    def drive_direction(self):  # implement drive_direction for plane
        return "Drive Upward"


# then invoke the drive_direction() in each of the object instances
car = Car()
print("Car:", car.drive_direction())
plane = Plane()
print("Plane:", plane.drive_direction())
