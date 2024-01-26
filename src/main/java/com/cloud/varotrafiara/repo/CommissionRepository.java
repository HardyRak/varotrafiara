package com.cloud.varotrafiara.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.varotrafiara.model.Commission;
import java.util.Date;


public interface CommissionRepository extends JpaRepository<Commission,Long>{
    List<Commission> findByIdCommision(Long idCommision);
    List<Commission> findByDateComission(Date dateComission);
}
