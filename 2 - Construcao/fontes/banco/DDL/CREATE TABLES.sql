CREATE TABLE SGPPRD.RECURSO(
   ID_RECURSO 		INT PRIMARY KEY     NOT NULL,
   NM_RECURSO      	TEXT    NOT NULL
);

CREATE TABLE SGPPRD.PROJETO(
   ID_PROJETO 		INT PRIMARY KEY     NOT NULL,
   NM_PROJETO      	TEXT    NOT NULL,
   DT_INICIO            DATE     NOT NULL,
   DT_FIM        	DATE,
   VL_HORAS         	INT
);

CREATE TABLE SGPPRD.REUNIAO(
   ID_REUNIAO 		INT PRIMARY KEY     NOT NULL,
   ID_PROJETO      	INT    NOT NULL,
   DT_INICIO            DATE     NOT NULL,
   ID_RECURSO        	INTEGER,
   VL_HORAS         	INT,
   DT_HORARIO		TEXT,
   NM_LOCAL			TEXT,
   FL_STATUS		INT
);

CREATE TABLE SGPPRD.ALOCACAO(
   ID_ALOCACAO 		INT PRIMARY KEY     NOT NULL,
   ID_PROJETO      	INT    NOT NULL,
   ID_RECURSO           INT     NOT NULL,
   VALOR_HORAS        	INTEGER,
   DT_INICIO         	DATE,
   DT_FIM		DATE
);

CREATE TABLE SGPPRD.HORAS(
	ID_PROJETO INT,
	ID_RECURSO INT,
	VL_HORAS INT,
	DT_LANCAMENTO TEXT
);

CREATE TABLE SGPPRD.SESSAO(
	ID_SESSAO INT,
	NM_RECURSO TEXT
);

CREATE SEQUENCE SGPPRD.REUNIAO_SQ START 1;

CREATE SEQUENCE SGPPRD.PROJETO_SQ START 1;

CREATE SEQUENCE SGPPRD.ALOCACAO_SQ START 1;

CREATE SEQUENCE SGPPRD.SESSAO_SQ START 1;