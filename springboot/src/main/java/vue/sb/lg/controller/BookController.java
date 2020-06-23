package vue.sb.lg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vue.sb.lg.entity.Book;

@Controller
public class BookController {
	
	
	private List<Book> indexBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book("1","https://i.loli.net/2019/04/10/5cada7e73d601.jpg"
				,"三体","刘慈欣","2019-05-05","重庆出版社","文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……"));
		books.add(new Book("2","https://i.loli.net/2020/06/11/cuyrZFe8DwMq5Cm.png"
				,"你当像鸟飞往你的山","塔拉 · 韦斯特弗","2019-11","南海出版公司","17岁前从未上过学的女孩，如何成为剑桥大学博士？我们要背叛多少曾经，才能找到真正的自我！《纽约时报》 等数十家媒体一致公推“年度图书”，作者获选《时代周刊》年度影响力人物！这本书比你听说的还要好！"));
		return books;
	}
	
//	@CrossOrigin // 跨域支持  MyWebConfigurer.addCorsMappings全局生效
	@RequestMapping("api/books")
	@ResponseBody
	public List<Book> books(){
		return indexBooks();
	}
	
	
	
	
//	@CrossOrigin // 跨域支持
	@RequestMapping("api/search")
	@ResponseBody
	public List<Book> search(@RequestParam("keywords")String input){
		List<Book> books = new ArrayList<>();
		if("三体".equals(input)) {
			books.add(indexBooks().get(0));
		}else {
			books.addAll(indexBooks());
		}
		return books;
	}
	
	
//	@CrossOrigin // 跨域支持 
	@RequestMapping("api/categories/{cid}/books")
	@ResponseBody
	public List<Book> categories(@PathVariable("cid")String cid){
		List<Book> books = new ArrayList<>();
		if("1".equals(cid)) {
			books.add(indexBooks().get(0));
		}else if("0".equals(cid)) {
			books.addAll(indexBooks());
		}
		return books;
	}
	
	
	@PostMapping("api/add")
	@ResponseBody
	public String add(@RequestBody Book book) {
		
		return "1";
	}


}
