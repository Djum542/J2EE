import cursor as cursor
import pymysql.cursors

# Kết nối vào database.
connection = pymysql.connect(host='127.0.0.1',
                             user='root',
                             password='15142',
                             db='cellphone',
                             charset='utf8',
                             cursorclass=pymysql.cursors.DictCursor)
print ("connect successful!!")
sql = "SELECT * FROM cellphone.profilecell; "
         # Thực thi câu lệnh truy vấn (Execute Query).
cursor.execute(sql)
print ("cursor.description: ", cursor.description)
print()
# try:
#     with connection.cursor() as cursor:
#         # SQL
#         sql = "SELECT * FROM cellphone.profilecell; "
#         # Thực thi câu lệnh truy vấn (Execute Query).
#         cursor.execute(sql)
#         print ("cursor.description: ", cursor.description)
#         print()
#         # for row in cursor:
#         #     print(row)
#         #     profilecellphone.show()
# finally:
#     # Đóng kết nối (Close connection).
#     connection.close()