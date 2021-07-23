package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules{

public static void main(String[] args)
{
CommonManInChennai obj=new CommonManInChennai();

obj.goByDieselVehicle();

obj.goByBicycle();
}

public void goByDieselVehicle(){
System.out.println("Hero bike");
}


public void goByBicycle(){
System.out.println("Hero bicycle");
}


}
