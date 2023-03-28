package com.websystem.datortehnika.repository;

import com.websystem.datortehnika.model.Pieprasijumi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PieprasijumiRepository extends JpaRepository <Pieprasijumi, Integer> {
}
