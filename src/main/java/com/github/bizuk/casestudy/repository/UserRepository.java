package com.github.bizuk.casestudy.repository;
import com.github.bizuk.casestudy.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository <User, UUID> {
}
