import calendar
from tkinter import *
from tkinter import ttk
import ipysheet
import pandas as pd

win = Tk()
win.geometry("500x300")
sheet = ipysheet.sheet()
# Them Widget
date = ipysheet.date(days=['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'])
ipysheet.cell(0,0,date)

def thoat():
    win.destroy()
def hoadon():
    data = {"Ma HD":["hd01", "hd02", "hd03"], "Ngay Lap HD":["12/06/2022", "13/07/2002", "24/07/2022"], "Nhan vien":["Account", "Admin", "Manager"], "Khach hang":["Nguyen Xuan Hoa", "Tran Van Hoa", "Hoa Xuan Tieu"]}
    df = pd.DataFrame(data)
    fd = df.transpose()
    for item in fd:
        sho.config(text=fd)
    fd.to_excel('bill.xlsx')
la1 = Label(win, text="Thong tin hoa don")
la2 = Label(win, text="Danh sach hoa don")
fra = Frame(win, height=20, width=50, background="green")
sho = Label(fra, height=15, width=60)
lab1 = Label(win, text="Ma HD")
ent1 = Entry(win, width=15)
lab2 = Label(win, text="Ngay lap HD")
ent2 = ttk.Combobox(win,width=15)
ent2['value'] = calendar.month(2022,10)
print(calendar)

lab3 = Label(win, text="Nhan vien")
ent3 = ttk.Combobox(win, width=10)
ent3["value"] = ["Admin", "Manager","Account"]
lab4 = Label(win, text="Khach hang")
ent4 = ttk.Combobox(win, width=10)
ent4["value"] = ["Nguyen Chi Huan", "Tran Cao Trung", "Cao Van Giau"]
btn1 = Button(win, text="Lap hoa don", command=hoadon)
btn2 = Button(win, text="Cap nhat")
btn3 = Button(win, text="Chi tiet hoa don")
btn4 = Button(win, text="Xoa HD")
btn5 = Button(win, text="Thoat", command=thoat)
la1.place(x=5)
la2.place(x=300)
fra.place(x=200, y=20)
sho.pack()
lab1.place(x=5, y=20)
ent1.place(x=80, y=20)
lab2.place(x=5, y=40)
ent2.place(x=80, y=40)
lab3.place(x=5, y=60)
ent3.place(x=80, y=60)
lab4.place(x=5, y=80)
ent4.place(x=80, y=80)
btn1.place(x=5, y=110)
btn2.place(x = 90, y=110)
btn3.place(x=160, y=110)
btn4.place(x=20, y=140)
btn5.place(x=100, y=140)
win.mainloop()