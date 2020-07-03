package vue.sb.lg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_book")
public class Book {
	@Id	//主键id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//主键生成策略
	@Column(name="id")//数据库字段名
	private Integer id;
	
	@Column(name="cover")
	private String cover;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="date")
	private String date;
	
	@Column(name="press")
	private String press;
	
	@Column(name="abs")
	private String abs;
	
	@Column(name="cid")
	private String cid;//类别
	
	
	public Book() {
		super();
	}
	public Book(Integer id, String cover, String title, String author, String date, String press, String abs) {
		super();
		this.id = id;
		this.cover = cover;
		this.title = title;
		this.author = author;
		this.date = date;
		this.press = press;
		this.abs = abs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getAbs() {
		return abs;
	}
	public void setAbs(String abs) {
		this.abs = abs;
	}
	
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", cover=" + cover + ", title=" + title + ", author=" + author + ", date=" + date
				+ ", press=" + press + ", abs=" + abs + "]";
	}
	
	
	
}
