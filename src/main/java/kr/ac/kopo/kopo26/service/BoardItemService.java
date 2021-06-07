package kr.ac.kopo.kopo26.service;

import java.util.List;

import kr.ac.kopo.kopo26.domain.BoardItem;

public interface BoardItemService {

	void create(BoardItem boarditem);
	BoardItem selectOne(int id);
	List<BoardItem> selectAll();
	void update(BoardItem boarditem);
	void delete(BoardItem boarditem);
}
