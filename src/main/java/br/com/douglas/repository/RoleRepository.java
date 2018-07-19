package br.com.douglas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.douglas.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

}
