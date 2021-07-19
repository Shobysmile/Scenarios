public class SQLTrainer extends Trainer

{
public static void main(String[] args)
{
SQLTrainer ram=new SQLTrainer();
ram.training();
System.out.println("Dept is " + ram.dept + " " + ram.inst);
int SqlSalary = ram.getsalary();
System.out.println(SqlSalary);



}



}
