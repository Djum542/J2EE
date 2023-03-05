use busines

go 
 create table Product(
 product_id nvarchar(10) primary key,
 category_id nvarchar(10),
 product_name nvarchar(500),
 product_image nvarchar(1000),
 product_price nvarchar(12),
 product_description nvarchar(500))
 go
 create table Bill(
 billid nvarchar(10) primary key,
 user_id nvarchar(10),
 total nvarchar(12))
 go
 create table Billdetail(
 billdetailid nvarchar(12) primary key,
 billid nvarchar(12),
 product_id nvarchar(12),
 price nvarchar(12),
 quantity nvarchar(50))
 go
 create table Cart(
 cart_id nvarchar(12) primary key,
 product_id nvarchar(12),
 product_name nvarchar(500),
 product_image nvarchar(1000),
 product_price nvarchar(12),
 product_description nvarchar(500),
 quantity nvarchar(50),
 total nvarchar(50))
 go
 create table Category(
 category_id nvarchar(12) primary key,
 category_name nvarchar(50))
 go
 create table Users(
 user_id nvarchar(12) primary key,
 user_email nvarchar(100),
 user_pass nvarchar(100))
 go 
 insert into Product(product_id,category_id, product_name,product_image,product_price,product_description) value(
 "p01","c01", "Ao polo ", "https://mcdn.coolmate.me/image/May2022/dia-chi-ban-ao-polo-nam-chinh-hang-ha-noi_341.jpg", 320000, 200)
 "p02", "c02, "Ao da ", "https://www.banaoda.vn/library/module_new/ao-da-bo-nam_s321.jpg", 560000, 300,

