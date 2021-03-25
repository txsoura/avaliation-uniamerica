package com.uniamerica.avaliation.service;

import com.uniamerica.avaliation.model.Brand;
import com.uniamerica.avaliation.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {
     private final BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Brand save(Brand Brand){
        return brandRepository.save(Brand);
    }

    public List<Brand> findAll(){
        return brandRepository.findAll();
    }

    public Optional<Brand> findOne(long id){
        return  brandRepository.findById(id);
    }

    public Brand update(Brand Brand) {
        Optional<Brand> optionalBrand = this.findOne(Brand.getId());

        if (optionalBrand.isPresent()){
            return this.save(Brand);
        }else {
            return null;
        }
    }

    public void delete(Long id) {
        Optional<Brand> optionalBrand = this.findOne(id);

        if (optionalBrand.isPresent()){
            brandRepository.deleteById(id);
        }
    }
}
