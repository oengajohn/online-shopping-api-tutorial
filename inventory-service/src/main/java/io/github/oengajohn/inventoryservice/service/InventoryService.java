package io.github.oengajohn.inventoryservice.service;

import io.github.oengajohn.inventoryservice.model.InventoryCreateDto;
import io.github.oengajohn.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);
    
}
