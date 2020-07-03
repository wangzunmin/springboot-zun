package vue.sb.lg.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vue.sb.lg.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findByTitle(String title);
	List<Book> findByCid(String cid);
}
