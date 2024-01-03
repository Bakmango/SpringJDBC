package com.spring.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.spring.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	private SqlSession session;
	public void setSqlSession(SqlSession session) {
		this.session=session;
	}

	@Override
	public List<MemberVO> selectList() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO selectMemberById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	

}
