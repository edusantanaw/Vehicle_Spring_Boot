package com.vehicles.vehicles.data.protocols;

import java.util.UUID;

public interface ILoadByIdRepository <T>{
   T findById(UUID id);
}
