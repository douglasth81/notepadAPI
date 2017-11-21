package br.com.tizzo.douglas.notepadAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tizzo.douglas.notepadAPI.model.Nota;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotaRepository extends MongoRepository<Nota, String>{
    List<Nota> findByTitulo(String titulo);
}
