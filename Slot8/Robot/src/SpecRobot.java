/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */

public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
        super();
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", " + step;
    }
    
    public void setData() {
        super.setLabel(super.getLabel().substring(0, 1) + step + super.getLabel().substring(1));
    }

    public int getValue() {

        if(getLabel().contains("A") && getType() < 3){
            return step;
        }else {
            return step + 2;
        }
    }
}