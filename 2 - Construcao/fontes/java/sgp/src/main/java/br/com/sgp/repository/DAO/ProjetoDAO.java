package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.sgp.repository.model.ProjetoTO;

import br.com.sgp.util.Constants;

public class ProjetoDAO {
	
	public Long buscaProjetosFinalizados( Long idRecurso ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_PROJETOS_FINALIZADOS );
			pstmt.setLong( 1, idRecurso );
			
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				return rs.getLong("COUNT");
			}
			
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Long buscaProjetosPendentes( Long idRecurso ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_PROJETOS_PENDENTES );
			pstmt.setLong( 1, idRecurso );
			
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				return rs.getLong("COUNT");
			}
			
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public ArrayList< ProjetoTO > buscaProjetos() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_PROJETOS );
			
			rs = pstmt.executeQuery();
			
			ArrayList< ProjetoTO > listaProjeto = new ArrayList< ProjetoTO >();
			
			if( rs.next() ) {
				ProjetoTO to = new ProjetoTO();
				to.setIdProjeto(rs.getLong("ID_PROJETO"));
				to.setNmProjeto(rs.getString("NM_PROJETO"));
				
				listaProjeto.add(to);
			}
			
			return listaProjeto;
			
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Connection getConnection() throws SQLException { 
		Connection con = null; 
		con = DriverManager .getConnection("jdbc:postgresql://localhost/sgpprd?user=postgres&password=admin"); 
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
