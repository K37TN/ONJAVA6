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
@Table(name = "sach")

public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ma;
    private String ten;
    private Integer soTrang;
    private Double donGia;
    @ManyToOne
    @JoinColumn(name = "id_nxb")
    private Nxb nxb;
}
