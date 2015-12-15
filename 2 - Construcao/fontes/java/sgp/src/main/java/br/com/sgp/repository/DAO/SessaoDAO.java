package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.sgp.util.Constants;

public class SessaoDAO {
	public boolean save( String nome ) {
		Connection con = null; 
		boolean retorno = false;
		PreparedStatement pstmt = null;
		try { 
			con = getConnection(); 
			pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_SESSAO ); 
			pstmt.setString(1, nome);
			retorno = pstmt.execute(); } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
		finally { 
			closeStatement(pstmt);
			closeConnection(con); 
		} 
		return retorno;
	}
	
	public Long buscaRecursoSessao() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_SESSAO );
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				return rs.getLong("ID_RECURSO");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			closeStatement(pstmt);
			closeConnection(con); 
		} 
		
		return null;
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
