package com.movieflix.Modules.Category.Entity;


import com.movieflix.Modules.Category.DTO.CreateCategoryDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_categories")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    public Category(CreateCategoryDTO data) {
        this.name = data.name().toUpperCase();
    }

    public void update(String name) {
        this.name = name;
    }
}
