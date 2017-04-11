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