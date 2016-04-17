package homework.db.dao;

import homework.db.entity.PersistentEntity;
import java.util.List;

public interface GenericDao<T extends PersistentEntity> {

    public List<T> findAll();

    public T findById(Integer id);

    public void create(T entity);

    public void delete(T entity);

}
