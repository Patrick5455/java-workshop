CREATE TABLE IF NOT EXISTS customer
(
  CUSTOMER_ID long,
  USERNAME varchar(255),
  FIRST_NAME varchar(255),
  LAST_NAME varchar(255),
  UNIQUE(USERNAME),
  PRIMARY KEY (CUSTOMER_ID)
);
