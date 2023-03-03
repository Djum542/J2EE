import pandas as pd
from openpyxl import *
data = {"Ma KH": ["k01", "k02", "k03", "k04"],\
           "TenKH": ["Nguyen Thien Thuat", "Trau Sinh Co", "Hoang Van Mau"],\
           "gay sinh": ["12/05/2001", "30/08/2003", "14/02/2002"],\
           "Gioi tinh": ["Nam", "Nam", "Nu"],\
           "Dia chi": ["Thanh Hoa", "Binh Dinh", "Dong Thap"],\
           "Dien thoai": ["0325258", "025478008", "0528475625"]}
inputs = pd.DataFrame.from_dict(data, orient="index")
df = inputs.transpose()
print(inputs)
da = df.to_excel('customer.xlsx')
# import pandas as pd
#
# data = {
#   "calories": [420, 380, 390],
#   "duration": [50, 40, 45]
# }
#
# #load data into a DataFrame object:
# df = pd.DataFrame(data)
#
# print(df)