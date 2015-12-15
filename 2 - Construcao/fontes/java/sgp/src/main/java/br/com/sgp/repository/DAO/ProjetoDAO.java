package br.com.sgp.repository.DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.sgp.repository.model.HorasTO;
import br.com.sgp.repository.model.ProjetoTO;
import br.com.sgp.repository.model.RecursoTO;
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
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
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
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		
		return null;
	}
	
	public ArrayList< HorasTO > buscaHorasLancadas( ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_HORAS_RECURSO );
			
			rs = pstmt.executeQuery();
			
			ArrayList< HorasTO > listaHoras = new ArrayList< HorasTO >();
			
			while( rs.next() ) {
				HorasTO to = new HorasTO();
				to.setIdProjeto(rs.getLong("ID_PROJETO"));
				to.setNmProjeto(rs.getString("NM_PROJETO"));
				to.setDtLanc(rs.getString("DT_LANCAMENTO"));
				to.setVlHora(rs.getLong("VL_HORAS"));
				to.setNmRecurso(rs.getString("NM_RECURSO"));
				
				listaHoras.add(to);
			}
			
			return listaHoras;
			
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
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
			
			while( rs.next() ) {
				ProjetoTO to = new ProjetoTO();
				to.setIdProjeto(rs.getLong("ID_PROJETO"));
				to.setNmProjeto(rs.getString("NM_PROJETO"));
				to.setDtInicio(rs.getString("DT_INICIO"));
				to.setDtFim(rs.getString("DT_FIM"));
				to.setVlHoras(rs.getLong("VL_HORAS"));
				
				listaProjeto.add(to);
			}
			
			return listaProjeto;
			
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		
		return null;
	}
	
	public ArrayList< ProjetoTO > buscaProjetosRecurso( Long idRecurso ) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = getConnection();
			
			pstmt = con.prepareStatement( Constants.SCRIPT_SELECT_PROJETOS_RECURSO );
			pstmt.setLong(1, idRecurso);
			rs = pstmt.executeQuery();
			
			ArrayList< ProjetoTO > listaProjeto = new ArrayList< ProjetoTO >();
			
			while( rs.next() ) {
				ProjetoTO to = new ProjetoTO();
				to.setIdProjeto(rs.getLong("ID_PROJETO"));
				to.setNmProjeto(rs.getString("NM_PROJETO"));
				to.setDtInicio(rs.getString("DT_INICIO"));
				to.setDtFim(rs.getString("DT_FIM"));
				to.setVlHoras(rs.getLong("VL_HORAS"));
				
				listaProjeto.add(to);
			}
			
			return listaProjeto;
			
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			closeStatement( pstmt );
			closeResultSet( rs );
			closeConnection( con );
		}
		
		return null;
	}
	
	public boolean lancarHoras( Long idProjeto, Long idRecurso, String dataLanc, Long horasLanc ) {
		Connection con = null; 
		boolean retorno = false;
		try { 
						
			con = getConnection(); 
			
			PreparedStatement pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_HORAS ); 
			pstmt.setLong(1, idProjeto);
			pstmt.setLong(2, idRecurso); 
			pstmt.setString(3, dataLanc);
			pstmt.setLong(4, horasLanc);
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
	
	public boolean save( String nmProjeto, String dtInicio ) throws ParseException {
		Connection con = null; 
		boolean retorno = false;
		try { 
						
			con = getConnection(); 
			
			PreparedStatement pstmt = con.prepareStatement( Constants.SCRIPT_INSERT_PROJETO ); 
			pstmt.setString(1, nmProjeto);
			pstmt.setString(2, dtInicio ); 
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
