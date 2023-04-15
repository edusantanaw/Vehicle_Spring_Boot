package com.vehicles.vehicles.domain.usecases;

import java.util.UUID;

public interface ILoadById <T>{
    T load(UUID id);
}
