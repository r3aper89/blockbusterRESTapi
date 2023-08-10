package com.crud.SoftwareEngineeringChallenge.adapter;

//local
import com.crud.SoftwareEngineeringChallenge.dto.ItemDto;
import com.crud.SoftwareEngineeringChallenge.entity.Item;

//imported
import org.springframework.stereotype.Component;

@Component
public class ItemAdapter {

    public static Item dtoToEntity(ItemDto itemDto) {
        Item item = new Item();
        item.setId(itemDto.getId());
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        return item;
    }

    public static ItemDto entityToDto(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        return itemDto;
    }
}