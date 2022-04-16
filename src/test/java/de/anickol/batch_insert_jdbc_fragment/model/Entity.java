package de.anickol.batch_insert_jdbc_fragment.model;

import lombok.Data;

/**
 * Simple entity without Id annotation.
 *
 * @author anickol
 */
@Data
public class Entity {
	private Long id;
	private String field;
}
