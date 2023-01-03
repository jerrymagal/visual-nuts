package com.visual.nuts.exercise2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryReport {

    private List<CountryDto> countries;

    private final Map<String, Integer> languagesMap;

    public CountryReport() throws Exception {
        String json = new String(Files.readAllBytes(Paths.get("src/main/resources/countries.json")));
        countries = new ObjectMapper().readValue(json, new TypeReference<List<CountryDto>>() {});
        languagesMap = new HashMap<>();

        countries.forEach(c -> {
            c.getLanguages().forEach(l -> {
                if(!languagesMap.containsKey(l)) {
                    languagesMap.put(l, 1);
                } else {
                    languagesMap.put(l, languagesMap.get(l) + 1);
                }
          });
        });

    }

    public int totalCountries() {
        return countries.size();
    }

    public List<String> listAllGermanCountries() {
        return countries.stream()
                .filter(c -> c.getLanguages().contains("ge"))
                .map(CountryDto::getCountry)
                .collect(Collectors.toList());
    }

    public Map<String, Integer> countLanguagesByCountry() {
        return languagesMap;
    }

    public String findCountryWithMoreLanguages() {
        return languagesMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

}
