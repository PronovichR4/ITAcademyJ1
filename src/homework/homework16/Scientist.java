package homework.homework16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scientist {

    private String name;

    public Scientist(String name) {
        this.name = name;
    }

    Map<Detail, Integer> detailsInStock = new HashMap<>();

    public void setDetailsInStock(List<Detail> detailsForScientist) {
        for (Detail detail : detailsForScientist) {
            if (detailsInStock.containsKey(detail)) {
                detailsInStock.put(detail, detailsInStock.get(detail) + 1);
            } else {
                detailsInStock.put(detail, 1);
            }
        }
    }

    public void createRobot() {
        int counter = Integer.MAX_VALUE;
        for (Detail detail : Detail.values()) {
            if (detailsInStock.containsKey(detail)) {
                if (counter > detailsInStock.get(detail)) {
                    counter = detailsInStock.get(detail);
                }
            } else {
                System.out.println("недостаточно деталей");
                counter = 0;
                break;
            }
        }
        System.out.println(getName() + " создал " + counter + " роботов");
    }

    public void showDetails() {
        for (Map.Entry<Detail, Integer> entry : detailsInStock.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            detailsInStock.values();
        }
    }

    public String getName() {
        return name;
    }
}
