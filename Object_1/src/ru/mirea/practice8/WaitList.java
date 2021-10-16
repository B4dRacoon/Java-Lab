package ru.mirea.practice8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Base class WaitList with base functionality and minimum needed field - {@link WaitList#components} for storing data.
 * @param <E> Type of stored data.
 * @see IWaitList
 */
public class WaitList <E> implements IWaitList<E> {
    /**
     * Field for storing data.
     */
    protected ConcurrentLinkedQueue<E> components;

    /**
     * Constructor - creating new object with empty data queue.
     * @see WaitList#WaitList(Collection)
     */
    public WaitList(){
        components = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor - creating new object with data from some collection.
     * @param collection Collection with data to store.
     * @see WaitList#WaitList()
     */
    public WaitList(Collection<E> collection){
        components = new ConcurrentLinkedQueue<>(collection);
    }

    /**
     * Method to get information about this list in String type.
     * @return String-value of this list.
     */
    public String toString() {
        return "WaitList{" +
                "components=" + components +
                '}';
    }

    /**
     * Method to add element at the end of queue.
     * @param element Value to be added.
     * @see IWaitList#add(Object)
     * @see ConcurrentLinkedQueue#add(Object)
     */
    public void add(E element) {
        components.add(element);
    }

    /**
     * Method to remove first element of the queue.
     * @return Removed element.
     * @throws IllegalStateException {@link WaitList#components} is empty.
     * @see IWaitList#remove()
     * @see ConcurrentLinkedQueue#remove()
     */
    public E remove() {
        if(isEmpty()) throw new IllegalStateException("Очередь пуста!");
        return components.remove();
    }

    /**
     * Method to check, is value equal to element in queue. Difficulty - O(n).
     * @param element Value for search.
     * @return True - element find, false - not find.
     * @see IWaitList#contains(Object)
     */
    public boolean contains(E element) {
        boolean res = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(el.equals(element)) res = true;
            components.add(el);
        }
        return res;
    }

    /**
     * Method to check, are all values equal to elements of collection in queue.<br>
     *     Difficulty - O(n^2).
     *     If collection has two equal elements, both will be find in {@link WaitList#components} by one element.
     * @param collection Collection with values for search.
     * @return True - founded all elements, false - some element was not found.
     * @see IWaitList#containsAll(Collection)
     */
    public boolean containsAll(Collection<E> collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for(int i = 0; i < collection.size(); i++){
            boolean res = false;
            for(int j = 0; j < components.size(); j++){
                E el = components.remove();
                if(el.equals(al.get(i))) res = true;
                components.add(el);
            }
            if(!res) return false;
        }
        return true;
    }

    /**
     * Method to check, is {@link WaitList#components} empty.
     * @return True - {@link WaitList#components} has no elements, false - no any element in it.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    public boolean isEmpty() {
        return components.isEmpty();
    }
}
