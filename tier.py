class Tier:

    # Initializer
    def __init__(self, name, alter, art):
        # Instanzvariablen (unterschiedliche Werte für einzelnen Objekte)
        self.name = name
        self.alter = alter
        self.art = art


    # Methoden
    def _protected_method(self):
        pass

    def __private_method(self):
        pass

    def __str__(self):
        return "Unser Tier heisst " + self.name + ", ist " + str(self.alter) + " Jahre alt und ein " + self.art


class Hund(Tier):
    # Methode aus Klasse Tier üerschreiben
    def __str__(self):
        return "Unser Hund heisst " + self.name + ", ist " + str(self.alter) + " Jahre alt und ein " + self.art


class Katze(Tier):
    # Methode aus Klasse Tier üerschreiben
    def __str__(self):
        return "Unser Katze heisst " + self.name + ", ist " + str(self.alter) + " Jahre alt und ein " + self.art


gretl = Hund("Gretl", 9, "Hund")
tom = Katze("Tom", 11, "Katze")
tier = Tier("Tier", 0, "Tier")

print(gretl.name, gretl.art)
print(tom.name, tom.art)
print(gretl)
print(tom)
print(tier)
