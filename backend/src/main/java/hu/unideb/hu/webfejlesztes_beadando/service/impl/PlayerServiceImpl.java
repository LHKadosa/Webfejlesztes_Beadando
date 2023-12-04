package hu.unideb.hu.webfejlesztes_beadando.service.impl;

import hu.unideb.hu.webfejlesztes_beadando.dto.PlayerDTO;
import hu.unideb.hu.webfejlesztes_beadando.entity.Player;
import hu.unideb.hu.webfejlesztes_beadando.repository.PlayerRepository;
import hu.unideb.hu.webfejlesztes_beadando.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRespository;

    @Override
    public PlayerDTO create(PlayerDTO playerDTO){
        Player player = new Player(playerDTO.ID(), playerDTO.username(), playerDTO.password(), playerDTO.health(),playerDTO.experience());
        player = playerRespository.save(player);
        return new PlayerDTO(player.getID(), player.getUsername(), player.getPassword(), player.getHealth(), player.getExperience());
    }

    @Override
    public List<PlayerDTO> readAll(){
        return playerRespository.findAll().stream().map((Player player) -> {
            return new PlayerDTO(player.getID(), player.getUsername(), player.getPassword(),player.getHealth(),player.getExperience());
        }).toList();
    }

    @Override
    public PlayerDTO update(PlayerDTO playerDTO){
        Player player = new Player(playerDTO.ID(), playerDTO.username(),playerDTO.password(), playerDTO.health(),playerDTO.experience());
        player = playerRespository.save(player);
        return new PlayerDTO(player.getID(), player.getUsername(), player.getPassword(), player.getHealth(),player.getExperience());
    }

    @Override
    public void delete(Long ID){
        playerRespository.delete(playerRespository.getReferenceById(ID));
    }
}
