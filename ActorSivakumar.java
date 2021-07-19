public class ActorSivakumar implements Actor{
static String address="Coimbatore";

public ActorSivakumar(int x, String y){

}
public ActorSivakumar(){

}

public static void main(String[] args)
{

ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
System.out.println(as.address);
as.speaking();
as.act();
as.dance();
as.sing();
Actor ac = new ActorSivakumar();
System.out.println(ac.address);
//ac.speaking();
ac.act();

}

public void speaking()
{
System.out.println("Specks good");
}
public void act(){
System.out.println("Good actor");
}

public void dance(){
System.out.println("He dance well");
}

public void sing(){

System.out.println("Singing was his hobby");
}

}
