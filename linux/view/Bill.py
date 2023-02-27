from tkinter import *
from tkinter import ttk
win = Tk()
win.geometry("500x300")
la1 = Label(win, text="Thong tin hoa don")
la2 = Label(win, text="Danh sach hoa don")
sho = Text(win, height=20)
lab1 = Label(win, text="Ma HD")
ent1 = Entry(win, width=15)
lab2 = Label(win, text="Ngay lap HD")
ent2 = Spinbox(win, from_=1/1/1970, to=31/12/2040, wrap=True, width=15)
lab3 = Label(win, text="Nhan vien")
ent3 = ttk.Combobox(win, width=10)
ent3["value"] = ["Admin", "Manager","Account"]
lab4 = Label(win, text="Khach hang")
ent4 = ttk.Combobox(win, width=10)
ent4["value"] = ["Nguyen Chi Huan", "Tran Cao Trung", "Cao Van Giau"]
btn1 = Button(win, text="Lap hoa don")
btn2 = Button(win, text="Cap nhat")
btn3 = Button(win, text="Chi tiet hoa don")
btn4 = Button(win, text="Xoa HD")
btn5 = Button(win, text="Thoat", command=win.destroy())
la1.place(x=5)
la2.place(x=300)
sho.place(x=300, y=20)
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