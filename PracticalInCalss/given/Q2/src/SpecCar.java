/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My Computer
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
      super();
    }

    public SpecCar( String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }
    @Override
    public String toString(){
        return maker + ',' + price +','+ type  ;
    }
    public void setData(){
        this.setMaker("XY" + this.getMaker());
        this.price +=20;
    }
    
    public int getValue() {
        int in = (type < 7) ? 10 : 15;
        return this.getPrice() + in;
    }
}
