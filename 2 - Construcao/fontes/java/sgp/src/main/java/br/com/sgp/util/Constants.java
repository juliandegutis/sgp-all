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
	.append(" SELECT * FROM SGPPRD.PROJETO P WHERE P.DT_FIM IS NULL ").toString();
}
