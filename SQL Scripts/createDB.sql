USE dominion;


DROP TABLE cardDB;

CREATE TABLE cardDB (
	DESCRIPTOR varchar(50)
    ,TYPE varchar(50)
    ,COST INTEGER
    ,ATTACK BOOLEAN
    ,REACTION BOOLEAN);
    
/*****Display variables******/    
-- SHOW VARIABLES LIKE "secure_file_priv";   
    
LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 5.7/Uploads/cardFile.txt'
INTO TABLE cardDB
FIELDS TERMINATED BY '|'
LINES TERMINATED BY '@'
IGNORE 1 ROWS;

SELECT *
FROM
	cardDB;