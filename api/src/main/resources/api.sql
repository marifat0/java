--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: mobil; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.mobil (
    car_id integer NOT NULL,
    merk character varying(50),
    type character varying(50),
    car_name character varying(50),
    cc integer,
    harga double precision
);


ALTER TABLE public.mobil OWNER TO postgres;

--
-- Name: mobil_car_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.mobil_car_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.mobil_car_id_seq OWNER TO postgres;

--
-- Name: mobil_car_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.mobil_car_id_seq OWNED BY public.mobil.car_id;


--
-- Name: mobil_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.mobil_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.mobil_seq OWNER TO postgres;

--
-- Name: mobil car_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mobil ALTER COLUMN car_id SET DEFAULT nextval('public.mobil_car_id_seq'::regclass);


--
-- Data for Name: mobil; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.mobil (car_id, merk, type, car_name, cc, harga) FROM stdin;
1	Toyota	Sedan	Camry	2480	700000000
2	Honda	Minivan	Odyssey	2356	400000000
3	Suzuki	Off-Road Mini SUV	Jimny	1400	400000000
\.


--
-- Name: mobil_car_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mobil_car_id_seq', 3, true);


--
-- Name: mobil_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mobil_seq', 1, true);


--
-- Name: mobil mobil_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.mobil
    ADD CONSTRAINT mobil_pkey PRIMARY KEY (car_id);


--
-- PostgreSQL database dump complete
--

