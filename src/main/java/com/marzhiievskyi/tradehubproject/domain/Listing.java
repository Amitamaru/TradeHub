package com.marzhiievskyi.tradehubproject.domain;

import com.marzhiievskyi.tradehubproject.domain.constants.Currency;
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
@Table(schema = "trade_hub_db", name = "listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Double price;

    @Enumerated(value = EnumType.STRING)
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private LocalDateTime updated;

    @Column(name = "created_date")
    @CreationTimestamp
    private LocalDateTime created;

}
