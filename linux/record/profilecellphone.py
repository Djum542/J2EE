from tabnanny import check
from tkinter import *
from tkinter import ttk

import pandas as pd
win = Tk()
win.geometry("600x400")
win.title("Profilecellphone")
# lis = ["oppo", "samsung", "redmi", "xiaomi", "nokia"]
def show():
    # sh = connectSQL.get()
    # ds.config(sh)
    ds = Listbox(win, width=30, height=20)
    ds.place(x=300, y=40)
    df = pd.read_csv('profilecell.csv')
    # dff = pd.DataFrame(df)
    ds.config(df)
    for i in range(len(df)):
        ds.insert(i, df[i])
    # print(df.to_string())
def dienvo():
    comb = nhap1.get()
    ma = nhap2.get()
    ten = nhap3.get()
    sol = chon.get()
    dong = chon1.get()
    for i in range(len(comb,ma,ten,sol,dong)):
        ds.insert(comb)
label1 = Label(win, text="Thôn tin điện thoại")
label1.place(x=5, y=5)
# label1.pack()
label2 = Label(win, text="Danh sách điện thoại")
label2.place(x=300, y=5)

label3 = Label(win, text="Hãng điện thoại")
# tao ra combobox
slecect = StringVar()
nhap1 = ttk.Combobox(win, textvariable=slecect, width=10)
nhap1['values'] = ["Oppo", "Samsung", "Iphone","Readmi", "Xiaomi","Nokia", "Lumia"]
nhap1["state"] = "readonly"
# bind the selected value changes
# def month_changed(event):
#     """ handle the month changed event """
#     showinfo(
#         title='Result',
#         message=f'You selected {select.get()}!'
#     )
#
# nhap1.bind('<<ComboboxSelected>>', select)
# nhap1.place(x=50, y=40)
label3.place(x=5, y=30)
nhap1.place(x=100, y=30)
ds  = Listbox(win, width=60, height=20)
ds.place(x= 300, y=40)
label4= Label(win, text="Mã điện thoại")
label4.place(x=5, y=60)
nhap2 = Entry(win, width=10)
nhap2.place(x=100, y=70)
label5 = Label(win, text="Tên điện thoại")
label5.place(x=5, y=100)
nhap3 = Entry(win, width=10)
nhap3.place(x= 100, y = 100)
label6 = Label(win, text="Màu sắc")
label6.place(x= 5, y=120)
nut1 = Checkbutton(win, text="Trắng", onvalue=1, offvalue=0, variable=check)
nut1.place(x= 60, y=130)
nut2 = Checkbutton(win, text="Đen", onvalue=1, offvalue=0, variable=check)
nut2.place(x= 120, y=130)
label7 = Label(win, text="Số lượng")
label7.place(x= 5, y=160)
chon = Entry(win, width=10)
chon.place(x=100, y=160)
label8 = Label(win, text="Đơn giá")
label8.place(x=5, y=200)
chon1 = Entry(win, width=10)
chon1.place(x=100, y=200)
btn1 = Button(win, text="Thêm", activebackground="green", command=dienvo)
btn1.place(x=15, y=240)
btn2 = Button(win, text="Xóa", activebackground="red")
btn2.place(x= 80, y=240)
btn3 = Button(win, text="Sửa",activebackground="yellow")
btn3.place(x=160, y=240)
btn4 = Button(win, text="Cập nhật",activebackground="green")
btn4.place(x=5, y=280)
btn5 = Button(win, text="Hủy",activebackground="yellow")
btn5.place(x=80, y=280)
btn6 = Button(win, text="Thoát", activebackground="white")
btn6.place(x=160, y=280)
win.mainloop()