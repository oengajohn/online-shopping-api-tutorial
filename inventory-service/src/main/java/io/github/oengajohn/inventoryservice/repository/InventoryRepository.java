package io.github.oengajohn.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.oengajohn.inventoryservice.entity.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory,String>{
    
}
