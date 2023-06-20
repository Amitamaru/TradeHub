package com.marzhiievskyi.tradehubproject.domain;

import com.marzhiievskyi.tradehubproject.domain.constants.Permission;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


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
