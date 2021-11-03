package pl.kapalka.airmanager.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Compressor {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="compressor_id")
    private Long id;
    private String compressorName;
    private String serialNumber;
    private Float hourEfficiency;  //wydajność w m3/min
    private Float energyEfficiency; //wydajność w m3/kWh
    private Integer yearOfManufacture;

}

