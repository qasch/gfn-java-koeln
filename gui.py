# import tkinter
from tkinter import ttk
import tkinter as tk

def btn_close_destroy():
    frame.destroy()

# Frame erstellen
frame = tk.Tk()
frame.title("Hauptframe")
frame.geometry("800x400")

# Button erzeugen
# ACHTUNG: die Methode, die ausgeführt werden soll, darf nicht mit Parameterklammern() aufgerufen werden
# Sonst wird die Rückgabe der Methode in der Variablen command gespeichert, die Methode aber nicht ausgeführt
btn_close = tk.Button(frame, text = "Close", command = btn_close_destroy)
btn_close.place(x=200, y=100)

# Endlosschleife, damit unser Frame weiter angezeigt wird
frame.mainloop()




