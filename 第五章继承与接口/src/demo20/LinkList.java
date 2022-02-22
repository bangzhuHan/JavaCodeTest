package demo20;
import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // use add() method to add elements in the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //  Current list Output
        System.out.println("The Current list is:" + list);

        //  Using poll() method it will retrieve first element
        // with removing the first element from the list
        System.out.println("The First Element In The List is:" + list.poll());

        //  Updated list Output after implementing poll()
        System.out.println("The Updated List after implementing poll() The list is:" + list);
    }

}
