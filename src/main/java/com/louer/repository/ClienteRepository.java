package com.louer.repository;

import com.louer.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findByRazaoSocial(String razaoSocial);
    Cliente findById(long id);

}
