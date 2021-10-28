package com.spotify;

public class Principal {
    public static void main(String[] args) {
        IServicoDownload servico = new ProxyDownload();
        Usuario usuario = new Usuario("Bartolomeu", "01", "Premium");
        servico.baixarMusica(usuario);

        usuario = new Usuario("João", "02", "Free");
        servico.baixarMusica(usuario);
    }
}
