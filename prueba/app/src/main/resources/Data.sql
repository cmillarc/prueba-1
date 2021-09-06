
-- Drop table

-- DROP TABLE public.usuario;

CREATE TABLE public.usuario (
	id serial NOT NULL,
	"password" varchar(255) NULL,
	usuario varchar(255) NULL,
	CONSTRAINT usuario_pkey PRIMARY KEY (id)
);

INSERT INTO usuario
("password", usuario)
VALUES('password', 'usuario');

-- Drop table

-- DROP TABLE coordenada;

CREATE TABLE coordenada (
	id serial NOT NULL,
	descripcion varchar(255) NULL,
	lat varchar(255) NULL,
	lng varchar(255) NULL,
	CONSTRAINT coordenada_pkey PRIMARY KEY (id)
);

INSERT INTO coordenada
(lat, lng,descripcion)
VALUES('-33.45694', '-70.64827','Santiago');

