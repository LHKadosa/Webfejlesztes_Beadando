package hu.unideb.hu.webfejlesztes_beadando.service;

import hu.unideb.hu.webfejlesztes_beadando.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {

    public PlayerDTO create(PlayerDTO playerTO);

    public List<PlayerDTO> readAll();

    public PlayerDTO update(PlayerDTO playerDTO);

    public void delete(Long ID);
}
