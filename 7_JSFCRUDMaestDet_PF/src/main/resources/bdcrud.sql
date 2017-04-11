-- Crear la bd llamada crud
-- Luego crear la tabla persona
CREATE TABLE public.persona
(
  apellidos character varying(50),
  nombres character varying(50),
  id integer NOT NULL DEFAULT nextval('persona_id_seq'::regclass),
  CONSTRAINT persona_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.persona
  OWNER TO postgres;
  
  
-- LUEGO CREAR LA TABLA TELEFONO
  
-- Table: public.telefono

-- DROP TABLE public.telefono;

CREATE TABLE public.telefono
(
  id integer NOT NULL DEFAULT nextval('telefono_id_seq'::regclass),
  idpersona integer NOT NULL,
  numero character varying(9),
  CONSTRAINT telefono_pkey PRIMARY KEY (id, idpersona),
  CONSTRAINT "telefono_idPersona_fkey" FOREIGN KEY (idpersona)
      REFERENCES public.persona (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.telefono
  OWNER TO postgres;
