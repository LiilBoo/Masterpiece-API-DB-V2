package com.nandaparbat.SaasSportClubAPI.controllers;

import com.nandaparbat.SaasSportClubAPI.DTOs.FormatDTO;
import com.nandaparbat.SaasSportClubAPI.entities.Format;
import com.nandaparbat.SaasSportClubAPI.services.FormatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formats")
@RequiredArgsConstructor
public class FormatController {

    private final FormatService formatService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<FormatDTO> allFormats(){
        return formatService.findAllProjectedBy();
    };

    @GetMapping("/by-id")
    @ResponseStatus(HttpStatus.OK)
    public List<FormatDTO> findFormatById(@RequestParam("id") Long id) {
        return formatService.findFormatById(id);
    };

    @GetMapping("/formatname")
    @ResponseStatus(HttpStatus.OK)
    public List<FormatDTO> findAllByNameEquals(@RequestParam("formatname") String formatName) {

        return formatService.findAllByNameEquals(formatName);
    };

};
