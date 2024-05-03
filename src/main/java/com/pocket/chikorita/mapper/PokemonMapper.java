package com.pocket.chikorita.mapper;

import com.pocket.chikorita.domain.po.PokemonDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Pocket
 */
@Mapper
public interface PokemonMapper {
    /**
     * 插入
     * @param pokemonDO 实体
     * @return 插入数
     */
    int insertPokemon(PokemonDO pokemonDO);
}
