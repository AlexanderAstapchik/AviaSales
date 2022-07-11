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
@Table(name="arrivalPoint")
public class ArrivalPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ArrivalPoint")
    private Long idArrivalPoint;

    @ManyToOne
    @JoinColumn(name = "ID_COUNTRY")
    private Country country;

    private String cityArrival;

    private String streetArrival;

    private String houseArrival;
}
