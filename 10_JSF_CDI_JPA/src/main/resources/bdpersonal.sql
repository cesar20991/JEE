-- Database: personal

-- DROP DATABASE personal;

CREATE DATABASE personal
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Spanish_Peru.1252'
       LC_CTYPE = 'Spanish_Peru.1252'
       CONNECTION LIMIT = -1;

-- Table: public.persona

-- DROP TABLE public.persona;

CREATE TABLE public.persona
(
  nombres character varying NOT NULL,
  apellidos character varying NOT NULL,
  fechanac date,
  sexo character(1),
  telefono character(9),
  direccion character varying(200),
  idpersona integer NOT NULL,
  CONSTRAINT idpersona_pkey PRIMARY KEY (idpersona)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.persona
  OWNER TO postgres;
