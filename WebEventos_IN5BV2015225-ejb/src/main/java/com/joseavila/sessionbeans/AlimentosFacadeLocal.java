/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joseavila.sessionbeans;

import com.joseavila.entities.Alimentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author josej
 */
@Local
public interface AlimentosFacadeLocal {

    void create(Alimentos alimentos);

    void edit(Alimentos alimentos);

    void remove(Alimentos alimentos);

    Alimentos find(Object id);

    List<Alimentos> findAll();

    List<Alimentos> findRange(int[] range);

    int count();
    
}
