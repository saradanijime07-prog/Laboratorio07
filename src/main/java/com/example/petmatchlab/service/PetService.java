package com.example.petmatchlab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.petmatchlab.model.Pet;
import com.example.petmatchlab.repository.InMemoryPetRepository;

@Service
public class PetService {

    private final InMemoryPetRepository petRepository;

    public PetService(InMemoryPetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Optional<Pet> findById(long id) {
        return petRepository.findById(id);
    }
}