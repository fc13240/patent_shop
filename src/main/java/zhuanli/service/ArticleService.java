package zhuanli.service;

import java.util.List;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleComment;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.User;
import zhuanli.domain.Vote;


public interface ArticleService {
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

	List<ArticleComment> getArticleCommentsById(int articleId);
	
<<<<<<< HEAD
	List<Article> articleOrderByCommentsShow();
	List<Article> getArticleByRand();
=======
>>>>>>> 9750c636d383c397045055237a8ae94d974ae463
}
