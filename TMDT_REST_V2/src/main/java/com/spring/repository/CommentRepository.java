package com.spring.repository;

import java.util.List;
import java.util.Optional;

import com.spring.domain.Comment;

public interface CommentRepository {
	public List<Comment> getCommentByLessonID(String lessonID);
	
	public Optional<Comment>getCommentBycommentID(String commentID);
	
	public int deleteCommentByCommentID(String commentID);
	
	public int updateCommentContent(String commentID,String commentContent);
	
	public int updateCommentStatut(String commentID,int commentStatut);
	
}
