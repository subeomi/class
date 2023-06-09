package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import util.ConnectionProvider;

public class DeptDeleteService {
	
	DeptDao dao;

	// 싱글톤 시작
	private DeptDeleteService() {
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptDeleteService service = new DeptDeleteService();
	
	public static DeptDeleteService getInstance() {
		return service;
	}
	// 싱글톤 종료
	
	
	public int deleteDept(int deptno) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			result = dao.deleteDeptByDeptno(conn, deptno);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return result;
		
	}
	
	
	

}