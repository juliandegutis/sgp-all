package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import br.com.sgp.repository.model.RecursoTO;

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
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
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
				to.setDtInicio(rs.getString("DT_INICIO"));
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
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		return null;
	}
	
	public ArrayList< RecursoTO > buscaRecursoPorProjeto( Long idProjeto ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_RECURSO_PROJETO );
			pstmt.setLong( 1, idProjeto );
			
			rs = pstmt.executeQuery();
			
			ArrayList< RecursoTO > listaRecurso = new ArrayList< RecursoTO >();
			
			while( rs.next() ) {
				
				RecursoTO to = new RecursoTO();
				
				to.setIdRecurso(rs.getLong("ID_RECURSO"));
				
				listaRecurso.add(to);
			}
			
			return listaRecurso;
			
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		
		return null;
	}
	
	public boolean save( String nmLocal, String dtInicio, String dtHorario, Long idProjeto ) throws ParseException {
		Connection con = null; 
		boolean retorno = false;
		try { 
						
			con = getConnection(); 
			
			ArrayList<RecursoTO> recursos = buscaRecursoPorProjeto( idProjeto );
			
			for( RecursoTO recurso : recursos ) {
			
				PreparedStatement pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_REUNIAO ); 
				pstmt.setLong(1, idProjeto);
				pstmt.setString(2, dtInicio ); 
				pstmt.setLong(3, recurso.getIdRecurso()); 
				pstmt.setString(4, dtHorario ); 
				pstmt.setString(5, nmLocal);
				retorno = pstmt.execute(); 
				
				closeStatement(pstmt);
			}
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
