package com.vehicles.vehicles.data.usecases;

import com.vehicles.vehicles.data.protocols.ILoadByIdRepository;
import com.vehicles.vehicles.domain.usecases.ILoadById;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service()
@AllArgsConstructor
public class LoadById<T> implements ILoadById<T> {
    private final ILoadByIdRepository<T> repository;
    public T load(UUID id) {
        return this.repository.findById(id);
    }
}
