use pritamdb;
# 1. Create the following table CUSTOMER.
create table CUSTOMER
(Cust_id varchar(15),
Fname varchar(10),
Lname varchar(10),
Area char(2),
Phone bigint(10) default null,
DOB date,
Payment numeric(6,2)
);
insert into CUSTOMER values
("A01","Ivan","Ross","SA",6125467,"1915-01-20",800.50),
("A02","Vandana","Ray","MU",5560379,"1920-12-27",1000.75),
("A03","Pramada","jauguste","DA",4560389,"1925-07-17",500.00),
("A04","Basu","Navindi","BA",6125401,"1930-02-26",860.00),
("A05","Ravi","Shridhar","NA",NULL,"1915-02-19",500.00),
("A06","Rukmini","Aiyer","GH",5125274,"1923-07-17",1500.00);
# 2. Display the structure of the table you have created.
desc CUSTOMER;
# 3. Display the data of the created table.
show create table CUSTOMER;
# 4.Insert a row which will accept system date.
insert into CUSTOMER(DOB) values(now());
# 5.Display the data in the table.
select * from CUSTOMER;
# 6.Update the phone numbers of customer A02 and A04.
update CUSTOMER set Phone = 6295549179 where Cust_id = 'A02';
update CUSTOMER set Phone = 6295549 where Cust_id = 'A04';
# 7.Update the date of birth of customer A03 and A05.
update CUSTOMER set DOB = replace(DOB,"14-02-2002","09-11-2003")where Cust_id = 'A03' and Cust_id = 'A05';
# 8.Display the updated table.
select * from CUSTOMER;
# 9.Delete 2 rows from the table for customers A01 and A05.
delete from CUSTOMER where Cust_id='A01' and Cust_id='A05';
# 10.Delete all the rows from the table.
truncate table CUSTOMER;
# 11.Insert 5 records according to your own wish.
insert into CUSTOMER values
("A07","Rosse","naman","US",7358725,"1982-03-15",100.00),
("A08","RMANUJA","RAI","MP",823654,"1927-06-12",102.00),
("A09","hunny","kar","DL",8234547,"1945-01-02",1230.00),
("A10","udemy","rayil","UP",863453,"1839-08-27",423.00),
("A11","sanjat","kar","AP",983634,"1293-07-23",550.00);
# 12. Update one record based on any criteria according to your own wish.
update CUSTOMER set Fname = "Arpita"where Cust_id = "A10";
# 13. Delete any 1 record from the table based on particular criteria.
delete from CUSTOMER where Fname = "sanjat";