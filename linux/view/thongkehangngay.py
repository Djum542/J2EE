
from tkinter import *
from tkinter import ttk, Button

import pandas as pd
from jupyter_core.migrate import regex
from pip._internal.operations import check
from tkcalendar import Calendar

win = Tk()
win.geometry('500x500')
win.title("Báo cáo thống kê hàng hóa")
def ketqua():
    hang = sanp.get()
    tu = bd.get()
    den = bd1.get()
    data1 = pd.ExcelFile('customer.xlsx')
    df1 = pd.read_excel(data1)
    timkiem = df1(df1['Hãng điện thoại'] == hang)
    hang = timkiem.iloc[0,0]
    hangl = 'hang'+hang
    data2 = {'Hãng':[hangl],'Tong so may ban duoc':[]}
    df2 = pd.DataFrame(data2)
    lis.insert(END, df2)
    df2.to_excel('thongke.xlsx')
def xoa():
    sanp.delete(0.0,END)
    bd.delete(0.0,END)
    bd1.delete(0.0,END)
lab = Label(win, text=" Báo cáo thống kê san phẩm")
lab.pack()
sanp = ttk.Combobox(win, values=['oppo', 'samsunng', 'nokia', 'readmi', 'xiaomi', 'sony', 'apple'], width=5)
# lich = ttk.Combobox(win,width=20, values=[Calendar(win,selectmode='day', year=2023, month=3)])
# cal = Calendar(win, selectmode='day', year=2023, month=3)
# cala = Calendar(win, selectmode='day', year=2023, month=3)
# cal.place(x=140, y=20)
# cala.place(x=400, y=20)
sanp.place(x=5, y=20)
lab1 = Label(win, text="Ngày bắt đầu")
bd = ttk.Combobox(win, width=15)
lab1.place(x=70, y=20)
bd.place(x=160, y=20)
lab2 = Label(win, text="ngày kết thúc")
bd1 = ttk.Combobox(win, width=15)
lab2.place(x=300, y=20)
bd1.place(x=380, y=20)
but = Button(win, text="Kết quả", command=ketqua)
but1 = Button(win, text="Xóa", command=xoa)
but.place(x= 160, y=50)
but1.place(x=250, y=50)
lis = Listbox(win, width=80, height=20)
lis.place(x=5, y=80)
win.mainloop()