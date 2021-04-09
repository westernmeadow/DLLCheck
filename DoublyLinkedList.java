//
//  Name:       Kwan, Wesley
//  Homework:   3
//  Due:        03/21/20
//  Course:     cs-2400-02
//
//  Description:
//              Doubly linked implementation of ListInterface.
//
public final class DoublyLinkedList<T> implements ListInterface<T>
{
    private DLNode firstNode;
    private DLNode lastNode;
    private int numberOfEntries;

    public DoublyLinkedList()
    {
        firstNode = null;
        lastNode = null;
        numberOfEntries = 0;
    }

    public void add(T newEntry)
    {
        DLNode newNode = new DLNode(newEntry);
        if (numberOfEntries == 0)
        {
            firstNode = newNode;
            lastNode = newNode;
        }
        else
        {
            lastNode.next = newNode;
            newNode.previous = lastNode;
            lastNode = newNode;
        }
        numberOfEntries++;
    }
    
    public void add(int givenPosition, T newEntry)
    {
        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1))
        { 
            DLNode newNode = new DLNode(newEntry);
            if (givenPosition == 1)
            {
                newNode.next = firstNode;
                firstNode.previous = newNode;
                firstNode = newNode;
                numberOfEntries++;
            }
            else if (givenPosition == numberOfEntries + 1)
                add(newEntry);
            else
            {
                DLNode nodeBefore = getNodeAt(givenPosition - 1);
                DLNode nodeAfter = nodeBefore.next;
                newNode.next = nodeAfter;
                nodeAfter.previous = newNode;
                nodeBefore.next = newNode;
                newNode.previous = nodeBefore;
                numberOfEntries++;
            }
        }
        else
            throw new IndexOutOfBoundsException("Illegal position given to add operation."); 
    }
    
    public String toString()
    {
        if (numberOfEntries == 0)
            return "empty list";
            
        String strList = "";
        int position = 1;
        DLNode currentNode = firstNode;
        while (currentNode != null)
        {
            strList += position + " - " + currentNode.data;
            if (currentNode.next != null)
                strList += "\n";
            currentNode = currentNode.next;
            position++;
        }
        return strList;
    }
    
    private DLNode<T> getNodeAt(int givenPosition)
    {
        DLNode currentNode = firstNode;
        for (int counter = 1; counter < givenPosition; counter++)
            currentNode = currentNode.next;
        return currentNode;  
    }
    
    private class DLNode<T>
    {
        private T data;
        private DLNode next;
        private DLNode previous;
        
        private DLNode(T dataPortion)
        {
            this(dataPortion, null, null);
        }
     
        private DLNode(T dataPortion, DLNode<T> nextNode, DLNode<T> previousNode)
        {
            data = dataPortion;
            next = nextNode;
            previous = previousNode;
        }
    }
}
