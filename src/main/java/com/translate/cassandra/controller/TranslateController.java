package com.translate.cassandra.controller;


import com.translate.cassandra.model.Translate;
import com.translate.cassandra.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class TranslateController {

    @Autowired
    TranslateRepository translateRepository;

    @GetMapping("/translate")
    Flux<Translate> getList() {
        return translateRepository.findAll();
    }

    @PostMapping("/translate")
    Mono<Translate> save(@RequestBody Translate translate) {
        return translateRepository.save(translate);
    }
}
