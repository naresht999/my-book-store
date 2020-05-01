package in.naresh.thangallapalli.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.naresh.thangallapalli.onlinebookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
