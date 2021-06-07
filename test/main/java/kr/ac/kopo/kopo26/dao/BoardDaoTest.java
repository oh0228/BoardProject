package kr.ac.kopo.kopo26.dao;

import kr.ac.kopo.kopo26.dao.BoardDao;
import kr.ac.kopo.kopo26.dao.BoardDaoImpl;
import kr.ac.kopo.kopo26.domain.Board;

public class BoardDaoTest {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setId(1);
		board.setTitle("abcd");
		
		BoardDao boardDao = new BoardDaoImpl();
		boardDao.create(board);
		
	}
}
