# Create a class called Human
# Initialize the class

class Human:

    name = "Lazbat"
    gender = "female"
    age = "20"

    def get_name_gender_age(self):
        return self.name + ": " + self.gender + self.age


person = Human()
print(person.name)
print(person.gender)
print(person.age)
