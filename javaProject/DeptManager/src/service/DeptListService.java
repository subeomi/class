package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptListService {

	DeptDao dao;

	public DeptListService(DeptDao dao) {
		super();
		this.dao = dao;
	}

	public List<Dept> getDeptList() {

		Connection conn = null;
		List<Dept> list = null;

		// Connection 객체 구하기
		try {
//			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//			conn = DriverManager.getConnection(dbUrl, "hr", "tiger");

			conn = ConnectionProvider.getConnection();
			
			// 트랜잭션 시작
			conn.setAutoCommit(false);

			// insert(conn)
			// update(conn)
			// select(conn)
			// update(conn)
			// insert(conn)

			list = dao.selectByAll(conn);
			
			
			// commit
			conn.commit();

		} catch (SQLException e) {
			// 예외 발생 -> rollback
			if(conn != null) {
				try {
					conn.rollback();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		
		DeptListService listService = new DeptListService(new DeptDao());
		
		List<Dept> list = listService.getDeptList();
		
		for(Dept d : list) {
			System.out.println(d);
		}
		
	}
	
	
}
