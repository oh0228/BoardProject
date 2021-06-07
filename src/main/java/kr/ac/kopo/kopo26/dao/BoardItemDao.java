package kr.ac.kopo.kopo26.dao;

import java.util.List;

import kr.ac.kopo.kopo26.domain.BoardItem;

public interface BoardItemDao {
	
	void create(BoardItem boarditem);
	BoardItem selectOne(int id);
	List<BoardItem> selectAll();
	void update(BoardItem boarditem);
	void delete(BoardItem boarditem);
}
