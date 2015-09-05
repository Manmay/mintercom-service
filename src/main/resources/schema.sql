
/* table : login */
create table login (
    id integer auto_increment not null primary key,
    user_name varchar(32) not null, 
    password varchar(32) not null, 
    enabled boolean not null, 
    role varchar(16) not null
);

create table complex (
    id integer auto_increment not null primary key,
    name varchar(32) not null, 
    security_company varchar(32) not null, 
    no_of_gates integer not null, 
);

create table tenant (
    id integer auto_increment not null primary key,
    complex_id varchar(32) not null, 
    firstname varchar(32) not null, 
    lastname integer not null,
    uuid varchar(30) not null, 
    unit_no integer not null,
    constraint tenant_fk1 foreign key (complex_id) references complex (id)
);

