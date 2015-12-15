package br.com.sgp.util;

public class Constants {
	
	public static final String SCRIPT_SELECT_PROJETOS_FINALIZADOS = new StringBuilder()
	.append(" SELECT COUNT(1) AS COUNT FROM SGPPRD.PROJETO P ")
	.append(" JOIN SGPPRD.ALOCACAO A ON P.ID_PROJETO = A.ID_PROJETO ")
	.append(" JOIN SGPPRD.RECURSO R ON A.ID_RECURSO = R.ID_RECURSO ")
	.append(" WHERE P.DT_FIM IS NOT NULL AND R.ID_RECURSO = ?").toString();
	
	public static final String SCRIPT_SELECT_PROJETOS_PENDENTES = new StringBuilder()
	.append(" SELECT COUNT(1) AS COUNT FROM SGPPRD.PROJETO P ")
	.append(" JOIN SGPPRD.ALOCACAO A ON P.ID_PROJETO = A.ID_PROJETO ")
	.append(" JOIN SGPPRD.RECURSO R ON A.ID_RECURSO = R.ID_RECURSO ")
	.append(" WHERE P.DT_FIM IS NULL AND R.ID_RECURSO = ?").toString();
	
	public static final String SCRIPT_SELECT_REUNIOES_PENDENTES = new StringBuilder()
	.append(" SELECT COUNT(1) AS COUNT FROM SGPPRD.REUNIAO R ")
	.append(" JOIN SGPPRD.RECURSO RE ON RE.ID_RECURSO = R.ID_RECURSO ")
	.append(" WHERE R.ID_RECURSO = ?").toString();
	
	public static final String SCRIPT_SELECT_REUNIOES = new StringBuilder()
	.append(" SELECT * FROM SGPPRD.REUNIAO R ")
	.append(" JOIN SGPPRD.RECURSO RE ON RE.ID_RECURSO = R.ID_RECURSO JOIN SGPPRD.PROJETO P ON R.ID_PROJETO = P.ID_PROJETO ")
	.append(" WHERE R.ID_RECURSO = ?").toString();
	
	public static final String SCRIPT_SELECT_PROJETOS = new StringBuilder()
	.append(" SELECT P.ID_PROJETO, P.NM_PROJETO, P.DT_INICIO, P.DT_FIM, SUM(H.VL_HORAS) AS VL_HORAS FROM SGPPRD.PROJETO P LEFT JOIN SGPPRD.HORAS H ON P.ID_PROJETO = H.ID_PROJETO ")
	.append(" WHERE P.DT_FIM IS NULL ")
	.append(" 	 GROUP BY P.ID_PROJETO, P.NM_PROJETO, P.DT_INICIO, P.DT_FIM ").toString();
	
	public static final String SCRIPT_SELECT_PROJETOS_RECURSO = new StringBuilder()
	.append(" SELECT P.ID_PROJETO, P.NM_PROJETO, P.DT_INICIO, P.DT_FIM, SUM(H.VL_HORAS) AS VL_HORAS FROM SGPPRD.PROJETO P JOIN SGPPRD.ALOCACAO A ON P.ID_PROJETO = A.ID_PROJETO LEFT JOIN SGPPRD.HORAS H ON P.ID_PROJETO = H.ID_PROJETO WHERE A.ID_RECURSO = ? GROUP BY P.ID_PROJETO, P.NM_PROJETO, P.DT_INICIO, P.DT_FIM ").toString();
	
	public static final String SCRIPT_SELECT_RECURSOS = new StringBuilder()
	.append(" SELECT * FROM SGPPRD.RECURSO ").toString();
	
	public static final String SCRIPT_SELECT_RECURSO_PROJETO = new StringBuilder()
	.append(" SELECT * FROM SGPPRD.PROJETO P JOIN SGPPRD.ALOCACAO A ON P.ID_PROJETO = A.ID_PROJETO WHERE P.ID_PROJETO = ? ").toString();
	
	public static final String SCRIPT_SELECT_HORAS_RECURSO = new StringBuilder()
	.append(" SELECT H.*, REC.NM_RECURSO, P.NM_PROJETO FROM SGPPRD.HORAS H JOIN SGPPRD.PROJETO P ON H.ID_PROJETO = P.ID_PROJETO JOIN SGPPRD.RECURSO REC ON REC.ID_RECURSO = H.ID_RECURSO ").toString();
	
	public static final String SCRIPT_INSERT_REUNIAO = new StringBuilder()
	.append(" INSERT INTO SGPPRD.REUNIAO (ID_REUNIAO, ID_PROJETO, DT_INICIO, ID_RECURSO, DT_HORARIO, NM_LOCAL) VALUES (nextval('SGPPRD.REUNIAO_SQ'), ?, ? , ?, ?, ? )").toString();
	
	public static final String SCRIPT_INSERT_PROJETO = new StringBuilder()
	.append(" INSERT INTO SGPPRD.PROJETO (ID_PROJETO, NM_PROJETO, DT_INICIO) VALUES (nextval('SGPPRD.PROJETO_SQ'), ?, ? )").toString();
	
	public static final String SCRIPT_INSERT_HORAS = new StringBuilder()
			.append(" INSERT INTO SGPPRD.HORAS (ID_PROJETO, ID_RECURSO, DT_LANCAMENTO, VL_HORAS) VALUES (?, ?, ?, ? )").toString();
	
	public static final String SCRIPT_INSERT_ALOCACAO = new StringBuilder()
	.append(" INSERT INTO SGPPRD.ALOCACAO (ID_ALOCACAO, ID_PROJETO, ID_RECURSO, DT_INICIO, DT_FIM) VALUES (nextval('SGPPRD.ALOCACAO_SQ'), ?, ?, ?, ? )").toString();
	
	public static final String SCRIPT_INSERT_SESSAO = new StringBuilder()
	.append(" INSERT INTO SGPPRD.SESSAO (ID_SESSAO, NM_RECURSO) VALUES ( nextval('SGPPRD.SESSAO_SQ'), ? )").toString();
	
	public static final String SCRIPT_SELECT_SESSAO = new StringBuilder()
	.append(" SELECT * FROM SGPPRD.SESSAO S JOIN SGPPRD.RECURSO R ON S.NM_RECURSO = R.NM_RECURSO ORDER BY 1 DESC LIMIT 1 ").toString();
			
}
