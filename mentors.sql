--
-- PostgreSQL database dump
--

-- Dumped from database version 10.12 (Ubuntu 10.12-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.12 (Ubuntu 10.12-0ubuntu0.18.04.1)

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

--
-- Data for Name: mentors; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (23, 'Pál', 'Monoczki', 'Pali', '003630/327-2663', 'pal.monoczki@codecool.com', 'Miskolc', NULL);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (24, 'Sándor', 'Szodoray', 'Szodi', '003620/519-9152', 'sandor.szodoray@codecool.com', 'Miskolc', 7);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (25, 'Dániel', 'Salamon', 'Dani', '003620/508-0706', 'daniel.salamon@codecool.com', 'Budapest', 4);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (26, 'Miklós', 'Beöthy', 'Miki', '003630/256-8118', 'miklos.beothy@codecool.com', 'Budapest', 42);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (27, 'Tamás', 'Tompa', 'Tomi', '003630/370-0748', 'tamas.tompa@codecool.com', 'Budapest', 42);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (28, 'Mateusz', 'Ostafil', 'Mateusz', '003648/518-664-923', 'mateusz.ostafil@codecool.com', 'Krakow', 13);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (29, 'Anikó', 'Fenyvesi', 'Anikó', '003670/111-2222', 'aniko.fenyvesi@codecool.com', 'Budapest', 11);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (30, 'Immánuel', 'Fodor', 'Immi', '003620/123-6234', 'immanuel.fodor@codecool.com', 'Budapest', 3);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (31, 'László', 'Molnár', 'Laci', '003620/222-5566', 'laszlo.molnar@codecool.com', 'Budapest', 5);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (32, 'Mátyás', 'Forián Szabó', 'Matyi', '003630/111-5532', 'matyas.forian.szabo@codecool.com', 'Budapest', 90);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (33, 'Zoltán', 'Sallay', 'Zozi', '003670/898-3122', 'zoltan.sallay@codecool.com', 'Budapest', 5);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (34, 'Szilveszter', 'Erdős', 'Sly', '003620/444-5555', 'szilveszter.erdos@codecool.com', 'Budapest', 13);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (35, 'László', 'Terray', 'Laci', '003670/402-2435', 'laszlo.terray@codecool.com', 'Budapest', 8);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (36, 'Árpád', 'Törzsök', 'Árpád', '003630/222-1221', 'arpad.torzsok@codecool.com', 'Budapest', 9);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (37, 'Imre', 'Lindi', 'Imi', '003670/222-1233', 'imre.lindi@codecool.com', 'Miskolc', 3);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (38, 'Róbert', 'Kohányi', 'Robi', '003630/123-5553', 'robert.kohanyi@codecool.com', 'Miskolc', NULL);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (39, 'Przemysław', 'Ciąćka', 'Przemek', '003670/222-4554', 'przemyslaw.ciacka@codecool.com', 'Krakow', 55);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (40, 'Marcin', 'Izworski', 'Marcin', '003670/999-2323', 'marcin.izworski@codecool.com', 'Krakow', 55);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (41, 'Rafał', 'Stępień', 'Rafal', '003630/323-5343', 'rafal.stepien@codecool.com', 'Krakow', 3);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (42, 'Agnieszka', 'Koszany', 'Agi', '003630/111-5343', 'agnieszka.koszany@codecool.com', 'Krakow', 77);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (43, 'Mateusz', 'Steliga', 'Mateusz', '003630/123-5343', 'mateusz.steliga@codecool.com', 'Krakow', 5);
INSERT INTO public.mentors (id, first_name, last_name, nick_name, phone_number, email, city, favourite_number) VALUES (44, 'Attila', 'Molnár', 'Atesz', '003670/630-0539', 'attila.molnar@codecool.com', 'Budapest', 23);


--
-- Name: mentors_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.mentors_id_seq', 44, true);


--
-- PostgreSQL database dump complete
--

