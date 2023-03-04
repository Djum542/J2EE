import openpyxl
from tkinter import *

# load the workbook
book = openpyxl.load_workbook('customer.xlsx')
sheet = book.active

# create a list of tuples with the data
data = [(cell.value,) for row in sheet.iter_rows() for cell in row]

# initialize the GUI window and listbox
root = Tk()
my_listbox = Listbox(root)

# insert each item into the listbox
for item in data:
    my_listbox.insert(END, item[0])

# pack the listbox into the GUI window and start the main event loop
my_listbox.pack()
root.mainloop()
