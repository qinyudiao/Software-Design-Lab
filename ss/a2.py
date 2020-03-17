class Person:
    """Instantiates a Person object with given name."""
    def __init__(self, first_name, last_name): # like Java constructor
        self.firstname = first_name
        self.lastname = last_name
    def __str__(self):
        return self.firstname + " " + self.lastname
    def getFirstname(self):
        return self.firstname
    def getLastname(self):
        return self.lastname
    def setFirstname(self, newFirst):
        self.firstname = newFirst
    def setLastname(self, newLast):
        self.lastname = newLast
person1 = Person("Elvis", "Presley")
print(person1) # calls the __str__ method on person1


class SuperHero(Person):
    def __init__(self, firstname, lastname, nick):
        super(SuperHero, self).__init__(firstname, lastname)
        self.nick = nick
    def nick_name(self):
        return "I am {}".format(self.nick)
        
p = SuperHero("Clark", "Kent","Superman")
print(p.nick_name()) # I am Superman
print(p) # Clark Kent
