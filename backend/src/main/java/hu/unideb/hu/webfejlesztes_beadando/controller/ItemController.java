package hu.unideb.hu.webfejlesztes_beadando.controller;

import hu.unideb.hu.webfejlesztes_beadando.dto.ItemDTO;
import hu.unideb.hu.webfejlesztes_beadando.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/createItem")
    ResponseEntity createItem(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity(itemService.create(itemDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    ResponseEntity getAllItems(){
        return new ResponseEntity<>(itemService.readAll(), HttpStatus.OK);
    }

    @PatchMapping("/updateItem")
    ResponseEntity updateItem(@RequestBody ItemDTO itemDTO){
        return new ResponseEntity(itemService.update(itemDTO), HttpStatus.OK);
    }

    @DeleteMapping("/deleteItem")
    ResponseEntity deleteItem(@RequestBody ItemDTO itemDTO){
        itemService.delete(itemDTO.ID());
        return new ResponseEntity(HttpStatus.OK);
    }
}
