package com.emp.gae.endpoints.tut01.model;

import com.emp.gae.endpoints.tut01.model.PMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "mensaje")
public class MensajeEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<Mensaje> listMensaje() {
    PersistenceManager mgr = getPersistenceManager();
    List<Mensaje> result = new ArrayList<Mensaje>();
    try{
      Query query = mgr.newQuery(Mensaje.class);
      query.setOrdering("fecha desc");
      for (Object obj : (List<Object>) query.execute()) {
        result.add(((Mensaje) obj));
      }
    } finally {
      mgr.close();
    }
    return result;
  }

  /**
   * This method gets the entity having primary key id. It uses HTTP GET method.
   *
   * @param id the primary key of the java bean.
   * @return The entity with primary key id.
   */
  public Mensaje getMensaje(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
    Mensaje mensaje  = null;
    try {
      mensaje = mgr.getObjectById(Mensaje.class, id);
    } finally {
      mgr.close();
    }
    return mensaje;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param mensaje the entity to be inserted.
   * @return The inserted entity.
   */
  public Mensaje insertMensaje(Mensaje mensaje) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mensaje.setFecha(new Date());
      mgr.makePersistent(mensaje);
    } finally {
      mgr.close();
    }
    return mensaje;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param mensaje the entity to be updated.
   * @return The updated entity.
   */
  public Mensaje updateMensaje(Mensaje mensaje) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(mensaje);
    } finally {
      mgr.close();
    }
    return mensaje;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public Mensaje removeMensaje(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
     Mensaje mensaje  = null;
    try {
      mensaje = mgr.getObjectById(Mensaje.class, id);
      mgr.deletePersistent(mensaje);
    } finally {
      mgr.close();
    }
    return mensaje;
  }

  private static PersistenceManager getPersistenceManager() {
    return PMF.get().getPersistenceManager();
  }

}
