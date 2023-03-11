import matplotlib.pyplot as plt
import pandas as pd
data = pd.read_excel('customer.xlsx')
sales_data = data['Ngay sinh']


plt.bar(height=20, width=20)
plt.xlabel('Tháng')
plt.ylabel('Doanh số')
plt.title('Thống kê doanh số theo tháng')
plt.show()
