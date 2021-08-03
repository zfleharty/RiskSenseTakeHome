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
select c.manufacturer, c.model, c.price 
from (
Select manufacturer,max(price) as maxprice 
from cars GROUP BY manufacturer
) as x inner join cars as c on c.manufacturer = x.manufacturer and c.price = x.maxprice;
