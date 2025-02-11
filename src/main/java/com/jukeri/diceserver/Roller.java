package com.jukeri.diceserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


    public class Roller {
        public List<Integer> roll(int dice) throws JsonProcessingException, JsonMappingException {
            Random roller = new Random();
        
            ObjectMapper jsonMapper = new ObjectMapper();

            // TODO: Test
            String testString = "{\"sides\": 6}";
            RollResult result = jsonMapper.readValue(testString, RollResult.class);

            System.out.println(result.sides);

            List<Integer> rolls = new ArrayList<Integer>();
    
            // TODO: Only rolls d6 for now
            for (int i = 0; i < dice; i++) {
                int nextRoll = roller.nextInt(5);
                nextRoll += 1;

                rolls.add(nextRoll);
            }
    
            return rolls;
        }
    
    
    }