//Collection1.java
import java.util.*;
class Collection1{
public static void main(String args[]){
//collections ko functions haru;
ArrayList a1=new ArrayList();

a1.add("binod");
a1.add("binod1");

a1.add("binod2");
a1.add("binod3");
a1.add("binod4");
a1.add("binod5");
a1.add("binod6");
a1.add("binod7");
a1.add("binod8");
a1.add("binod9");
a1.add("binod10");
a1.add("binod11");
a1.add("binod12");
a1.add("binod13");
a1.add("binod14");

System.out.println(a1);

ArrayList a2 = new ArrayList();
a2.add("hihihihi");
a2.addAll(a1);
System.out.println(a2);

System.out.println(a2.size());

System.out.println(a2.isEmpty());

System.out.println(a2.contains("binod"));

System.out.println(a2.retainAll(a1));




}
}