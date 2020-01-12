package net.metrosystems.mylibrary3.data.repository;


import net.metrosystems.mylibrary3.data.model.entity.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Integer> {

}
