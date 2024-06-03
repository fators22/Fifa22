package com.forsun.fifa;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("countries")
public class Country {
    @Id
    private String _id;
    private String name;
    private String alpha2;
    private String flag;
    private String alpha3;
    private int countryCode;
    private String iso31662;
    private String region;
    private String subRegion;
    private String intermediateRegion;
    private int regionCode;
    private int subRegionCode;
}
