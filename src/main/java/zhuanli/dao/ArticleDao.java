package zhuanli.dao;

import java.util.List;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.Vote;



public interface ArticleDao {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();

	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
	
	void addArticleComment(String content, int articleId, int userId);

	User checkUser(String username, String password);
	
	List<ArticleComment> getArticleCommentsById(int articleId);
}