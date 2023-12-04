package hu.unideb.hu.webfejlesztes_beadando.controller;

import hu.unideb.hu.webfejlesztes_beadando.dto.PlayerDTO;
import hu.unideb.hu.webfejlesztes_beadando.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @PostMapping("/createPlayer")
    ResponseEntity createPlayer(@RequestBody PlayerDTO playerDTO){
        return new ResponseEntity(playerService.create(playerDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    ResponseEntity getAllPlayer(){
        return new ResponseEntity<>(playerService.readAll(), HttpStatus.OK);
    }

    @PatchMapping("/updatePlayer")
    ResponseEntity updatePlayer(@RequestBody PlayerDTO playerDTO){
        return new ResponseEntity(playerService.update(playerDTO), HttpStatus.OK);
    }

    @DeleteMapping("/deletePlayer")
    ResponseEntity deletePlayer(@RequestBody PlayerDTO playerDTO){
        playerService.delete(playerDTO.ID());
        return new ResponseEntity(HttpStatus.OK);
    }
}
