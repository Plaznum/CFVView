package tech.rango.CFVView.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.rango.CFVView.exception.CardNotFoundException;
import tech.rango.CFVView.model.Card;
import tech.rango.CFVView.repo.CardRepo;


@Service
public class CardService {
	private final CardRepo cardRepo;
	
	
	@Autowired
	public CardService (CardRepo cardRepo)
	{
		this.cardRepo = cardRepo;
	}

	
	public Card addCard(Card card) 
	{
		card.setCardCode(UUID.randomUUID().toString());
		return cardRepo.save(card);
	}
	
	public List<Card> findAllCards()
	{
		return cardRepo.findAll();
	}
	
	public Card updateCard(Card card)
	{
		return cardRepo.save(card);
	}
	
	public Card findCardById(Long id)
	{
		return cardRepo.findCardById(id)
				.orElseThrow(() -> new CardNotFoundException ("User by id " +id+ "was not found."));
	}
	
	public void deleteCard (Long id)
	{
		cardRepo.deleteCardById(id);
	}
}
