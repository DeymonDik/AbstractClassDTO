package org.example.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.models.AnimalAbstractClass;
import org.example.services.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/abstract")
@RestController
@RequiredArgsConstructor
@Tag(name = "Животные", description = "Медведь, Волк и Лиса")
public class AnimalRestController {

    private final AnimalService animalService;

    @PostMapping("/animal")
    @Operation(summary = "Выполняет запрос и возвращает ответ")
    public ResponseEntity<AnimalAbstractClass> send(@RequestBody AnimalAbstractClass request) {
        return animalService.send(request);
    }

}
