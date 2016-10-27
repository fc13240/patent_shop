package zhuanli.service;

import java.util.List;

<<<<<<< HEAD
import zhuanli.domain.Article;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;


public interface ArticleService {
	List<Article> getArticleShow();
	
	Article getUserArticleById(int userId);
	
	List<Article> getAllArticle(Page page);
	
	List<ArticleType> getAllArticleTypes();
	
	int getAllArticleCount();
	
	List<Article> articleShow();
=======
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import zhuanli.domain.Article;
import zhuanli.domain.ArticleImg;
import zhuanli.domain.ArticleSearchCondition;
import zhuanli.domain.ArticleType;
import zhuanli.domain.Page;
import zhuanli.domain.UserArticle;
import zhuanli.domain.Vote;



public interface ArticleService {
	UserArticle getUserArticleByPage(Page page,HttpSession session);
	
	UserArticle searchUserArticleByPage(ArticleSearchCondition articleSearchCondition,HttpSession session);

	List<ArticleType> getAllArticleTypes();
	
	void auditArticle(Article article);
	
	Article getUserArticleById(int id);
	
	void addArticleType(String keyword);

	void deleteArticleType(int typeId);

	void updateArticleType(int typeId, String typeName);

	void deleteArticle(int articleId);
	
	void insertArticle(Article article);
	
	void updateArticle(Article article);
	
	void insertArticleImage(ArticleImg articleImg,MultipartFile multipartFile);
	
	Vote getUpVoteAndDownVote(int id);
	
	void praise(Article article);
	
	void slander(Article article);
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
}
