DROP TABLE IF EXISTS doctors;
DROP TABLE IF EXISTS patients;

CREATE TABLE IF NOT EXISTS doctors
(
    id serial primary key,
    uuid uuid not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    specification varchar(255) not null,
    employment_date date not null
);

CREATE TABLE IF NOT EXISTS patients
(
    id serial primary key,
    uuid uuid not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    birthday date not null,
    date_last_appointment date
);

CREATE TABLE IF NOT EXISTS time_slots
(
    id serial primary key,
    id_doctor integer references doctors(id) not null,
    id_patient integer references patients(id),
    start_time timestamp with time zone not null
);