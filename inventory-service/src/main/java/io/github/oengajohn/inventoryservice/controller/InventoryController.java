package io.github.oengajohn.inventoryservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.oengajohn.inventoryservice.model.GenericResponse;
import io.github.oengajohn.inventoryservice.model.InventoryCreateDto;
import io.github.oengajohn.inventoryservice.model.InventoryResponse;
import io.github.oengajohn.inventoryservice.service.InventoryService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("api/inventory")
@RestController
@Slf4j
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("create")
    @ResponseStatus(code = HttpStatus.CREATED)
    public GenericResponse<InventoryResponse> create(@RequestBody InventoryCreateDto inventoryCreateDto) {
        return GenericResponse.<InventoryResponse>builder()
                .data(inventoryService.createInventory(inventoryCreateDto))
                .success(true)
                .msg("Inventory saved successfully")
                .build();
    }

    @GetMapping("check")
    @ResponseStatus(code = HttpStatus.OK)
    public GenericResponse<Boolean> checkInventory(
            @RequestParam(name = "productCodes") List<String> productCodes,
            @RequestParam(name = "productQuantities") List<Integer> productQuantities) {

        log.info("{}",productCodes);       
        log.info("{}",productQuantities);       
        return GenericResponse.<Boolean>builder()
                .data(inventoryService.checkInventory(productCodes, productQuantities))
                .success(true)
                .msg("Inventory exists/enough")
                .build();
    }

}
