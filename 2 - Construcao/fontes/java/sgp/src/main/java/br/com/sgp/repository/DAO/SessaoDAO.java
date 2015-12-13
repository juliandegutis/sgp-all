package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sgp.util.Constants;

public class SessaoDAO {
	
	public boolean save( String nome ) {
		Connection con = null; 
		boolean retorno = false;
		try { 
			con = getConnection(); 
			PreparedStatement pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_SESSAO ); 
			pstmt.setString(1, nome);
			retorno = pstmt.execute(); } 
		catch (SQLException e) { 
			e.printStackTrace(); 
		} 
		finally { 
			closeConnnection(con); 
		} 
		return retorno;
	}
	
	public String findSessionByClient() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_SESSAO );
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				return rs.getString("NM_USUARIO");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			closeConnnection(con); 
		} 
		
		return null;
	}
	
	public Connection getConnection() throws SQLException { 
		Connection con = null; 
		con = DriverManager .getConnection("jdbc:postgresql://localhost/guiamed?user=postgres&password=admin"); 
		return con;
	} 
	
	public void closeConnnection(Connection con) { 
		try { 
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
