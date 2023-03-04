import tkinter as tk
from tkinter import ttk
from datetime import datetime, timedelta

class Application(tk.Frame):
    def __init__(self, master=None):
        super().__init__(master)
        self.master = master
        self.pack()
        self.create_widgets()

    def create_widgets(self):
        self.cbo_dates = ttk.Combobox(self)
        self.cbo_dates.pack(side="left")

        self.btn_submit = tk.Button(self, text="Xác nhận", command=self.update_combo_box)
        self.btn_submit.pack(side="left")

        # Điều chỉnh ngày/tiếp theo:
        self.time_delta = timedelta(days=1)

    def update_combo_box(self):
        # Xóa các phần tử của combo box:
        self.cbo_dates['values'] = []

        # Lấy ngày hiện tại:
        current_date = datetime.now().strftime("%Y-%m-%d")

        # Thêm ngày vào danh sách:
        for i in range(10):
            self.cbo_dates['values'] += (current_date,)
            # Cộng thêm delta time để chuyển sang ngày/tiếp theo:
            current_date = (datetime.strptime(current_date, "%Y-%m-%d") + self.time_delta).strftime("%Y-%m-%d")

# Khởi tạo và hiển thị ứng dụng:
# root = tk.Tk()
# app = Application(master=root)
# app.mainloop()
