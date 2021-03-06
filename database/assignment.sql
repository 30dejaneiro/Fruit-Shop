USE master
GO
if exists (select * from sys.databases where name='Assignment')
		drop database Assignment
GO

CREATE DATABASE Assignment
GO

USE Assignment
GO


CREATE TABLE Login
 (username varchar (20) PRIMARY KEY,
  password nvarchar(30),
  role nvarchar(10)
 )
 
 CREATE TABLE Category(
 cid int ,
 type nvarchar(30) PRIMARY KEY
 )
 
 CREATE TABLE Product
 (id int PRIMARY KEY,
 name varchar (20) ,
  img nvarchar(300),
  description nvarchar(500),
  type nvarchar(30),
  price int
 )
 
 GO

alter table Product add FOREIGN KEY (type) references Category(type)
GO
 
 INSERT INTO Login (username,password,role) VALUES ('admin','1','admin')
 INSERT INTO Login (username,password,role) VALUES ('guest','1','guest')
 
 INSERT INTO Category(cid,type) VALUES (1,'Fruit')
 INSERT INTO Category(cid,type) VALUES (2,'Dried Fruit')
 
INSERT INTO Product (id,name,img,description,type,price) VALUES (1,'Banana','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Bananas are one of the most popular fruits worldwide. They contain essential nutrients that can have a protective impact on health.','Fruit',2)
INSERT INTO Product (id,name,img,description,type,price) VALUES (2,'Orange','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Oranges are a type of low calorie, highly nutritious citrus fruit. As part of a healthful and varied diet, oranges contribute to strong, clear skin and can help lower a person’s risk of many conditions.','Fruit',3)
INSERT INTO Product (id,name,img,description,type,price) VALUES (3,'Apple','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Apples are a popular fruit, containing antioxidants, vitamins, dietary fiber, and a range of other nutrients. Due to their varied nutrient content, they may help prevent several health conditions.','Fruit',4)
INSERT INTO Product (id,name,img,description,type,price) VALUES (4,'Mango','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Mangoes are sweet, creamy fruits that have a range of possible health benefits. They are highly popular around the world.','Fruit',5)
INSERT INTO Product (id,name,img,description,type,price) VALUES (5,'Guava ','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Guava is a traditional remedy for a range of health conditions. Research suggests that guava fruits and leaves may have a number of benefits.','Fruit',6)


INSERT INTO Product (id,name,img,description,type,price) VALUES (6,'Dried Banana','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Bananas are one of the most popular fruits worldwide. They contain essential nutrients that can have a protective impact on health.','Dried fruit',2)
INSERT INTO Product (id,name,img,description,type,price) VALUES (7,'Dried Orange','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Oranges are a type of low calorie, highly nutritious citrus fruit. As part of a healthful and varied diet, oranges contribute to strong, clear skin and can help lower a person’s risk of many conditions.','Dried fruit',3)
INSERT INTO Product (id,name,img,description,type,price) VALUES (8,'Dried Apple','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Apples are a popular fruit, containing antioxidants, vitamins, dietary fiber, and a range of other nutrients. Due to their varied nutrient content, they may help prevent several health conditions.','Dried fruit',4)
INSERT INTO Product (id,name,img,description,type,price) VALUES (9,'Dried Mango','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Mangoes are sweet, creamy fruits that have a range of possible health benefits. They are highly popular around the world.','Dried fruit',5)
INSERT INTO Product (id,name,img,description,type,price) VALUES (10,'Dried Guava','https://theflowerstudio.pk/wp-content/uploads/2017/06/2850.jpg','Guava is a traditional remedy for a range of health conditions. Research suggests that guava fruits and leaves may have a number of benefits.','Dried Fruit',6)