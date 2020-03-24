create database eng2020_1_AndersonAtividade02
default character set utf8
default collate utf8_general_ci;

create table pais (
id int auto_increment,
nome varchar(100),
populacao bigint,
area numeric(15.2),
primary key (id)
) default charset = utf8;


insert into pais
(nome, populacao, area)
values
('Itália', '60665551', '301338'),
('Canadá', '37242571', '9984670'),
('Emirados Árabes Unidos', '9599353', '83600'),
('Turquia', '75627384', '783562'),
('Estados Unidos', '325719178', '9371175');

describe pais;
select * from pais;
