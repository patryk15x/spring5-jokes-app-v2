package com.patryk.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService implements GenericJoke {

    public String getRandomQuote(){
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }
}
