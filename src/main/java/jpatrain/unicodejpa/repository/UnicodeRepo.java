package jpatrain.unicodejpa.repository;

import jpatrain.unicodejpa.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepo extends JpaRepository<Unicode, Integer> {
}
