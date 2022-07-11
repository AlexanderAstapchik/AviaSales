package com.example.aviasales.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="flights")
public class Flight {
    @Id
    @Column(name = "ID_Flight")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFlight;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PointOfDep")
    private PointOfDeparture pointOfDeparture;

    private String description;
}
