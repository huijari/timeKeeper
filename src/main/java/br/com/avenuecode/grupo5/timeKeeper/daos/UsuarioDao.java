package br.com.avenuecode.grupo5.timeKeeper.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.avenuecode.grupo5.timeKeeper.entities.Usuario;

@Repository
public class UsuarioDao
{

   @PersistenceContext
   private EntityManager manager;


   public void save(Usuario usuario)
   {
      manager.persist(usuario);
   }

   public void update(Usuario usuario)
   {
      manager.merge(usuario);
   }


}