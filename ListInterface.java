//
//  Name:       Kwan, Wesley
//  Homework:   3
//  Due:        03/21/20
//  Course:     cs-2400-02
//
//  Description:
//              Interface of the list ADT.
//
public interface ListInterface<T>
{
    /**
     * Adds the specified entry to the end of this list.
     * 
     * @param newEntry the entry to be added to this list
     */
    void add(T newEntry);
    /**
     * Adds the specified entry at the position within the list.
     * 
     * @param givenPosition the position at which the specified
     *                      entry is to be added
     * @param newEntry the entry to be added to this list
     * @throws IndexOutOfBoundsException if givenPosition is less
     *      than 1 or greater than the number of entries plus 1
     */
    void add(int givenPosition, T newEntry);
}
