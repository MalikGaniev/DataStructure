public class HeapApp {
    public static void main(String[] args) {
 MyHeap  heap=new MyHeap(10);
 heap.insert(61);
 heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        System.out.println("Heap value after inserting ");
        heap.printHeap();
        heap.insert(130);
        heap.printHeap();
    }

}
