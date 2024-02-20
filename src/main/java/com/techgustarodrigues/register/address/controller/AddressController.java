package com.techgustarodrigues.register.address.controller;

import com.techgustarodrigues.register.address.model.dto.AddressDto;
import com.techgustarodrigues.register.address.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/consulta")
    public ResponseEntity getCep(@RequestBody AddressDto addressDto) {
        return ResponseEntity.ok(addressService.execute(addressDto));
    }
}
