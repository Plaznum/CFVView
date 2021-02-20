package tech.rango.CFVView.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.rango.CFVView.model.Card;

public interface CardRepo extends JpaRepository<Card, Long>{

	void deleteCardById(Long id); //spring understands method name structure, creates needed query

	Optional<Card> findCardById(Long id); 

}
