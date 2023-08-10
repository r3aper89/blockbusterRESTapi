package com.crud.SoftwareEngineeringChallenge.dao;

import com.crud.SoftwareEngineeringChallenge.entity.Item;

import java.util.Optional;
import java.util.List;

public interface ItemDao {

    Item save(Item item);

    Optional<Item> findById(Long id);

    void delete(Item item);

    Item update(Item item);

}
