package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "admins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Admin extends BaseEntity{

    @Column(name = "is_super_admin")
    private Boolean isSuperAdmin;

    private String email;
    private String password;
    private String name;
    private String description;

    @Column(name = "mob_no")
    private String mobileNumber;

    @Lob
    private byte[] photo;

    @Column(name = "created_at")
    private LocalDate createdAt;

}