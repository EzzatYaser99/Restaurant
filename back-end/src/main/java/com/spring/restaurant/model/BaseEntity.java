package com.spring.restaurant.model;




import jakarta.persistence.*;

import lombok.*;

@Data // generte getter setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

}
