package vue.sb.lg.entity;

public class Book {
	private String id;
	private String cover;
	private String title;
	private String author;
	private String date;
	private String press;
	private String abs;
	
	
	public Book() {
		super();
	}
	public Book(String id, String cover, String title, String author, String date, String press, String abs) {
		super();
		this.id = id;
		this.cover = cover;
		this.title = title;
		this.author = author;
		this.date = date;
		this.press = press;
		this.abs = abs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", cover=" + cover + ", title=" + title + ", author=" + author + ", date=" + date
				+ ", press=" + press + ", abs=" + abs + "]";
	}
	
	
	
}
