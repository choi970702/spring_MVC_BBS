package com.ict.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ict.vo.BVO;
import com.ict.vo.CVO;

@Service
public class MyServiceImpl implements MyService
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
	public BVO updateBVO_selectBVOOneList(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public int selectPwdchk(BVO bvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BVO selectBVOOneList(String b_idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateBVO(BVO bvo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
