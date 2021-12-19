package ru.mirea.practice16.exeptions;

import ru.mirea.practice16.customers.Address;

public class OrderOnAddressAlreadyExistsException extends IllegalArgumentException {
    Address address;
    public OrderOnAddressAlreadyExistsException(Address address) {
        super("Заказ на адрес "+address.toString()+" уже обрабатывается!");
    }
}