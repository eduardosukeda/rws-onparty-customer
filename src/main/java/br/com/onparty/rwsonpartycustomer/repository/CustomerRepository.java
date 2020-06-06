package br.com.onparty.rwsonpartycustomer.repository;

import br.com.onparty.rwsonpartycustomer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}