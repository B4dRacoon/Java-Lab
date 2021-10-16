package ru.mirea.practice8;

/**
 * Class of queue with added functionality:
 *         Removing element from any place of queue by its value;</li>
 *         Moving element <i>(find in queue by value)</i> to the end of queue.</li>
 *     At all other sides it is simply {@link WaitList}.
 * @param <E> Type of stored data.
 * @see WaitList
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Constructor - creates empty queue.
     * @see WaitList#WaitList()
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Method for removing element from queue by its value.
     *     Difficulty - O(n).
     * @param element Value for search and removing.
     * @see WaitList#remove()
     */
    public void remove (E element){
        // components.remove(element)
        boolean removed = false;
        for(int i = 0; i < components.size(); i++){
            E el = components.remove();
            if(!removed && el.equals(element)){
                removed = true; // i--
            }else{
                components.add(el);
            }
        }
        if(removed){
            components.add(components.remove());
        }
    }

    /**
     * Method for moving element to the end of queue.
     *     Uses {@link UnfairWaitList#remove(Object)} and (if something was removed) {@link WaitList#add(Object)}.
     * @param element Value to move.
     */
    public void moveToBack(E element){
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize){
            components.add(element);
        }

    }
}
