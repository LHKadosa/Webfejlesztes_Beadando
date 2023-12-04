package hu.unideb.hu.webfejlesztes_beadando.service.impl;

import hu.unideb.hu.webfejlesztes_beadando.dto.ItemDTO;
import hu.unideb.hu.webfejlesztes_beadando.entity.Item;
import hu.unideb.hu.webfejlesztes_beadando.repository.ItemRepository;
import hu.unideb.hu.webfejlesztes_beadando.repository.PlayerRepository;
import hu.unideb.hu.webfejlesztes_beadando.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public ItemDTO create(ItemDTO itemDTO){
        Item item = new Item(itemDTO.ID(), itemDTO.name(),itemDTO.type(),itemDTO.ability());
        item = itemRepository.save(item);
        return new ItemDTO(item.getID(),item.getName(),item.getType(),item.getAbility());
    }

    @Override
    public List<ItemDTO> readAll(){
        return itemRepository.findAll().stream().map((Item item) ->{
            return new ItemDTO(item.getID(),item.getName(), item.getType(), item.getAbility());
        }).toList();
    }

    @Override
    public ItemDTO update(ItemDTO itemDTO){
        Item item = new Item(itemDTO.ID(), itemDTO.name(), itemDTO.type(), itemDTO.ability());
        item = itemRepository.save(item);
        return new ItemDTO(item.getID(),item.getName(),item.getType(),item.getAbility());
    }

    @Override
    public void delete(Long ID){
        itemRepository.delete(itemRepository.findById(ID).get());
    }
}
