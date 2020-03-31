package car;

import home.Room;

public class Equipment {

    public static int amountGlass = 5;

    public Equipment(int aG){
        this.amountGlass = aG;
    }

    public static int getAmountGlass(Room room1){
        return amountGlass;
    }
}
