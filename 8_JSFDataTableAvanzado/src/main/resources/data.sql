-- Como cargar primero
-- 1. Traer filas
-- 2- Luego traer columnas



-- DATA
-- 1. FILA
INSERT INTO public.fila(
            id, descripcion)
    VALUES (1, 'Fila1');

INSERT INTO public.fila(
            id, descripcion)
    VALUES (2, 'Fila2');
INSERT INTO public.fila(
            id, descripcion)
    VALUES (3, 'Fila3');

-- 2. Columnas
INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (1, 'Columna1', 1, 1, 1);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (2, 'Columna2', 1, 2, 1);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (3, 'Columna3', 2, 1, 2);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (4, 'Columna4', 2, 1, 1);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (5, 'Columna5', 2, 1, 1);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (6, 'Columna6', 3, 1, 1);

INSERT INTO public.columna(
            id, descripcion, nivel, ancho, alto)
    VALUES (7, 'Columna7', 3, 1, 1);

-- 3. Celdas

    INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (1, 3, 'ValorA');
    
    INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (1, 6, 'ValorB');
    
    INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (1, 7, 'ValorC');

    
    INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (2, 3, 'ValorD');

INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (2, 6, 'ValorE');


INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (2, 7, 'ValorF');

    INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (3, 3, 'ValorG');

INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (3, 6, 'ValorH');


INSERT INTO public.celda(
            idfila, idcolumna, valor)
    VALUES (3, 7, 'ValorI');



    
    