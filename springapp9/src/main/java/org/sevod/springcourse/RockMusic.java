package org.sevod.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
