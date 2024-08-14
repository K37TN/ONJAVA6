package com.example.bailam.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class SachRepose {
    @Id
    private Integer id;
    private String ma;
    private String ten;
    private Integer soTrang;
    private Double donGia;
    private String tenxb;
}
