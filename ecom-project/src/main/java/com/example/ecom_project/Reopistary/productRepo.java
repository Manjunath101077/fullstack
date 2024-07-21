package com.example.ecom_project.Reopistary;

import com.example.ecom_project.Model.productModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<productModel,Integer> {
}
