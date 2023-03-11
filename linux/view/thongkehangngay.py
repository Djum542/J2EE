
from tkinter import *
from tkinter import ttk

import pandas as pd
from pip._internal.operations import check
from tkcalendar import Calendar

win = Tk()
win.geometry('500x500')
win.title("Báo cáo thống kê hàng hóa")


lab = Label(win, text=" Báo cáo thống kê san phẩm")
lab.pack()
sanp = ttk.Combobox(win, values=['oppo', 'samsunng', 'nokia', 'readmi', 'xiaomi', 'sony', 'apple'], width=15)
# lich = ttk.Combobox(win,width=20, values=[Calendar(win,selectmode='day', year=2023, month=3)])
cal = Calendar(win, selectmode='day', year=2023, month=3)
cala = Calendar(win, selectmode='day', year=2023, month=3)
cal.place(x=140, y=20)
cala.place(x=400, y=20)
sanp.place(x=5, y=20)



win.mainloop()