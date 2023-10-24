
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 f1: Return the whole part of average rate of all cars (e.g. the whole part of 3.7 is 3).
 f2: Find the first max and min rates in the list and swap their positions.
 f3: Sort the list by maker alphabetically, in case makers are the same, sort them descendingly
by rate.
 * @author My Computer
 */
public class MyCar implements ICar{
    @Override
    public int f1(List<Car> t){
        int totalRate = 0;
        for(Car x : t){
            totalRate += x.getRate();
        }
        return totalRate / t.size();
    }
    @Override
    public void f2(List<Car> t){
        if (t.isEmpty()){
            return ;
        }
        int maxRateIndex = 0;
        int minRateIndex = 0;

        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getRate() > t.get(maxRateIndex).getRate()) {
                maxRateIndex = i;
            }
            if (t.get(i).getRate() < t.get(minRateIndex).getRate()) {
                minRateIndex = i;
            }
        }

        Collections.swap(t, maxRateIndex, minRateIndex);
    }
    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, (Car car1,Car car2) -> {
          if (car1.getMaker()!= car2.getMaker()){
              return car2.getMaker().compareTo(car1.getMaker());
          }else {
              return Integer.compare(car1.getRate(), car2.getRate());          }
            
        });
    }
}
