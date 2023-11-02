
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum =0;
        for (Robot robot : t){
            if(!robot.getLabel().contains("A") && !robot.getLabel().contains("B")){
                 sum +=robot.getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        int maxStep = Integer.MIN_VALUE;
        Robot maxStepRobot = null;
        for (Robot robot : t){
            if (robot.getStep() > maxStep){
                maxStep = robot.getStep();
                maxStepRobot = robot;
            }
        }
        if (maxStepRobot != null){
            t.remove(maxStepRobot);
        }
    }

    @Override
    public void f3(List<Robot> t) {
        Collections.sort(t, new Comparator<Robot>() {
            @Override
            public int compare(Robot r1, Robot r2) {
                if (r1.getLabel()!=(r2.getLabel())) {
                    return r2.getLabel().compareTo(r1.getLabel());
                } else {
                    return Integer.compare(r1.getStep(), r2.getStep());
                }
            }
        });
    }    
}
