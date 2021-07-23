package india.newDelhi;
import tamilnadu.chennai.TrafficRules;
public class CommonManInDelhi implements TrafficRulesDelhi, TrafficRules{

public static void main(String[] arg)
{
CommonManInDelhi man=new CommonManInDelhi();
man.dontGoByDieselVehicle();
man.goByBicycle();
man.goByDieselVehicle();
}

public void dontGoByDieselVehicle(){
System.out.println("Not allow to go Bike");
}

public void goByBicycle(){
System.out.println("Allow to go bicycle");
}

public void goByDieselVehicle(){
System.out.println("Allow to go DieselVehicle");
}


}


