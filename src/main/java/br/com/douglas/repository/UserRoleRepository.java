package br.com.douglas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.douglas.model.UserRole;

public interface UserRoleRepository extends MongoRepository<UserRole, String> {

}
