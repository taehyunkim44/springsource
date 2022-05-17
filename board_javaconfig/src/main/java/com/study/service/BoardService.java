package com.study.service;

import java.util.Date;
import java.util.List;

import com.study.dto.AttachDTO;
import com.study.dto.BoardDTO;
import com.study.dto.Criteria;

public interface BoardService {
	public List<BoardDTO> getList(Criteria cri);
	public void insert(BoardDTO insertDto);
	public BoardDTO getRow(int bno);
	public boolean update(BoardDTO updateDto);
	public boolean delete(int bno);
	public int getTotalCnt(Criteria cri);
	
	//첨부파일
	public List<AttachDTO> attachList(int bno);
}
