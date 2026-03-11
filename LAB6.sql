mysql> Create Database student_db;
Query OK, 1 row affected (0.01 sec)

mysql> use student_db;
Database changed
mysql> create table student(
    -> id int primary key,
    -> name varchar(10) not full,
    -> address varchar(10) not full,
    -> age int not full);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'full,
address varchar(10) not full,
age int not full)' at line 3
mysql> CREATE TABLE student (
    ->     id INT PRIMARY KEY,
    ->     name VARCHAR(10) NOT NULL,
    ->     address VARCHAR(10) NOT NULL,
    ->     age INT NOT NULL
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> INSERT INTO student VALUES
    -> (1,'Amit','Mumbai',20),
    -> (2,'Rahul','Pune',21),
    -> (3,'Neha','Delhi',19),
    -> (4,'Riya','Nashik',22),
    -> (5,'Arjun','Goa',20);
Query OK, 5 rows affected (0.01 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from student;
+----+-------+---------+-----+
| id | name  | address | age |
+----+-------+---------+-----+
|  1 | Amit  | Mumbai  |  20 |
|  2 | Rahul | Pune    |  21 |
|  3 | Neha  | Delhi   |  19 |
|  4 | Riya  | Nashik  |  22 |
|  5 | Arjun | Goa     |  20 |
+----+-------+---------+-----+
5 rows in set (0.00 sec)

mysql> SELECT SUM(age) AS Total_Age FROM student;
+-----------+
| Total_Age |
+-----------+
|       102 |
+-----------+
1 row in set (0.00 sec)

mysql> SELECT AVG(age) AS Average_Age FROM student;
+-------------+
| Average_Age |
+-------------+
|     20.4000 |
+-------------+
1 row in set (0.00 sec)

mysql> select mmin(age) as Minimum_age from student;
ERROR 1305 (42000): FUNCTION student_db.mmin does not exist
mysql> select min(age) as Minimum_age from student;
+-------------+
| Minimum_age |
+-------------+
|          19 |
+-------------+
1 row in set (0.00 sec)

mysql> select max(age) as Maximum_age from student;
+-------------+
| Maximum_age |
+-------------+
|          22 |
+-------------+
1 row in set (0.00 sec)

mysql> select Count(age) as Total_age from student;
+-----------+
| Total_age |
+-----------+
|         5 |
+-----------+
1 row in set (0.00 sec)

