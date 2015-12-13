package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sgp.repository.model.ReuniaoTO;

import br.com.sgp.util.Constants;

public class ReuniaoDAO {
	
	public Long buscaReunioesPendentes( Long idRecurso ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_REUNIOES_PENDENTES );
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
	
	public ArrayList< ReuniaoTO > buscaReunioes( Long idRecurso ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_REUNIOES );
			pstmt.setLong( 1, idRecurso );
			
			rs = pstmt.executeQuery();
			
			ArrayList< ReuniaoTO > listReuniao = new ArrayList< ReuniaoTO >();
			
			while( rs.next() ) {
				
				ReuniaoTO to = new ReuniaoTO();
				to.setIdReuniao(rs.getLong("ID_REUNIAO"));
				to.setIdProjeto(rs.getLong("ID_PROJETO"));
				to.setIdRecurso(rs.getLong("ID_RECURSO"));
				to.setDtInicio(rs.getDate("DT_INICIO"));
				to.setVlHoras(rs.getLong("VL_HORAS"));
				to.setNmLocal(rs.getString("NM_LOCAL"));
				to.setDtHorario(rs.getString("DT_HORARIO"));
				to.setNmProjeto(rs.getString("NM_PROJETO"));
				to.setStatus(rs.getLong("FL_STATUS"));
				
				listReuniao.add(to);
			}
			
			return listReuniao;
			
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
