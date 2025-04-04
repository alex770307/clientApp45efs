package org.clientapp45efs.repository;

import org.clientapp45efs.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {

    Client add(Client client);

    List<Client> findAll();

    Optional<Client> findById(int id);

    List<Client> findByName(String name);

    Optional<Client> findByEmail(String email);

    Optional<Client> deleteById(int id);

}
