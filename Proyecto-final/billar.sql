PGDMP     4                    {           billar    14.7    14.7     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17214    billar    DATABASE     b   CREATE DATABASE billar WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE billar;
                postgres    false            �            1259    17216    partidas    TABLE     /  CREATE TABLE public.partidas (
    id integer NOT NULL,
    fecha date NOT NULL,
    rival character varying(255) NOT NULL,
    carambolas integer NOT NULL,
    entradas integer NOT NULL,
    serie_max integer NOT NULL,
    resultado character varying(255) NOT NULL,
    numero_mesa integer NOT NULL
);
    DROP TABLE public.partidas;
       public         heap    postgres    false            �            1259    17215    partidas_id_seq    SEQUENCE     �   CREATE SEQUENCE public.partidas_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.partidas_id_seq;
       public          postgres    false    210            �           0    0    partidas_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.partidas_id_seq OWNED BY public.partidas.id;
          public          postgres    false    209            \           2604    17219    partidas id    DEFAULT     j   ALTER TABLE ONLY public.partidas ALTER COLUMN id SET DEFAULT nextval('public.partidas_id_seq'::regclass);
 :   ALTER TABLE public.partidas ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    210    209    210            �          0    17216    partidas 
   TABLE DATA           m   COPY public.partidas (id, fecha, rival, carambolas, entradas, serie_max, resultado, numero_mesa) FROM stdin;
    public          postgres    false    210   H       �           0    0    partidas_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.partidas_id_seq', 165, true);
          public          postgres    false    209            ^           2606    17223    partidas partidas_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.partidas
    ADD CONSTRAINT partidas_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.partidas DROP CONSTRAINT partidas_pkey;
       public            postgres    false    210            �   �   x�U�=�@���S�0�Ǣ�F`3��`�%C,�NVv�\����t�{_�h��(cŷ�#�ԄV���Rr�F0B{��]�2�v2G��;�����i;�uVQ��Gn`���g�X��=��p$^�'�0�bͰYĞ�e�����\
~.8.�s�j�#5(9�%l���G++!���E�     