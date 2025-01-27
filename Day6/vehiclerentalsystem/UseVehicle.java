package vehiclerentalsystem;
import java.util.List;
import java.util.ArrayList;

public class UseVehicle{
    public static void main(String[] args) {
        List<Vehicle> vc=new ArrayList<>();
        vc.add(new Car(101, "4 wheeler", 2000));
        vc.add(new Bike(102, "2 wheeler", 500));
        vc.add(new Truck(103, "8 Wheeler", 5000));


        List<Insurable> in=new ArrayList<>();
        in.add(new Car(101, "4 wheeler", 2000));
        in.add(new Bike(102, "2 wheeler", 500));
        in.add(new Truck(103, "8 Wheeler", 5000));

        List<Insurable> li2=new ArrayList<>();
        for(int i=0;i<vc.size();i++){
            Vehicle temp=vc.get(i);
            temp.calcualteRentalCost(7);
            temp.dispaly();
            Insurable temp2=in.get(i);
            temp2.calculateInsurance();
            temp2.getInsureanceDeatails();
            System.out.println("\n");
        }
    }
}