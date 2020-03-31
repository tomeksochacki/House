package home;

import static car.Equipment.getAmountGlass;
import static user.User.generateRandomeUserId;

public class Kitchen {
    public static void main(String[] args) {

        Room room1 = new Room(4, 3,2);
        int quantiry = getAmountGlass(room1);
        System.out.println(quantiry);


        for (int i = 0; i <10; i++) {
            double id = generateRandomeUserId();
            System.out.println(id);
        }
    }
}
