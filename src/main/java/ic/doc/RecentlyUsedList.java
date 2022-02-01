package ic.doc;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.list;

public class RecentlyUsedList {

    private List<String> list = new LinkedList<>();

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String item) {
        if (list.contains(item)) {
            list.remove(list.indexOf(item));
        }
        list.add(item);
    }

    public String get(int index) {
        return list.get(list.size() - index - 1);
    }

    public boolean contains(String word) {
        return list.contains(word);
    }
}
