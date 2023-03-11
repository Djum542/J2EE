# import openpyxl
# from tkinter import *
#
# # load the workbook
# book = openpyxl.load_workbook('customer.xlsx')
# sheet = book.active
#
# # create a list of tuples with the data
# data = [(cell.value,) for row in sheet.iter_rows() for cell in row]
#
# # initialize the GUI window and listbox
# root = Tk()
# my_listbox = Listbox(root)
#
# # insert each item into the listbox
# for item in data:
#     my_listbox.insert(END, item[0])
#
# # pack the listbox into the GUI window and start the main event loop
# my_listbox.pack()
# root.mainloop()
import tkinter as tk
from tkinter import ttk
from tkcalendar import Calendar

root = tk.Tk()
root.geometry('300x300')

# Tạo đối tượng ttk.Combobox
combo = ttk.Combobox(root, values=['Lịch'])

# Tạo đối tượng ttkcalendar.Calendar
cal = Calendar(root, selectmode='day', year=2023, month=3)


def show_calendar():
    # Hiển thị lịch
    top = tk.Toplevel(root)
    cal = Calendar(top, selectmode='day', year=2023, month=3)
    cal.pack()

    # Chọn ngày
    def set_date():
        combo.set(cal.get_date())
        top.destroy()

    # Tạo nút chọn ngày
    ok_button = tk.Button(top, text='OK', command=set_date)
    ok_button.pack()


# Tạo nút hiển thị lịch
show_button = tk.Button(root, text='Hiển thị lịch', command=show_calendar)
show_button.pack()

# Thêm ComboBox vào giao diện
combo.pack()

root.mainloop()
