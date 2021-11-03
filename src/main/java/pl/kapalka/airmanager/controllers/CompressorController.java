package pl.kapalka.airmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kapalka.airmanager.entities.Compressor;
import pl.kapalka.airmanager.repositories.CompressorRepository;


@RestController

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/compressor")

public class CompressorController {

    @Autowired
    CompressorRepository compressorRepository;

    @GetMapping("/all")
    public Iterable<Compressor> getAllCompressors() {
        return compressorRepository.findAll();
    }

    @PostMapping("/add")
    public Compressor addCompressor(@RequestBody Compressor compressor) { return compressorRepository.save(compressor); }

}
