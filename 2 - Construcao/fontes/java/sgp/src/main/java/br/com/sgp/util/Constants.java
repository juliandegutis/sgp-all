package br.com.sgp.util;

public class Constants {
	public static final String SCRIPT_SELECT_PROJETO = new StringBuilder()
	.append( "SELECT * FROM sgp.\"SGP_PROJETO\" WHERE \"NM_CLIENTE\" = ?" ).toString();

	public static final String SCRIPT_INSERT_PROJETO = new StringBuilder()
	.append( "INSERT INTO sgp.\"SGP_PROJETO\" VALUES (?,?,?,?)" ).toString();
	
	public static final String SCRIPT_INSERT_SESSAO = new StringBuilder()
	.append( "INSERT INTO sgp.\"SGP_PROJETO\" VALUES (?, current_timestamp )" ).toString();
	
	public static final String SCRIPT_SELECT_SESSAO = new StringBuilder()
	.append( "SELECT * FROM sgp.\"SGP_PROJETO\" ORDER BY 2 DESC LIMIT 1" ).toString();
}
