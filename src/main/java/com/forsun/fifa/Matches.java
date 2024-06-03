package com.forsun.fifa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("matches")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Matches {
    @Id
    private String _id;
    private int match;
    private String team;
    private String opponent;
    private int ps1;
    private int ops1;
    private int pcs;
    private int goals;
    private int goalsop;
    private String date;
    private String hour;
    private String category;
}
