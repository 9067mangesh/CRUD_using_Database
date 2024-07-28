package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.model.Models;
import com.crud.demo.repository.ModelRepository;

@Service
public class ModelService {

	@Autowired
    private ModelRepository modelRepository;

    public List<Models> getAllModels() {
        return modelRepository.findAll();
    }

    public Optional<Models> getModelsById(int id) {
        return modelRepository.findById(id);
    }

    public Models createModel(Models models) {
        return modelRepository.save(models);
    }

    public Models updateModels(int id, Models modelDetails) {
        Models models = modelRepository.findById(id).orElseThrow(() -> new RuntimeException("Item not found"));
        models.setName(modelDetails.getName());
        models.setDescription(modelDetails.getDescription());
        return modelRepository.save(models);
    }

    public void deleteModels(int id) {
    	modelRepository.deleteById(id);
    }
}
