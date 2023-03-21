
public class GenericList <T>{

    private T[] items;
    private int size;
    public GenericList(){
        size=0;
        items=(T[]) new Object[100];
    }

}
