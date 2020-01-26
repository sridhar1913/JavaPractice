package practice.memoryleak;

/**
 * Memory leak program
 * @author spentam
 *
 */
public class MemoryLeakAdder {
       public long addIncremental(long l)
       {
              Long sum=0L;
               sum =sum+l;
               return sum;
       }
       public static void main(String[] args) {
              MemoryLeakAdder adder = new MemoryLeakAdder();
              for(long i = 0; i<1000; i++)
              {
                     adder.addIncremental(i);
                     System.out.println("Memory Leak due to cause of unwanted objects created 1000 times using wrapper classes");
              }
       }
}
