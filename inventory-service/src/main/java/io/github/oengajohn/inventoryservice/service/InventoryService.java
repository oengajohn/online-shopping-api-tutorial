package io.github.oengajohn.inventoryservice.service;

import java.util.List;

import io.github.oengajohn.inventoryservice.model.InventoryCreateDto;
import io.github.oengajohn.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

    Boolean checkInventory(List<String> productCodes, List<Integer> productQuantities);
    
}
