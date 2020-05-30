use eng2020_1_andersonatividade02;

CREATE TABLE usuario (
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (username))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

insert into usuario (username, password)
values
('leo@esteves.com', '?ôÐ¦{WçØ?v?v|');
/* a senha usada foi leo */