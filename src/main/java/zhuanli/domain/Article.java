package zhuanli.domain;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

<<<<<<< HEAD
=======

>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
public class Article {
	private int id;
	private ArticleType articleType;
	private User user;
	private String keywords;
	private String author;
	private String title;
<<<<<<< HEAD
	private Timestamp createTime;
	@DateTimeFormat(iso=ISO.DATE_TIME,pattern="yyyy-MM-dd HH:mm:ss")
	private Date publishTime;
	@DateTimeFormat(iso=ISO.DATE_TIME,pattern="yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	private String source;
	private String content;
	private String articleAbstract;
	private String smallImgUrl;
	
	
	
	public String getSmallImgUrl() {
		return smallImgUrl;
	}
	public void setSmallImgUrl(String smallImgUrl) {
		this.smallImgUrl = smallImgUrl;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
=======
	@DateTimeFormat(iso=ISO.DATE_TIME,pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	@DateTimeFormat(iso=ISO.DATE_TIME,pattern="yyyy-MM-dd HH:mm:ss")
	private Date publishTime;
	private Timestamp updateTime;
	private String source;
	private String content;
	private String articleAbstract;
	private int checkStatus;
	private int upVote;
	private int downVote;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArticleType getArticleType() {
		return articleType;
	}
	public void setArticleType(ArticleType articleType) {
		this.articleType = articleType;
	}
<<<<<<< HEAD
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
=======
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
<<<<<<< HEAD

	
=======
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getArticleAbstract() {
		return articleAbstract;
	}
	public void setArticleAbstract(String articleAbstract) {
		this.articleAbstract = articleAbstract;
	}
<<<<<<< HEAD
=======
	public int getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}
	public int getUpVote() {
		return upVote;
	}
	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}
	public int getDownVote() {
		return downVote;
	}
	public void setDownVote(int downVote) {
		this.downVote = downVote;
	}
>>>>>>> c14abe23adcc89d40c5718721c4aa2cb5fa03727
	
	
}
