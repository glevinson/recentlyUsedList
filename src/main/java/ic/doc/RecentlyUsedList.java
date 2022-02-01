package ic.doc;

import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.list;

public class RecentlyUsedList {

    private List<String> list = new LinkedList<>();

    public boolean isEmpty() {
        if (list.size() == 0){
            return true;
        }
        return false;
    }

    public void add(String item){
       list.add(item);
       if(!itemUnique()){
           for(int i = 0; i<list.size()-1; i++){
               if(list.get(i).equals(item)){
                   list.remove(i);
               }
           }
       }
    }

    public String get(int index) {
        return list.get( list.size() - index -1);
    }

    public boolean itemUnique() {
        for (int i = 0; i< list.size(); i++){
            for(int j = 0; j< list.size(); j++){
                if( i != j && list.get(i).equals(list.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
