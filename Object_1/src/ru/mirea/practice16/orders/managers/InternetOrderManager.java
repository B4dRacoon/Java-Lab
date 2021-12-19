package ru.mirea.practice16.orders.managers;

import ru.mirea.practice16.exeptions.EmptyOrderListException;
import ru.mirea.practice16.exeptions.OrderOnAddressAlreadyExistsException;
import ru.mirea.practice16.menu.MenuItem;
import ru.mirea.practice16.orders.InternetOrder;
import ru.mirea.practice16.orders.Order;

public class InternetOrderManager implements OrderManager {

    private static class QueueNode{
        QueueNode prev, next;
        Order value;
    }

    private QueueNode head, tail;
    private int size;

    public InternetOrderManager(){
        head = tail = new QueueNode();
        size = 0;
    }
    public InternetOrderManager(Order[] orders){
        this();
        QueueNode node = head;
        for (Order order : orders) {
            node.value = order;
            node.next = new QueueNode();
            node.next.prev = node;
            node = node.next;
        }
        tail = node;
    }

    public boolean add(Order order) throws OrderOnAddressAlreadyExistsException{
        if(! (order instanceof InternetOrder)) return false;
        QueueNode node = head;
        while (node!= null && node.value != null){
            if(node.value.getCustomer().getAddress().equals(order.getCustomer().getAddress()))
                throw new OrderOnAddressAlreadyExistsException(node.value.getCustomer().getAddress());
            node = node.next;
        }

        size++;
        if(head == null){
            tail = head = new QueueNode();
        }
        if(head.value == null) {
            head.value = order;
            return true;
        }
        QueueNode nNode = new QueueNode();
        tail.next = nNode;
        nNode.prev = tail;
        nNode.value = order;
        return true;
    }

    public Order remove() throws EmptyOrderListException {
        if(head == null || head.value == null) throw new EmptyOrderListException();
        Order v = head.value;
        head = head.next;
        size--;
        return v;
    }

    public Order order() throws EmptyOrderListException{
        if(head == null || head.value == null) throw new EmptyOrderListException();
        return head.value;
    }

    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            count+=node.value.itemQuantity(itemName);
            node = node.next;
        }
        return count;
    }

    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            count+=node.value.itemQuantity(item);
            node = node.next;
        }
        return count;
    }

    public Order[] getOrders() {
        Order[] ords = new Order[size];
        QueueNode node = head;
        int i = 0;
        while (node!=null && node.value != null){
            ords[i++] = node.value;
            node = node.next;
        }
        return ords;
    }

    public double ordersCostSummary() {
        double cost = 0;
        QueueNode node = head;
        while (node!=null && node.value != null){
            cost+=node.value.costTotal();
            node = node.next;
        }
        return cost;    }

    public int ordersQuantity() {
        return size;
    }
}
