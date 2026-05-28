package com.craftinginterpreters.lox;

import java.util.ArrayList;
import java.util.List;

public  class Lexer{
    private final String source;

    public Lexer(String source) {
        this.source = source;
    }

    public List<tokens.Token> scanTokens(){
        return new ArrayList<>();
    }
}