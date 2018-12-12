/*******************************************************************************
* Create the database named sirona, its tables, and a user
*******************************************************************************/

DROP DATABASE IF EXISTS sirona;

CREATE DATABASE sirona;

USE sirona;

CREATE TABLE User (
  UserID INT NOT NULL AUTO_INCREMENT,
  Email VARCHAR(50),
  FirstName VARCHAR(50),
  LastName VARCHAR(50),
  
  PRIMARY KEY(UserID) 
);

INSERT INTO User 
  (Email, FirstName, LastName)
VALUES 
  ('bobhead@gmail.com', 'Bob', 'Head'),
  ('ottograph@yahoo.com', 'Otto', 'Graph'), 
  ('sallymander@yahoo.com', 'Sally', 'Mander'), 
  ('anitabreak@msn.com', 'Anita', 'Break');
  
  CREATE TABLE UserPass (
  Username varchar(15) NOT NULL PRIMARY KEY,
  Password varchar(15) NOT NULL
);

INSERT INTO UserPass VALUES ('bob', 'sesame'),
                            ('otto', 'sesame'),
                            ('sally', 'sesame'),
                            ('anita', 'sesame');

CREATE TABLE UserRole (   
  Username VARCHAR(15) NOT NULL,
  Rolename VARCHAR(15) NOT NULL,

  PRIMARY KEY (Username, Rolename)
);
  
INSERT INTO UserRole VALUES ('bob', 'patient'),
                            ('otto', 'clerk'),
                            ('sally', 'nurse'),
                            ('anita', 'doctor');

-- Create sirona_user and grant privileges

DELIMITER //
CREATE PROCEDURE drop_user_if_exists()
BEGIN
    DECLARE userCount BIGINT DEFAULT 0 ;

    SELECT COUNT(*) INTO userCount FROM mysql.user
    WHERE User = 'sirona_user' and  Host = 'localhost';

    IF userCount > 0 THEN
        DROP USER sirona_user@localhost;
    END IF;
END ; //
DELIMITER ;

CALL drop_user_if_exists() ;

CREATE USER sirona_user@localhost IDENTIFIED BY 'sesame';

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP
ON sirona.*
TO sirona_user@localhost;