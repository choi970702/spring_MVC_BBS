package com.ict.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ict.vo.BVO;
import com.ict.vo.CVO;

@Repository
public class MyDAOImpl implements MyDAO
{

	@Override
	public int selectCount() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BVO> selectBVOList(int begin, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBVO(BVO bvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBVOHit(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BVO selectBVOOneList(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectPwdchk(BVO bvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCVOComm_All(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBVO(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBVO(BVO bvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CVO> selectCVOList(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCVO(CVO cvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCVO(String c_idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
