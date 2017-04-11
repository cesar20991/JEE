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
  idpersona integer NOT NULL DEFAULT nextval('persona_idpersona_seq'::regclass),
  apellidos character varying(30) NOT NULL,
  direccion character varying(100) NOT NULL,
  fechanac date NOT NULL,
  foto bytea,
  nombres character varying(30) NOT NULL,
  sexo character varying(1) NOT NULL,
  CONSTRAINT persona_pkey PRIMARY KEY (idpersona)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.persona
  OWNER TO postgres;
