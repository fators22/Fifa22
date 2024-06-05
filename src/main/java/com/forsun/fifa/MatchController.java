package com.forsun.fifa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private MatchService mservice;
    private String Files="static.json";

    @GetMapping("/display")
    public List<Matches> getAllMatch(){
        saveMatchesToFile(mservice.findAllMatches());
        return  mservice.findAllMatches();

    }
    @GetMapping("/all")
    public List<Team> getAllTeams(){
       return mservice.play();

    }

    @GetMapping("/group/{gname}")
    public String getWinnerByGroup(@PathVariable String gname){
        return "";
    }

    @GetMapping("/group-winners")
    public String getGroupWinners(){
        return "group winners works";
    }

    @GetMapping("/overall-winner")
    public String getOverallWinner(){
        return "";
    }
    // Method to save matches to a JSON file using FileWriter
    private void saveMatchesToFile(List<Matches> matches) {
        ObjectMapper objectMapper = new ObjectMapper();
        try (FileWriter fileWriter = new FileWriter(Files)) {
            objectMapper.writeValue(fileWriter, matches);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
