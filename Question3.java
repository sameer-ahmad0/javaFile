import java.util.*;
public class Question3{
    HashSet<String> H1=new HashSet<>();
void saveCountryNames(String name){
    H1.add(name);
}
String getCountry(String name){
     Iterator<String> value = H1.iterator(); 
     while (value.hasNext()) { 
         if(value.next()==name)
             return name;   
     } return null;
} 
 public static void main(String [] args){
Question3 r = new Question3();
r.saveCountryNames("Australia");
r.saveCountryNames("America");
System.out.println(r.getCountry("Australia")); 
System.out.println(r.getCountry("hsdssdsdsdsdsd")); 
}
}
