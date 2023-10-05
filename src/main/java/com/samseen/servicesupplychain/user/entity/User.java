package com.samseen.servicesupplychain.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.samseen.servicesupplychain.enums.Role;
import com.samseen.servicesupplychain.token.entity.Token;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name = "users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "user_name")
    private String userName;
    @JsonIgnore
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_permissions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<Permission> permissions = new HashSet<>();

    @JsonIgnore
    @Column(name = "created_by")
    private String createdBy;

    @JsonIgnore
    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn;
}
