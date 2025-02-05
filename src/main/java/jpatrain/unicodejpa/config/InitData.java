package jpatrain.unicodejpa.config;

import jpatrain.unicodejpa.model.Unicode;
import jpatrain.unicodejpa.repository.UnicodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepo unicodeRepo;

    @Override
    public void run(final String... args) throws Exception {

        Set<Character> setChar = new HashSet<>();
        char c ='a';
        while (setChar.add(c)){
            Unicode uni = new Unicode();
            uni.setBogstav(c);
            uni.setUnicode((int)c);
            unicodeRepo.save(uni);
            c++;
        }


    }
}
