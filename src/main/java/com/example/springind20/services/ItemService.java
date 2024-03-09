package com.example.springind20.services;

import com.example.springind20.storages.ItemStorage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemService {

    private final ItemStorage itemStorage;

    public ItemService(ItemStorage itemStorage) {
        this.itemStorage = itemStorage;
    }

    public void add(List<Long> ids) {
        itemStorage.add(ids);
    }

    public Map<Long, Integer> getAll() {
        return itemStorage.getAll();
    }
}
