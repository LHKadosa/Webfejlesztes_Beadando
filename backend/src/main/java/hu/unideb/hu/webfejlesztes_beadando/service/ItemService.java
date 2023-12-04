package hu.unideb.hu.webfejlesztes_beadando.service;

import hu.unideb.hu.webfejlesztes_beadando.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    public ItemDTO create(ItemDTO itemDTO);

    public List<ItemDTO> readAll();

    public ItemDTO update(ItemDTO itemDTO);

    public void delete(Long ID);
}
