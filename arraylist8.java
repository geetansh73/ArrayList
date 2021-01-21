import java.util.*;
class arraylist8
{
public static void main(String g[])
{
ArrayList <String>obj=new ArrayList<>();
System.out.println(obj.size());
obj.add("A");
obj.add("B");
obj.add("C");
obj.add("D");
obj.add("E");
obj.add(1,"A2");
System.out.println(obj);
System.out.println(obj.size());
}
}