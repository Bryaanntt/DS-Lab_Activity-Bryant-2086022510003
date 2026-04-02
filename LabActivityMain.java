package graddle.ds;

public class LabActivityMain {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //Insert at beginning
        System.out.println("Insert at beginning: 20, 10");
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();

        //Insert at end
        System.out.println("\nInsert at end: 30, 40");
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();

        // Search
        System.out.println("\nSearch for 30:");
        System.out.println(list.search(30));

        //Delete 20
        System.out.println("\nDelete 20:");
        list.delete(20);
        list.display();

        //Delete 10
        System.out.println("\nDelete 10:");
        list.delete(10);
        list.display();

        //Search lagi
        System.out.println("\nSearch for 100:");
        System.out.println(list.search(100));
    }
}