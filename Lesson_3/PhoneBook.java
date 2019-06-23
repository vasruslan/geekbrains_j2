import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    HashMap<String,String[]> book = new HashMap<>();

    public void add(String name, String[] phone) {
        book.put(name, phone);

    }

    public void get (String name) {
        for (Map.Entry<String,String[]> o : book.entrySet()) {
            if (o.getKey().equals(name)) {
                for (int count = 0; count < o.getValue().length; count++) {
                    System.out.println(o.getKey() + " " + o.getValue()[count]);
                }
            }
        }
    }

}
