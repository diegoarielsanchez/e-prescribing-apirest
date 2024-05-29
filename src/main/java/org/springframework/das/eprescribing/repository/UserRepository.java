package org.springframework.das.eprescribing.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.das.eprescribing.model.User;

public interface UserRepository {

    void save(User user) throws DataAccessException;
}
