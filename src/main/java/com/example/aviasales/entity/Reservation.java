package com.example.aviasales.entity;

import com.example.aviasales.util.LocalDateAttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Reservation")
    private Long idReservation;

    @ManyToOne
    @JoinColumn(name ="Id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_COUNTRY")
    private Country country;

    @ManyToOne
    @JoinColumn(name ="ID_PointOfDep")
    private PointOfDeparture pointOfDeparture;

    @ManyToOne
    @JoinColumn(name = "ID_ArrivalPoint")
    private ArrivalPoint arrivalPoint;

    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate arrivalDate;

    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate departureDate;

    private Double totalCost;
}
