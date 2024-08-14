package com.example.bailam.Controller;

import com.example.bailam.Entity.Sach;
import com.example.bailam.Entity.SachRepose;
import com.example.bailam.Repository.SachRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class SachController {
    @Autowired
    SachRepository repository;
    @Autowired
    com.example.bailam.Repository.SachRepose sachRepose;

    @GetMapping("/hienthi")
    public List<Sach> show(){
        return repository.findAll();
    }

    @GetMapping("/hienthi2")
    public Page<SachRepose> hienthi(Pageable pageable){

        return sachRepose.getAll(pageable);
    }

    @PostMapping("/add")
    public ResponseEntity them(@RequestBody Sach sach){
Sach save = repository.save(sach);
return ResponseEntity.ok(save);
    }
@DeleteMapping("/delete/{ma}")
    public String delete(@PathVariable String ma){
        repository.deleteByMa(ma);
        return "Xoa thanh Cong";
}
@PutMapping("/update/{id}")
    public ResponseEntity<Sach> update(@PathVariable Integer id,@RequestBody Sach sach){
    Optional<Sach> upsach = repository.findById(id);
    if (upsach.isPresent()){
        Sach sach1 = upsach.get();
        sach1.setMa(sach.getMa());
        sach1.setTen(sach.getTen());
        sach1.setSoTrang(sach.getSoTrang());
        sach1.setDonGia(sach.getDonGia());
        sach1.setNxb(sach.getNxb());
        repository.save(sach1);
       return ResponseEntity.ok(sach1);
    }
    return ResponseEntity.notFound().build();
}
@GetMapping("/detail/{id}")
    public ResponseEntity<Sach> detail(@PathVariable Integer id){
 Optional<Sach> find = repository.findById(id);
 return ResponseEntity.ok(find.get());
    }
    }

