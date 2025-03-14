package com.tripplannerai.entity.address;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "area_code")
    private String areaCode;
    @Column(name = "sigungu_code")
    private String sigunguCode;
    private String name;

}
