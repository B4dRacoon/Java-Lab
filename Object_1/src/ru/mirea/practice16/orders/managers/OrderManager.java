package ru.mirea.practice16.orders.managers;

import ru.mirea.practice16.menu.MenuItem;
import ru.mirea.practice16.orders.Order;

public interface OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
