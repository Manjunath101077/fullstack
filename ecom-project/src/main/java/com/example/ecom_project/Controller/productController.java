package com.example.ecom_project.Controller;

import com.example.ecom_project.Model.productModel;
import com.example.ecom_project.Service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class productController {

    @Autowired
    productService service;


    @GetMapping("/products")
    public ResponseEntity<List<productModel>> getAllProduct(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }
    @PostMapping("/product")
    public ResponseEntity<?> addProducts(@RequestBody productModel products){

    try{
        productModel productdeatil=service.addProduct(products);
        return  new ResponseEntity<>(productdeatil,HttpStatus.CREATED);
    }catch(Exception e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

    }
    }

    @GetMapping("/product/{id}")

        public ResponseEntity<productModel> getProductDetails(@PathVariable int id){

        productModel product=service.getProductDetailsByid(id);
        if(product != null){
        return new ResponseEntity<>(product,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
