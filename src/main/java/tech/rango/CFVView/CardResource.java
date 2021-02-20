package tech.rango.CFVView;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.rango.CFVView.model.Card;
import tech.rango.CFVView.service.CardService;


@RestController
@RequestMapping("/card")
public class CardResource {
	private final CardService cardService;

	public CardResource(CardService cardService) {		
		this.cardService = cardService;
	}
	
	@GetMapping("/all") //HTTP RESPONSE
	public ResponseEntity<List<Card>> getAllCards()
	{
		List<Card> cards = cardService.findAllCards();
		return new ResponseEntity<>(cards, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}") //HTTP RESPONSE id path parameter
	public ResponseEntity<Card> getCardById(@PathVariable("id") Long id)
	{
		Card card = cardService.findCardById(id);
		return new ResponseEntity<>(card, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Card> addCard(@RequestBody Card card)
	{
		Card newCard = cardService.addCard(card);
		return new ResponseEntity<>(newCard, HttpStatus.CREATED); //adding something new
	}
	
	@PutMapping("/update")
	public ResponseEntity<Card> updateCard(@RequestBody Card card)
	{
		Card updateCard = cardService.updateCard(card);
		return new ResponseEntity<>(updateCard, HttpStatus.OK); 
	}
	
	@DeleteMapping("/delete/{id}") //delete by id
	public ResponseEntity<?> deleteCard(@PathVariable("id") Long id)
	{
		cardService.deleteCard(id);
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	

}
