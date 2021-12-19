package ru.mirea.practice16.orders;

import ru.mirea.practice16.customers.Customer;
import ru.mirea.practice16.exeptions.AlcoholForNotMatureCustomerException;
import ru.mirea.practice16.exeptions.CustomerChangedToNotMatureException;
import ru.mirea.practice16.menu.Alcoholable;
import ru.mirea.practice16.menu.Drink;
import ru.mirea.practice16.menu.MenuItem;

public abstract class AbstractOrder implements Order {
    protected int size;
    protected Customer customer;

    public AbstractOrder(Customer customer){
        this.customer = customer;
    }

    public String[] itemsNames() {
        String [] res = new String[size];
        MenuItem[] uniqueItems = getItems();
        for(int i = 0; i < uniqueItems.length; i++){
            res[i] = uniqueItems[i].getName();
        }
        return res;
    }

    public int itemsQuantity(){
        return size;
    }

    public int removeAll(String itemName) {
        int count = 0;
        while(remove(itemName)) count++;
        return count;
    }

    public int removeAll(MenuItem item) {
        int count = 0;
        while(remove(item)) count++;
        return count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer newCustomer) throws AlcoholForNotMatureCustomerException{
        this.customer = newCustomer;
        if(!this.customer.isMature()){
            Drink[] removedItems = new Drink[0];
            for (MenuItem item : getItems()) {
                if(item instanceof Alcoholable && ((Alcoholable) item).isAlcoholDrink()){
                    Drink[] tmp = new Drink[removedItems.length+1];
                    System.arraycopy(removedItems, 0, tmp, 0, removedItems.length);
                    tmp[tmp.length-1] = (Drink) item;
                    removedItems = tmp;
                    removeAll(item);
                }
            }
            if(removedItems.length > 0) throw new CustomerChangedToNotMatureException(customer, removedItems);
        }
    }

    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = getItems();
        mergeSort(items);
        return items;
    }

    private void mergeSort(MenuItem[] arr){
        if(arr.length < 2) return;
        int middle = arr.length/2;
        MenuItem[]l = new MenuItem[middle];
        MenuItem[]r = new MenuItem[arr.length-middle];
        System.arraycopy(arr, 0, l, 0, middle);
        System.arraycopy(arr, middle, r, 0, arr.length-middle);

        mergeSort(l);
        mergeSort(r);

        merge(arr, l, r);
    }
    private void merge(MenuItem[] arr, MenuItem[] left, MenuItem[] right){
        int iArr = 0, iLeft = 0, iRight = 0;
        while (iLeft < left.length && iRight < right.length){
            if(left[iLeft].compareTo(right[iRight]) <= 0) arr[iArr++] = left[iLeft++];
            else arr[iArr++] = right[iRight++];
        }
        while(iLeft < left.length)
            arr[iArr++] = left[iLeft++];
        while (iRight < right.length)
            arr[iArr++] = right[iRight++];
    }
}
