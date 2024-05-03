package com.pocket.chikorita.domain.po;

import lombok.Data;

import java.util.Set;

/**
 * @author Pocket
 */
@Data
public class PokemonDO {
    private Integer dexId;
    private String pokemonName;
    private Integer subDexId;
    private Integer hasEvolution;
    private Integer hasPreEvolution;
    private Integer preDexId;
    private Integer nextDexId;
    private Set<String> types;
    private Integer regionId;
}
