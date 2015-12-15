package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import br.com.sgp.repository.model.ProjetoTO;
import br.com.sgp.repository.model.RecursoTO;
import br.com.sgp.util.Constants;

public class RecursoDAO {
	
	public ArrayList< RecursoTO > buscaRecursos() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_RECURSOS );
			
			rs = pstmt.executeQuery();
			
			ArrayList< RecursoTO > listaRecursos = new ArrayList< RecursoTO >();
			
			while( rs.next() ) {
				RecursoTO to = new RecursoTO();
				to.setIdRecurso(rs.getLong("ID_RECURSO"));
				to.setNmRecurso(rs.getString("NM_RECURSO"));
				
				listaRecursos.add(to);
			}
			
			return listaRecursos;
			
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		
		return null;
	}
	
	public boolean save( Long idProjeto, Long idRecurso, String dtInicio, String dtFim ) throws ParseException {
		Connection con = null; 
		boolean retorno = false;
		try { 
						
			con = getConnection(); 
			
			PreparedStatement pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_ALOCACAO ); 
			pstmt.setLong(1, idProjeto);
			pstmt.setLong(2, idRecurso );
			pstmt.setString(3, dtInicio);
			pstmt.setString(4, dtFim );
			retorno = pstmt.execute(); 
			
			closeStatement(pstmt);
		
		} catch (SQLException e) { 
			e.printStackTrace(); 
		} 
		finally { 
			closeConnection(con); 
		} 
		return retorno;
	}
	
	public Connection getConnection() throws SQLException { 
		Connection con = null; 
		con = DriverManager .getConnection("jdbc:postgresql://localhost/sgpprd?user=postgres&password=admin"); 
		return con;
	} 
	
	public void closeConnection(Connection con) { 
		try { 
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void closeStatement(PreparedStatement con) { 
		try { 
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void closeResultSet(ResultSet con) { 
		try { 
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
