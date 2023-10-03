package com.samseen.servicesupplychain.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "permissions")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Data
public class Permission {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
