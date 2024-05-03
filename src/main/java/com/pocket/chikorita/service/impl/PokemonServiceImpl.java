package com.pocket.chikorita.service.impl;

import com.alibaba.fastjson2.JSONArray;
import com.pocket.chikorita.common.HttpUtils;
import com.pocket.chikorita.common.MockUtil;
import com.pocket.chikorita.domain.po.PokemonDO;
import com.pocket.chikorita.mapper.PokemonMapper;
import com.pocket.chikorita.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonMapper pokemonMapper;

    @Override
    public int insertPokemon(PokemonDO pokemonDO) {
        JSONArray pokemonMock = MockUtil.getPokemonMock();
        PokemonDO object = pokemonMock.getObject(0, PokemonDO.class);
        String s = HttpUtils.get("www.pokemon.cn/play/pokedex/api/v1", new HashMap<>());
        return pokemonMapper.insertPokemon(pokemonDO);
    }

    public static void main(String[] args) {
        PokemonServiceImpl pokemonService = new PokemonServiceImpl();
        pokemonService.insertPokemon(new PokemonDO());
    }
}
