package com.crud.SoftwareEngineeringChallenge.dao;

import java.util.Optional;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.crud.SoftwareEngineeringChallenge.repository.ItemRepository;
import com.crud.SoftwareEngineeringChallenge.entity.*;
import com.crud.SoftwareEngineeringChallenge.dao.*;

@Repository
public class ItemDaoImpl implements ItemDao {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item save(Item item) {
        return ItemRepository.save(item);
    }

    @Override
    public Optional<Item> findById(Long id) {
        return itemRepository.findById(id);
    }

    @Override
    public void delete(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public Item update(Item item) {
        if (itemRepository.existsById(item.getId())) {
            return itemRepository.save(item);
        }
        // handle the case when the item doesn't exist or throw an exception
        return null;
    }

}
