//
//  Name:       Kwan, Wesley
//  Homework:   3
//  Due:        03/21/20
//  Course:     cs-2400-02
//
//  Description:
//              Checks if DoublyLinkedList works properly.
//
public class DLLCheck
{
    public static void main(String[] args)
    {
        System.out.println("Doubly Linked List by W. Kwan\n");
        
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.add("Item g");
        list.add("Item n");
        list.add(2, "Item e");
        try
        {
            list.add(5, "Item t");
        }
        catch (IndexOutOfBoundsException e)
        {
            list.add(4, "Item t");
        }
        try
        {
            list.add(0, "Item a");
        }
        catch (IndexOutOfBoundsException e)
        {
            list.add(1, "Item a");
        }
        list.add("Item x");
        System.out.println(list);
    }
}