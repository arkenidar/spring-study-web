
package com.arkenidar.springstudyweb.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom query methods if needed
}
