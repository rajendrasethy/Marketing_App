package com.marketing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.marketing.entities.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead , Long> {

}
