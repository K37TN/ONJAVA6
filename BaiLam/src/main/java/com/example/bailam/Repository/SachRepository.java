package com.example.bailam.Repository;

import com.example.bailam.Entity.Sach;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SachRepository extends JpaRepository<Sach,Integer> {
    @Transactional
    void deleteByMa(String ma);
}
