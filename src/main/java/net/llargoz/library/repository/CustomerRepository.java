package net.llargoz.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.llargoz.library.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}