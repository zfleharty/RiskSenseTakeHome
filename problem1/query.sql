-- create a table
CREATE TABLE cars (
  manufacturer TEXT NOT NULL,
  model TEXT NOT NULL,
  price INTEGER NOT NULL
);
-- insert data
INSERT INTO cars VALUES ('Toyota', 'Camry', 16000);
INSERT INTO cars VALUES ('Toyota', 'Hilander', 22000);
INSERT INTO cars VALUES ('Honda', 'Pilot',24000);
INSERT INTO cars VALUES ('Honda', 'Accor',17000);
-- fetch max values
Select manufacturer,model,max(price) from cars GROUP BY manufacturer;
