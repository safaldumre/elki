package de.lmu.ifi.dbs.index.metrical.mtree;

import de.lmu.ifi.dbs.distance.Distance;
import de.lmu.ifi.dbs.index.Entry;

import java.io.Externalizable;

/**
 * Defines the requirements for an entry in an M-Tree node.
 *
 * @author Elke Achtert (<a href="mailto:achtert@dbs.ifi.lmu.de">achtert@dbs.ifi.lmu.de</a>)
 */

public interface MTreeEntry<D extends Distance> extends Entry {
  /**
   * Returns the id of the underlying database object of this entry, if this entry is a
   * leaf entry, the id of the routing object, otherwise.
   *
   * @return the id of the underlying database object of this entry, if this entry is a
   *         leaf entry, the id of the routing object, otherwise
   */
  Integer getRoutingObjectID();

  /**
   * Sets the id of the underlying database object of this entry, if this entry is a leaf entry,
   * the id of the routing object, otherwise.
   *
   * @param objectID the id to be set
   */
  void setRoutingObjectID(Integer objectID);

  /**
   * Returns the distance from the routing object of this entry to
   * the routing object of its parent.
   *
   * @return the distance from the object to its parent object
   */
  D getParentDistance();

  /**
   * Sets the distance from the routing object to
   * routing object of its parent.
   *
   * @param parentDistance the distance to be set
   */
  void setParentDistance(D parentDistance);
}
