package com.techgustarodrigues.register.address.feign;

import com.techgustarodrigues.register.address.model.dto.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface AddressFeign {

    @GetMapping("{cep}/json")
    Address getAddressCep(@PathVariable("cep") String cep);
}
