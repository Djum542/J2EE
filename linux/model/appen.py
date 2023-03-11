

import  pandas as pd
data1 = pd.ExcelFile("customer.xlsx")
df1 = pd.read_excel(data1)
df1.drop(df1.filter(regex="Unmamed"), axis=1, inplace=True)
data2 = {'Ma KH':['k01','k02','k03'],'TenKH':['Nguyen Thien Thuat', 'Trau Sinh Co', 'Hoang Van Mau'],'Ngay sinh':['12/05/2001', '30/08/2003', '14/02/2002'],'Gioi tinh':['Nam', 'Nam', 'Nu'],'Dia chi':['Thanh Hoa', 'Binh Dinh', 'Dong Thap'],'Dien thoai':['0325258', '025478008', '0528475625']}
df2 = pd.DataFrame(data2)
df = df1+ df2;
# msg1 = "My name is "
# msg2 = "John"
# message = msg1 + msg2
# print(message)
# # Output: My name is John
#
# words = ["I", "am", "a", "Python", "developer"]
# sentence = " ".join(words)
# print(sentence)
# # Output: I am a Python developer