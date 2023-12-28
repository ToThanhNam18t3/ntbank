package com.FakerBank.fakerBank.controller;

import com.FakerBank.fakerBank.model.Card;
import com.FakerBank.fakerBank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardsRepository;

    @GetMapping("/myCards")
    public List<Card> getCardDetails(@RequestParam int id) {
        List<Card> cards = cardsRepository.findByCustomerId(id);
        if (cards != null ) {
            return cards;
        }else {
            return null;
        }
    }
}
