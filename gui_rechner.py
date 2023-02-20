# import tkinter
from tkinter import ttk
import tkinter as tk

def btn_close_destroy():
    frame.destroy()

def btn_calc_calc():
    zahl_1 = int(entry_1.get())
    zahl_2 = int(entry_2.get())
    summe = zahl_1 + zahl_2

    result.insert(0, summe)

# Frame erstellen
frame = tk.Tk()
frame.title("Rechner")
frame.geometry("800x400")

# Eingabefelder
entry_1 = tk.Entry(frame)
entry_1.place(x=200, y = 20)
entry_2 = tk.Entry(frame)
entry_2.place(x=200, y = 50)
result = tk.Entry(frame)
result.place(x=200, y = 80)

# Button erzeugen
# ACHTUNG: die Methode, die ausgeführt werden soll, darf nicht mit Parameterklammern() aufgerufen werden
# Sonst wird die Rückgabe der Methode in der Variablen command gespeichert, die Methode aber nicht ausgeführt
btn_close = tk.Button(frame, text = "Close", command = btn_close_destroy)
btn_close.place(x=200, y=120)

btn_calc = tk.Button(frame, text = "Berechne", command = btn_calc_calc)
btn_calc.place(x=280, y=120)

# Endlosschleife, damit unser Frame weiter angezeigt wird
frame.mainloop()




