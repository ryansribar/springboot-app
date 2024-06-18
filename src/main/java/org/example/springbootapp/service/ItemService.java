package org.example.springbootapp.service;

import org.example.springbootapp.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemService {
    private List<Item> items = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<Item> getAllItems() {
        return items;
    }

    public Optional<Item> getItemById(Long id) {
        return items.stream().filter(item -> item.getId().equals(id)).findFirst();
    }

    public Item createItem(Item item) {
        item.setId(counter.incrementAndGet());
        items.add(item);
        return item;
    }

    public Optional<Item> updateItem(Long id, Item itemDetails) {
        return getItemById(id).map(item -> {
            item.setName(itemDetails.getName());
            item.setDescription(itemDetails.getDescription());
            return item;
        });
    }

    public boolean deleteItem(Long id) {
        return items.removeIf(item -> item.getId().equals(id));
    }
}

