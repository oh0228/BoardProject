package kr.ac.kopo.kopo26.service;

import java.util.List;

import kr.ac.kopo.kopo26.dao.BoardDao;
import kr.ac.kopo.kopo26.dao.BoardDaoImpl;
import kr.ac.kopo.kopo26.domain.Board;

public class BoardServiceImpl implements BoardService {
	
	private BoardDao boardDao = new BoardDaoImpl();

	@Override
	public void create(Board board) {
		boardDao.create(board);
	}

	@Override
	public Board selectOne(int id) {
		return boardDao.selectOne(1);
	}

	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Board board) {
		// TODO Auto-generated method stub
		
	}

}
