class Hund:
    # Eigenschaften
    # Klassenvariablen (Werte für alle Objekte gleich)
    # name
    # __alter      # private: 2 Unterstriche
    # _art         # protected: 1 Unterstrich
    tierart = "Hund"

    # Konstruktor
    # Initializer
    def __init__(self, name, alter, art):
        # Instanzvariablen (unterschiedliche Werte für einzelnen Objekte)
        self.name = name
        self.alter = alter
        self.art = art


    # In Python gibt es eigentlich keine Getter und Setter 
    # Man könnte sie aber wie folgt implementieren:
    # def get_name(self):
    #     return self.name
    # def set_name(self, name):
    #     self.name = name

    # Methoden
    def _protected_method(self):
        pass

    def __private_method(self):
        pass

    # def showHund(self):
    #     print("Unser Hund heisst " + self.name + ", ist " + str(self.alter) + " Jahre alt und ein " + self.art)

    def __str__(self):
        return "Unser Hund heisst " + self.name + ", ist " + str(self.alter) + " Jahre alt und ein " + self.art


gretl = Hund("Gretl", 9, "Labrador")
odin = Hund("Odin", 4, "Ritchback")

# print(gretl.name)
# print(gretl.alter)
# print(gretl.art)

# print(odin.name, odin.alter, odin.art)

# odin.name = "Odinette"

# print(odin.name, odin.alter, odin.art)

# gretl.showHund()
# odin.showHund()

print(gretl)
