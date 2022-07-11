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
@Table(name="pointOfDeparture")
public class PointOfDeparture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PointOfDep")
    private Long idPointOfDeparture;

    @ManyToOne
    @JoinColumn(name = "ID_COUNTRY")
    private Country country;

    private String cityDeparture;

    private String streetDeparture;

    private String houseDeparture;

}
