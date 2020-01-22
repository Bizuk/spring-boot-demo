package com.github.bizuk.casestudy.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {
    @Id
    private UUID user = UUID.randomUUID();
    private String userName;
}
