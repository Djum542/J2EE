import pandas as pd
import tkinter as tk

# Tạo DataFrame ban đầu
df = pd.DataFrame(columns=['Tên', 'Tuổi'])

# Tạo GUI với Tkinter
root = tk.Tk()

# Khai báo biến StringVar để lưu giá trị nhập từ Entry
name_input = tk.StringVar()
age_input = tk.StringVar()

# Tạo 2 Entry để người dùng nhập Tên và Tuổi
name_entry = tk.Entry(root, textvariable=name_input)
age_entry = tk.Entry(root, textvariable=age_input)

# Thiết lập các vị trí để hiển thị Entry lên màn hình
name_entry.pack()
age_entry.pack()

# Hàm để lấy giá trị từ Entry và chèn vào DataFrame
def insert_data():
    name = name_input.get()
    age = int(age_input.get())

    # Sử dụng .loc để chèn dữ liệu vào DataFrame
    df.loc[len(df)] = [name, age]

    # In ra DataFrame sau khi đã chèn
    print(df)

# Tạo nút "Chèn" để kích hoạt hàm insert_data
insert_button = tk.Button(root, text='Chèn', command=insert_data)
insert_button.pack()

# Hiển thị GUI
root.mainloop()
