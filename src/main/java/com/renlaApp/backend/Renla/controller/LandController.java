package com.renlaApp.backend.Renla.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.renlaApp.backend.Renla.model.Land;
import com.renlaApp.backend.Renla.repository.LandRepository;
import com.renlaApp.backend.Renla.service.LandService;

@RestController
public class LandController {
	
	@Autowired
	LandService  landService;
	
	@Autowired
	private LandRepository landRepository;
	
	@CrossOrigin(origins = "file:///home/lubowa/demo%20site/index.html")
	@GetMapping("/land")
    public Page<Land> getQuestions(Pageable pageable) {
        return landRepository.findAll(pageable);
    }


    @PostMapping("/land")
    public Land createQuestion(@Valid @RequestBody Land land) {
        return landRepository.save(land);
    }

}
