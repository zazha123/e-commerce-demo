package com.demo.service;

import com.demo.error.BusinessException;
import com.demo.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //create item
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //see items
    List<ItemModel> listItem();

    //see details
    ItemModel getItemById(Integer id);

    //decrease stock
    boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException;
}
