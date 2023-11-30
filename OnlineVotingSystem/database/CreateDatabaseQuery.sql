CREATE DATABASE voting_system

USE voting_system

CREATE TABLE positions (
id_number INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
[name] VARCHAR(50) NOT NULL
)

CREATE TABLE candidate (
id_number INT IDENTITY(1,1)  PRIMARY KEY NOT NULL,
candidate_name VARCHAR(50) NOT NULL,
username VARCHAR(50) NOT NULL,
points INT DEFAULT(0) NOT NULL,
position_id INT FOREIGN KEY REFERENCES Positions(id_number) NOT NULL
)

CREATE TABLE account (
id_number INT IDENTITY(1,1)  PRIMARY KEY NOT NULL,
student_name VARCHAR(50) NOT NULL,
[password] VARCHAR(50) NOT NULL,
[status] VARCHAR(50) DEFAULT('no') NOT NULL
)

CREATE TABLE [admin] (
id_number INT IDENTITY(1,1)  PRIMARY KEY NOT NULL,
username VARCHAR(50) NOT NULL,
[password] VARCHAR(50) NOT NULL,
)


