package ru.mirea.practice16.exeptions;

import ru.mirea.practice16.customers.Customer;
import ru.mirea.practice16.menu.Alcoholable;
import ru.mirea.practice16.menu.Drink;

public class AddingAlcoholForNotMatureCustomerException extends AlcoholForNotMatureCustomerException {
    public AddingAlcoholForNotMatureCustomerException(Customer c, Drink alcoholable) {
        super(c, alcoholable);
    }

    public String getMessage() {
        return super.getMessage() + "Элемент не добавлен в заказ.";
    }
}
