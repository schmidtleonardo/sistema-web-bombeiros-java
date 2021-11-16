package com.springboot.sistemawebbombeiros.models;

public class JwtResponse {
    private final String token;
    private final UsuarioResponse user;

    public JwtResponse(String token, UsuarioResponse user) {
        this.token = token;
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public UsuarioResponse getUser() {
        return user;
    }

}
