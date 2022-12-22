
package com.transporte.dao;

import java.util.List;

/**
 *
 * @author Abel Díaz
 */
public interface CRUD {
    
    public int agregar(Object[] o);
    public List leer();
    public int actualizar(Object[] o);
    public void eliminar(int id);
}
