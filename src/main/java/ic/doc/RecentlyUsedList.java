package ic.doc;

import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList<E> {

    private final List<E> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void add(E item) {
        if (list.contains(item)) {
            list.remove(item);
        }
        list.add(item);
    }

    public E get(int index) {
        return list.get(list.size() - index - 1);
    }

    public boolean contains(E item) {
        return list.contains(item);
    }

    public int size() {
        return list.size();
    }
}