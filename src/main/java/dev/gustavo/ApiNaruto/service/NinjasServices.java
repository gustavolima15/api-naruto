package dev.gustavo.ApiNaruto.service;

import dev.gustavo.ApiNaruto.model.Ninjas;
import dev.gustavo.ApiNaruto.repository.NinjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NinjasServices {
    /*TODO: Refatorar a instância*/
    @Autowired
    private NinjasRepository repository;

    public Ninjas addNinja(Ninjas ninja) {
        return repository.save(ninja);
    }
}
