package com.crud.SoftwareEngineeringChallenge.service;

//local
import com.crud.SoftwareEngineeringChallenge.entity.Item;
import com.crud.SoftwareEngineeringChallenge.repository.ItemRepository;
import com.crud.SoftwareEngineeringChallenge.adapter.ItemAdapter;
import com.crud.SoftwareEngineeringChallenge.dao.*;
import com.crud.SoftwareEngineeringChallenge.dto.ItemDto;

import java.util.Optional;

//imported
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;

    public ItemDto createItem(ItemDto itemDto) {
        Item item = ItemAdapter.dtoToEntity(itemDto);
        item = itemDao.save(item);
        return ItemAdapter.entityToDto(item);
    }

    public ItemDto getItemById(Long id) {
        Optional<Item> itemOpt = itemDao.findById(id);
        if (itemOpt.isPresent()) {
            return ItemAdapter.entityToDto(itemOpt.get());
        }
        return null;
    }

    public ItemDto updateItem(Long id, ItemDto itemDto) {
        Item item = ItemAdapter.dtoToEntity(itemDto);
        item.setId(id);
        item = itemDao.update(item);
        return ItemAdapter.entityToDto(item);
    }

    public void deleteItem(Long id) {
        Optional<Item> itemOpt = itemDao.findById(id);
        itemOpt.ifPresent(item -> itemDao.delete(item));
    }
}