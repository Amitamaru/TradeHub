package com.marzhiievskyi.tradehubproject.dao;


import com.marzhiievskyi.tradehubproject.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDAO extends JpaRepository<Client, Long> {


}
