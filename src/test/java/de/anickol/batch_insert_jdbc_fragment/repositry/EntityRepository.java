package de.anickol.batch_insert_jdbc_fragment.repositry;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import de.anickol.batch_insert_jdbc_fragment.InsertAll;
import de.anickol.batch_insert_jdbc_fragment.model.Entity;

/**
 * Repository for tests implementing InsertAll fragment.
 *
 * @author anickol
 */
public interface EntityRepository extends CrudRepository<Entity, Long>, InsertAll<Entity> {
	Optional<Entity> findByField(String field);
}
