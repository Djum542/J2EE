import pandas as pd
from tkinter import *
# data1 = pd.ExcelFile('customer.xlsx')
# df1 = pd.read_excel(data1, index_col=None)
# df1.drop(df1.filter(regex='Unnamed'),axis=1, inplace=True)
# ma = str(input('Nhap vao ma:'))
# dk = df1[df1['Ma KH'] == ma]
# data1 = dk.iloc[1,1]
# data2 = dk.iloc[1,2]
# data3 = dk.iloc[1,3]
# data4 = dk.iloc[1,4]
# data5 = dk.iloc[1,5]
# # data6 = pd.concat([data1,data2,data3, data4, data5])
# print(data1)
import pandas as pd
win = Tk()
win.geometry('300x300')
lab = Label(win, text="nhap vao email can xoa:")
lab.pack()


data = {'Tên': ['An', 'Bình', 'Cường', 'Đức'],
        'Tuổi': [25, 30, 35, 40],
        'Email': ['an@example.com', 'binh@example.com', 'cuong@example.com', 'duc@example.com']}

df1 = pd.DataFrame(data)
text = Entry(win)
text.pack()

def delt():
    data1 = pd.ExcelFile('../../../managercell/view/customer.xlsx')
    df1 = pd.read_excel(data1)
    email = str(input("Nhap email can xoa:"))
    df = df1.drop(df1[df1['Ma KH'] == email].index)
    print(df)
xoa = Button(win, text="xoa", command=delt)
xoa.pack()
win.mainloop()