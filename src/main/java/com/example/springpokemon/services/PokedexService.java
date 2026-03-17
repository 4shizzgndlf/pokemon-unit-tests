package com.example.springpokemon.services;

import com.example.springpokemon.models.Pokemon;
import com.example.springpokemon.repositories.PokedexRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

public class PokedexService {
    private PokedexRepository repo = new PokedexRepository();

    public List<Pokemon> getAllFire() throws SQLException {
        return repo.getALlFirePokemon();
    }

    public Pokemon getSingleById(int id) throws SQLException {
        Pokemon returnPokenom  = repo.getSingleById(id);
        if(returnPokenom == null){
            throw new NoSuchElementException();
        }
        return returnPokenom;
    }
}
