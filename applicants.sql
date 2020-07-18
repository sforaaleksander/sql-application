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
-- Data for Name: applicants; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (1, 'Dominique', 'Williams', '003630/734-4926', 'dolor@laoreet.co.uk', 61823);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (2, 'Jemima', 'Foreman', '003620/834-6898', 'magna@etultrices.net', 58324);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (3, 'Zeph', 'Massey', '003630/216-5351', 'a.feugiat.tellus@montesnasceturridiculus.co.uk', 61349);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (4, 'Joseph', 'Crawford', '003670/923-2669', 'lacinia.mattis@arcu.co.uk', 12916);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (5, 'Ifeoma', 'Bird', '003630/465-8994', 'diam.duis.mi@orcitinciduntadipiscing.com', 65603);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (6, 'Arsenio', 'Matthews', '003620/804-1652', 'semper.pretium.neque@mauriseu.net', 39220);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (7, 'Jemima', 'Cantu', '003620/423-4261', 'et.risus.quisque@mollis.co.uk', 10384);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (8, 'Carol', 'Arnold', '003630/179-1827', 'dapibus.rutrum@litoratorquent.com', 70730);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (9, 'Jane', 'Forbes', '003670/653-5392', 'janiebaby@adipiscingenimmi.edu', 56882);
INSERT INTO public.applicants (id, first_name, last_name, phone_number, email, application_code) VALUES (10, 'Ursa', 'William', '003620/496-7064', 'malesuada@mauriseu.net', 91220);


--
-- Name: applicants_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.applicants_id_seq', 10, true);


--
-- PostgreSQL database dump complete
--

