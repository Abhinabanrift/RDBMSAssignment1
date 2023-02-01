import java.util.ArrayList;

public class Q2Map {
 public static void main(String[] args) {
    // collection of emp objects-> mapper -> salary incremented by 10%
    ArrayList<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("John", 45, 20000));
    list.add(new Employee("Raj", 54, 2000));
    list.add(new Employee("Sayan", 23, 100));

    ArrayList<Employee> newList = list.stream().map(x->{
        return new Employee(x.getName(), x.getId(), x.getSalary()*1.1);
    }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    newList.stream().forEach(System.out::println);


 }   
}
