CREATE TABLE public.product
(
    id character varying,
    name character varying(100) NOT NULL,
    price money NOT NULL,
    active character varying(1) NOT NULL DEFAULT 1,
    PRIMARY KEY (id)
);
