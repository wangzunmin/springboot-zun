package vue.sb.lg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vue.sb.lg.dao.BookRepository;
import vue.sb.lg.entity.Book;

/**
 * 部署前后端分离：
 * 	wj-vue前端代码npm build命令生成dist文件夹，将文件夹下的文件复制至nginx下的html
 * 目录下；修改配置文件nginx.conf,启动即可；
 *  springboot后端代码打jar包，java -jar xxx.jar启动
 *
 * @author wangzunmin
 *
 */
@Controller
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	
//	@CrossOrigin // 跨域支持  MyWebConfigurer.addCorsMappings全局生效
	@RequestMapping("api/books")
	@ResponseBody
	public List<Book> books(){
		List<Book> books = bookRepository.findAll();
		return books;
	}
	
	
	
	
//	@CrossOrigin // 跨域支持
	@RequestMapping("api/search")
	@ResponseBody
	public List<Book> search(@RequestParam("keywords")String input){
		List<Book> books = bookRepository.findByTitle(input);
		return books;
	}
	
	
//	@CrossOrigin // 跨域支持 
	@RequestMapping("api/categories/{cid}/books")
	@ResponseBody
	public List<Book> categories(@PathVariable("cid")String cid){
		List<Book> all = null;
		if("0".equals(cid)) {
			all = bookRepository.findAll();
		}else {
			all = bookRepository.findByCid(cid);
		}
		return all;
	}
	
	
	@PostMapping("api/add")
	@ResponseBody
	public String add(@RequestBody Book book) {
		Book save = bookRepository.save(book);
		System.out.println(save);
		return "1";
	}
	
	
	@RequestMapping("api/delete/{id}/books")
	@ResponseBody
	public String categories(@PathVariable("id")Integer id){
		bookRepository.delete(id);
		return "1";
	}
	
	/**
	 * 分页查询
	 * @param pageSize
	 * @param currentPage
	 * @param book
	 * @return
	 */
	@PostMapping("api/pageBooks")
	@ResponseBody
	public Page<Book> pageBooks(Integer pageSize, Integer currentPage, Book book){
		Page<Book> list = null;
		Pageable page = new PageRequest(currentPage-1, pageSize);
		if("".equals(book.getTitle())) {
			book.setTitle(null);
		}
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("title", ExampleMatcher.GenericPropertyMatchers.contains());//模糊匹配
		if("0".equals(book.getCid())) {
			exampleMatcher = exampleMatcher.withIgnorePaths("cid");//忽略属性
		}
		Example<Book> example = Example.of(book, exampleMatcher);
		list = bookRepository.findAll(example, page); //分页带查询条件
		return list;
	}


}
