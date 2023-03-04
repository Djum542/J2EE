from tabnanny import check
from tkinter import *
from tkinter import ttk
import pandas as pd
import datetime

from tkcalendar import *
win = Tk()
win.geometry("800x300")
# calendar = Calendar(win)
canvas = Canvas(win,width=300, height=200)
def delt():
    #lay  = sho.get()
    #sho.delete(0, END)
    ent1.delete(0, END)
    ent2.delete(0, END)
    ent3.delete(0, END)
    ent4.delete(0, END)
    ent5.delete(0, END)
    load = pd.read_excel('customer.xlsx')
    dele = load.loc[load['Ma KH'] == ent1]
    dfde = load.drop(f'{list(la1[ent1])}', axis=1, inplace=True)
    lay = pd.DataFrame(dfde)
    lay.to_excel('customer.xlsx')
def show_calendar(event):
    value = ent5.get()
    calendar = ent5[value]
    calendar.pack(pady=10)
dates = ['2022-05-01', '2022-05-02', '2022-05-03']
calendars = {}
for date in dates:
    cal = DateEntry(win, date_pattern='yyyy-mm-dd')
    cal.set_date(date)
    calendars[date] = cal
def hienthi():
    datacus = {'Ma KH':['k01','k02','k03'],'TenKH':['Nguyen Thien Thuat', 'Trau Sinh Co', 'Hoang Van Mau'],'Ngay sinh':['12/05/2001', '30/08/2003', '14/02/2002'],'Gioi tinh':['Nam', 'Nam', 'Nu'],'Dia chi':['Thanh Hoa', 'Binh Dinh', 'Dong Thap'],'Dien thoai':['0325258', '025478008', '0528475625']}
    inputs = pd.DataFrame.from_dict(datacus, orient="index")
    df = inputs.transpose()
    da = df.to_excel('customer.xlsx')
    lay = pd.read_excel("customer.xlsx")
    lay.drop(lay.filter(regex="Unnamed"), axis=1, inplace=True)
    print(df)
    sho.config(text=lay)



def luu():
    ma = ent1.get()
    ten = ent2.get()
    bir = ent3.get()

    dc= ent4.get()
    dt = ent5.get()
    data1 = pd.ExcelFile("customer.xlsx")
    load = pd.read_excel(data1)
    load.drop(load.filter(regex="Unnamed"), axis=1, inplace=True)
    datadd ={"Ma KH":[ma],"TenKH":[ten],"Ngay sinh":[bir],"Gioi tinh":["Nam"],"Dia chi":[dc],"Dien thoai":[dt]}
    load1 =pd.DataFrame.from_dict(datadd, orient="index")
    # datadd laf noi chua thong tin moi, ignore_index=True dam bao chi so cua hang duoc reset
    #data = load.append(datadd, ignore_index=True)
    #ad = datadd.transpose()
    df = load.append(load1, ignore_index=True)
    df1 = df.transpose()
    print(df1)
    sho.config(text=df1)
    da = df1.to_excel('customer.xlsx')
# def show_calendar():
#     calendar.place(relx=.5, rely=.5, anchor="left")
# Tao ra cac chuc nang tren giao dien
la1 = Label(win, text="Thong tin khach hang")
# la2 = Label(win, text="Danh sach hoa don")


sho = Label(win, width=100)
lab1 = Label(win, text="Ma KH")
ent1 = Entry(win, width=15)
lab2 = Label(win, text="Tenkh")
ent2 = ttk.Combobox(win, width=20)
ent2["value"] = ["Nguyen Chi Huan", "Tran Cao Trung", "Cao Van Giau"]
lab3 = Label(win, text="Ngay sinh")
#ent5 = Spinbox(win, from_=1, to=31, wrap=True, width=2)
ent5 = ttk.Combobox(win, width=15, values=dates)# tao ra chonj lichj
#ent5.set_date(datetime.date.today())
ent5.bind('<<ComboboxSelected>>', show_calendar)
# lab3 = Label(win, text="Ten KH")
# ent3 = ttk.Combobox(win, width=10)
# ent3["value"] = ["Admin", "Manager","Account"]
la3 = Label(win, text="Dia chi")
ent3 = Entry(win, width=15)
la4 = Label(win, text="Dien thoai")
ent4 = Entry(win, width=15)
# Tạo đối tượng DateEntry với ngày hiện tại
dateentry = DateEntry(canvas)
dateentry.pack()
# Thiết lập giá trị mặc định cho Combobox là ngày hiện tại
ent5.set(dateentry.get())
# lab4 = Label(win, text="Khach hang")
# ent4 = ttk.Combobox(win, width=10)
# ent4["value"] = ["Nguyen Chi Huan", "Tran Cao Trung", "Cao Van Giau"]
la5 = Checkbutton(win, text="Nam", onvalue=1, offvalue=0, variable=check)
la6 = Checkbutton(win, text="Nu", onvalue=1, offvalue=0, variable=check)
btn1 = Button(win, text="Luu", command=hienthi)
btn2 = Button(win, text="Cap nhat", command=luu)
btn3 = Button(win, text="Xoa", command=delt)
btn4 = Button(win, text="Huy", command=win.destroy)
# btn5 = Button(win, text="Thoat")
la1.place(x=5)
# la2.place(x=300)

sho.place(x=300, y=20)
lab1.place(x=5, y=40)
ent1.place(x=80, y=40)
lab2.place(x=5, y=80)
ent2.place(x=80, y=80)
lab3.place(x =5, y=120)
ent5.place(x=80, y=120)
la5.place(x=5, y=160)
la6.place(x=50, y=160)
# lab3.place(x=5, y=60)
# ent3.place(x=80, y=60)
# lab4.place(x=5, y=80)
# ent4.place(x=80, y=80)
la3.place(x=5, y=200)
ent3.place(x= 80, y=200)
la4.place(x= 5, y=240)
ent4.place(x=80, y=240)
btn1.place(x=250, y=240)
btn2.place(x = 300, y=240)
btn3.place(x=370, y=240)
btn4.place(x=410, y=240)
# btn5.place(x=100, y=240)
win.mainloop()