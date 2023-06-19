package com.marzhiievskyi.tradehubproject.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(schema = "trade_hub_db", name = "client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    private String name;

    private String surname;


    private String email;

    @Enumerated(value = EnumType.STRING)
    private Permission permission;

    @Column(name = "registered_date")
    @CreationTimestamp
    private LocalDateTime clientRegistered;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private LocalDateTime clientUpdated;
}
