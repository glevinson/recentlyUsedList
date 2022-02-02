package ic.doc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RecentlyUsedListTests {

    RecentlyUsedList<String> listOne = new RecentlyUsedList<>();

    @Test
    public void listIsEmptyWhenInitialised() {
        assertThat(listOne.isEmpty(), is(true));
    }

    @Test
    public void canAddThingsToList() {

        int original_size = listOne.size();
        listOne.add("hello world");

        assertThat(listOne.get(0), is("hello world"));
        assertThat(listOne.size(), is(original_size + 1));
    }

    @Test
    public void canRetrieveItemsFromList() {
        listOne.add("hello world");
        listOne.add("Adding");
        listOne.add("Some");
        listOne.add("Stuff");

        assertThat(listOne.get(0), is("Stuff"));
        assertThat(listOne.get(1), is("Some"));
        assertThat(listOne.get(2), is("Adding"));
        assertThat(listOne.get(3), is("hello world"));
    }

    @Test
    public void mostRecentItemFirstInList() {
        listOne.add("hello world");
        listOne.add("Adding");
        listOne.add("Some");

        assertThat(listOne.get(0), is("Some"));
    }

    @Test
    public void itemsInListUnique() {

        listOne.add("hello world");
        listOne.add("Adding");
        listOne.add("Some");

        assertThat(listOne.size(), is(3));

        listOne.add("hello world");

        assertThat(listOne.size(), is(3));
        assertThat(listOne.get(0), is("hello world"));
    }

    @Test
    public void canAddDifferentDataTypes() {

        listOne.add("hello world");
        assertThat(listOne.get(0), is("hello world"));

        RecentlyUsedList<Integer> listTwo = new RecentlyUsedList<>();
        listTwo.add(5);
        assertThat(listTwo.get(0), is(5));
    }
}