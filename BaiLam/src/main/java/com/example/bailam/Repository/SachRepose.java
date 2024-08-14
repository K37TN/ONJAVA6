package com.example.bailam.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SachRepose extends JpaRepository<com.example.bailam.Entity.SachRepose,Integer> {
    @Query(
            value = "select s.id,s.ma,s.ten,s.so_trang,s.don_gia,xb.ten AS tenxb  from sach s inner Join nxb xb on s.id_nxb = xb.id",nativeQuery = true
    )
    Page<com.example.bailam.Entity.SachRepose> getAll(Pageable pageable);
}
