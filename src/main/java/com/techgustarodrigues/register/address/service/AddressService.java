package com.techgustarodrigues.register.address.service;

import com.techgustarodrigues.register.address.model.dto.Address;
import com.techgustarodrigues.register.address.model.dto.AddressDto;
import com.techgustarodrigues.register.address.feign.AddressFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressService {

    private final AddressFeign addressFeign;

    public Address execute(AddressDto request) {
        return addressFeign.getAddressCep(request.getCep());
    }
}
