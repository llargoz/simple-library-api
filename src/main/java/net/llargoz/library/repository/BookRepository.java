package net.llargoz.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.llargoz.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
}