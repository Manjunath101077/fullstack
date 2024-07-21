package com.example.ecom_project.Service;

import com.example.ecom_project.Model.productModel;
import com.example.ecom_project.Reopistary.productRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class productService {

    @Autowired
    productRepo repo;

    public List<productModel> getAllProducts() {
     return repo.findAll();
    }

    public productModel getProductDetailsByid(int id) {
    return repo.findById(id).orElse(null);
    }

    public productModel addProduct(productModel products) {
//        products.setImageName(imageFile.getOriginalFilename());
//        products.setImageType(imageFile.getContentType());
//        products.setImageDate(imageFile.getBytes());
        return repo.save(products);
    }

}
