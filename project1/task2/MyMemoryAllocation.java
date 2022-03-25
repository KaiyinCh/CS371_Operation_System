package task2;

// I would like a simulation class to do most of the work.
class MyMemoryAllocation extends MemoryAllocation {
    String algorithm; //best fit, first fit or next fit
    MyLinkedList free_list;
    MyLinkedList used_list;
    // Strongly recommend you start with printing out the pieces.
    public void print();
    public int alloc(int size) { ...}
  …
    public void free(int address) {...}

}

