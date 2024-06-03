package com.forsun.fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private MatchService mservice;

    @GetMapping("/display")
    public List<Matches> getAllMatch(){
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

}
