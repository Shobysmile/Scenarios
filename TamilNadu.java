public class TamilNadu extends SouthIndia{
static String capital="Chennai";
public static void main(String[] args)
{

System.out.println(India.capital);
System.out.println(TamilNadu.capital);

SouthIndia si = new TamilNadu();
si.speakLanguage();
si.eat();
si.dress();
si.cultivate();
si.livingStyle();

}


public void speakLanguage(){
System.out.println("Tamil is major speaking language");
}
public void eat(){
System.out.println("Eats carbohydate rich food");
}
public void dress(){
System.out.println("Saree is traditional wear");
}
public void cultivate(){
System.out.println("Rice and Sugar cane cultivation");

}

public void  livingStyle(){
System.out.println("Above Average development’");
}

}
