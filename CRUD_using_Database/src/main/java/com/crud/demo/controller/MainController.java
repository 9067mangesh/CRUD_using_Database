package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.Models;
import com.crud.demo.service.ModelService;

@RestController
@RequestMapping("/api/model")
public class MainController {

	@Autowired
    private ModelService modelService;

    @GetMapping
    public List<Models> getAllModels() {
        return modelService.getAllModels();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Models> getModelById(@PathVariable int id) {
        return modelService.getModelsById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Models createModel(@RequestBody Models models) {
        return modelService.createModel(models);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Models> updateModels(@PathVariable int id, @RequestBody Models modelDetails) {
        return ResponseEntity.ok(modelService.updateModels(id,modelDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModels(@PathVariable int id) {
    	modelService.deleteModels(id);
        return ResponseEntity.noContent().build();
    }
}
