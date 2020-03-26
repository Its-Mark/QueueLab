import java.util.PriorityQueue;

public class PriorityQueueRunner {
   public static void main(String[] args){
       PriorityQueue<Person> q = new PriorityQueue<>();
       q.add(new Person("Sam", "Smith"));
       q.add(new Person("Charlie", "Black"));
       q.add(new Person("Betty", "Brown"));
       q.add(new Person("Jessica", "Stewart"));
       q.add(new Person("John", "Friday"));
       q.add(new Person("Frank", "Foley"));

       System.out.println("Iteration using for loop");
       for(Person p : q){
           System.out.println(p);
       }

        System.out.println("\nIteration using q.poll()");
       while(!q.isEmpty()){
           System.out.println(q.poll());
       }
   }
}
