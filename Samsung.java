class Samsung extends FactoryDemo{
static int price=5000;
public static void main(String[] args)
{
Samsung sam=new Samsung();
sam.browse();
int x=sam.price;
System.out.println(x);

sam.call(10);
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();
}



public int call(int seconds){
return seconds;
}

public void sendMessage(){

}


public void receiveCall(){

}

public void verifyFingerPrint(){

}
public void providePattern(){

}




}
