-- Database: personal

-- DROP DATABASE personal;

CREATE DATABASE personal
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Peru.1252'
       LC_CTYPE = 'Spanish_Peru.1252'
       CONNECTION LIMIT = -1;
       
-- Las tablas se crean con el persistence.xml