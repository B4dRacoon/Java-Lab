package ru.mirea.practice16.exeptions;

import ru.mirea.practice16.customers.Customer;
import ru.mirea.practice16.menu.Alcoholable;
import ru.mirea.practice16.menu.Drink;

public class CustomerChangedToNotMatureException extends AlcoholForNotMatureCustomerException{

    public CustomerChangedToNotMatureException(Customer c, Drink[] alcoholables) {
        super(c, alcoholables);
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"Вся алкогольная продукция удалена из заказа.";
    }
}
