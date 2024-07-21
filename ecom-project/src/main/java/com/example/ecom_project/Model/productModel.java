package com.example.ecom_project.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class productModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
//    private Date realaseDate;
    private boolean available;
    private int quanttiy;

//    private String imageName;
//    private String imageType;
//
//    @Lob
//    private byte[] imageDate;
//
//    public String getImageName() {
//        return imageName;
//    }
//
//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }

//    public String getImageType() {
//        return imageType;
//    }

//    public void setImageType(String imageType) {
//        this.imageType = imageType;
//    }
//
//    public byte[] getImageDate() {
//        return imageDate;
//    }
//
//    public void setImageDate(byte[] imageDate) {
//        this.imageDate = imageDate;
//    }
}