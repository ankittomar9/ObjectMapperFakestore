package com.company.objectmapperfakestore.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class Category extends BaseModel {
    private String name;
    private String description;
    private List<Product> products;


}
