DROP TABLE IF EXISTS empresas CASCADE;
DROP TABLE IF EXISTS tipo_transacoes CASCADE;
DROP TABLE IF EXISTS transacoes CASCADE;

CREATE TABLE empresas (
  id bigserial not null,
  nome varchar(255) not null unique,
  primary key (id));

CREATE TABLE tipo_transacoes (
  id bigserial not null,
  descricao varchar(255) not null unique,
  primary key (id));

CREATE TABLE transacoes (
  id bigserial not null,
  descricao varchar(255),
  status smallint,
  valor numeric(38,2),
  id_empresa bigint,
  id_tipo bigint,
  primary key (id));

ALTER TABLE IF EXISTS transacoes add constraint id_empresa_empresas_fk foreign key (id_empresa) references empresas;
ALTER TABLE IF EXISTS transacoes add constraint id_tipo_tipo_transacoes_fk foreign key (id_tipo) references tipo_transacoes;