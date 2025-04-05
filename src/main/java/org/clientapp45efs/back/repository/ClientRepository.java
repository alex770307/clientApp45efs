package org.clientapp45efs.back.repository;

import org.clientapp45efs.back.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    Client add(Client client);

    List<Client> findAll();

    Optional<Client> findById(Integer id);

    List<Client> findByName(String name);

    Optional<Client> findByEmail(String email);

    Optional<Client> deleteById(Integer id);

}
