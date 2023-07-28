package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("musicBean")
@Scope("prototype")
public class ClassicalMusic implements Music {
      @Override
    public String getSong() {
        return "Шакспір";
    }
}
