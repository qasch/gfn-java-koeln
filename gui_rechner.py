# import tkinter
import tkinter as tk
from tkinter import ttk
from tkinter import messagebox


def btn_close_destroy():
    root_frame.destroy()

def clear_all_fields():
    entry_1.delete(0, 'end')
    entry_2.delete(0, 'end')
    result.delete(0, 'end')


def calculation(operation):
    try:
        zahl_1 = int(entry_1.get())
        zahl_2 = int(entry_2.get())

        if operation == "add":
            summe = zahl_1 + zahl_2
        elif operation == "sub":
            summe = zahl_1 - zahl_2
        elif operation == "div":
            summe = zahl_1 / zahl_2
        elif operation == "mult":
            summe = zahl_1 * zahl_2

        result.delete(0, 'end')
        result.insert(0, summe)
    except Exception as e:
        tk.messagebox.showerror("Folgender Fehler ist aufgetreten: ", e)


# root_frame erstellen
root_frame = tk.Tk()
root_frame.title("Rechner")
root_frame.geometry("800x400")

# Eingabefelder
entry_1 = tk.Entry(root_frame)
entry_1.place(x=200, y = 20)
entry_2 = tk.Entry(root_frame)
entry_2.place(x=200, y = 50)
result = tk.Entry(root_frame)
result.place(x=200, y = 80)

# Button erzeugen
# ACHTUNG: die Methode, die ausgeführt werden soll, darf nicht mit Parameterklammern() aufgerufen werden
# Sonst wird die Rückgabe der Methode in der Variablen command gespeichert, die Methode aber nicht ausgeführt
# Alternativ kann man eine Lambda Funktion nutzen
btn_close = tk.Button(root_frame, text = "Close", command = btn_close_destroy)
btn_close.place(x=200, y=120)

btn_calc = tk.Button(root_frame, text = "+", command = lambda: calculation("add"))
btn_calc.pack()

btn_sub = tk.Button(root_frame, text = "-", command = lambda: calculation("sub"))
btn_sub.pack()

btn_div = tk.Button(root_frame, text = "/", command = lambda: calculation("div"))
btn_div.pack()

btn_mutl = tk.Button(root_frame, text = "*", command = lambda: calculation("mult"))
btn_mutl.pack()

btn_clear = tk.Button(root_frame, text = "clear", command = clear_all_fields)
btn_clear.pack()

# Endlosschleife, damit unser root_frame weiter angezeigt wird
root_frame.mainloop()




